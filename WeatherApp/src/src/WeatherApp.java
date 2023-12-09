package src;

import java.io.BufferedReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import javax.swing.Timer;

public class WeatherApp {
    public static JSONObject getWeatherData(String locationName){
        JSONArray locationData = getLocationData(locationName);

        JSONObject location = (JSONObject) locationData.get(0);
        double latitude = (double) location.get("latitude");
        double longitude = (double) location.get("longitude");

        String urlString = "https://api.open-meteo.com/v1/forecast?"+
                "latitude=" + latitude + "&longitude=" + longitude +
                "&current=is_day"
                + "&hourly=temperature_2m,relative_humidity_2m,weather_code,cloud_cover,wind_speed_10m,soil_temperature_0cm"
                + "&daily=weather_code,temperature_2m_max,temperature_2m_min,uv_index_max&timezone=Asia%2FBangkok";


        try {
            HttpURLConnection conn = fetchApiResponse(urlString);

            if(conn.getResponseCode() != 200){
                System.out.println("Error: Could not connect to API");
                return null;
            }

            StringBuilder resultJson = new StringBuilder();
            Scanner scanner = new Scanner(conn.getInputStream());
            while(scanner.hasNext()){
                resultJson.append(scanner.nextLine());
            }
            scanner.close();

            conn.disconnect();

            JSONParser parser = new JSONParser();
            JSONObject resultJsonObj = (JSONObject) parser.parse(String.valueOf(resultJson));

            JSONObject hourly = (JSONObject) resultJsonObj.get("hourly");

            JSONArray time = (JSONArray) hourly.get("time");
            int index = findIndexOfCurrentTime(time);

            JSONArray temperatureData = (JSONArray) hourly.get("temperature_2m");
            double temperature = (double) temperatureData.get(index);

            JSONArray weathercode = (JSONArray) hourly.get("weather_code");
            String weatherCondition = convertWeatherCode((long) weathercode.get(index));

            JSONArray relativeHumidity = (JSONArray) hourly.get("relative_humidity_2m");
            long humidity = (long) relativeHumidity.get(index);

            JSONArray windspeedData = (JSONArray) hourly.get("wind_speed_10m");
            double windspeed = (double) windspeedData.get(index);

            JSONArray soilTemperatureData = (JSONArray) hourly.get("soil_temperature_0cm");
            double soilTemperature = (double) soilTemperatureData.get(index);
            
            JSONArray cloudCoverData = (JSONArray) hourly.get("cloud_cover");
            long cloudCover = (long) cloudCoverData.get(index);
            
            
            JSONObject current = (JSONObject) resultJsonObj.get("current");
            Object isDay = current.get("is_day");
            
            JSONObject daily = (JSONObject) resultJsonObj.get("daily");
            JSONArray dateData = (JSONArray) daily.get("time");
            String date1 = (String) dateData.get(1);
            String date2 = (String) dateData.get(2);
            String date3 = (String) dateData.get(3);
            
            

            JSONArray temperatureMaxData = (JSONArray) daily.get("temperature_2m_max");
            double temperatureMax1 = (double) temperatureMaxData.get(1);
            double temperatureMax2 = (double) temperatureMaxData.get(2);
            double temperatureMax3 = (double) temperatureMaxData.get(3);
            
            JSONArray temperatureMinData = (JSONArray) daily.get("temperature_2m_min");
            double temperatureMin1 = (double) temperatureMinData.get(1);
            double temperatureMin2 = (double) temperatureMinData.get(2);
            double temperatureMin3 = (double) temperatureMinData.get(3);

            JSONArray weathercodeData = (JSONArray) daily.get("weather_code");
            String weatherCondition1 = convertWeatherCode((long) weathercodeData.get(1));
            String weatherCondition2 = convertWeatherCode((long) weathercodeData.get(2));
            String weatherCondition3 = convertWeatherCode((long) weathercodeData.get(3));

            
            JSONObject weatherData = new JSONObject();
            weatherData.put("temperature", temperature);
            weatherData.put("weather_condition", weatherCondition);
            weatherData.put("humidity", humidity);
            weatherData.put("windspeed", windspeed);
            weatherData.put("isDay", isDay);
            weatherData.put("soilTemperature", soilTemperature);
            weatherData.put("cloudCoverData", cloudCover);
           
            weatherData.put("date1", date1);
            weatherData.put("date2", date2);
            weatherData.put("date3", date3);
            
            weatherData.put("weather_condition1", weatherCondition1);
            weatherData.put("weather_condition2", weatherCondition2);
            weatherData.put("weather_condition3", weatherCondition3);
            
            weatherData.put("temperatureMax1", temperatureMax1);
            weatherData.put("temperatureMax2", temperatureMax2);
            weatherData.put("temperatureMax3", temperatureMax3);
            
            weatherData.put("temperatureMin1", temperatureMin1);
            weatherData.put("temperatureMin2", temperatureMin2);
            weatherData.put("temperatureMin3", temperatureMin3);
           
            return weatherData;


        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    
    
    private static String convertWeatherCode(long weathercode) {
        String weatherCondition = "";
        if(weathercode == 0L || weathercode == 1L){
            weatherCondition = "Trời quang đãng";
        }else if(weathercode <= 3L && weathercode > 1L) {
            weatherCondition = "Có mây";
        }else if((weathercode >= 51L && weathercode <= 67L)
                || (weathercode >= 80L && weathercode <= 82L)) {
            weatherCondition = "Có mưa";
        }else if(weathercode >= 71L && weathercode <= 77L) {
            weatherCondition = "Có tuyết";
        }
        return weatherCondition;
    }

    private static int findIndexOfCurrentTime(JSONArray timeList) {
        String currentTime = getCurrentTime();

        for (int i = 0; i < timeList.size(); i++) {
            String time = (String) timeList.get(i);
            if(time.equalsIgnoreCase(currentTime)){
                return i;
            }
        }
        return 0;
    }

    public static String getCurrentTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH':00'");


        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }

    public static JSONArray getLocationData(String locationName){
        locationName = locationName.replaceAll(" ", "+");

        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name="+
                locationName + "&count=10&language=en&format=json";
        try{
            HttpURLConnection conn = fetchApiResponse(urlString);

            if(conn.getResponseCode() != 200){
                System.out.println("Error: Could not connet to API");
                return null;

            }else{
                StringBuilder resultJson = new StringBuilder();
                Scanner scanner = new Scanner(conn.getInputStream());

                while(scanner.hasNext()){
                    resultJson.append(scanner.nextLine());
                }
                scanner.close();

                conn.disconnect();

                JSONParser parser = new JSONParser();
                JSONObject resultJsonObj = (JSONObject) parser.parse(String.valueOf(resultJson));

                JSONArray locationData = (JSONArray) resultJsonObj.get("results");
                return locationData;
            }

        }catch (Exception e){
            return null;
        }
        
    }

    private  static HttpURLConnection fetchApiResponse(String urlString){
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            conn.connect();
            return conn;
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
