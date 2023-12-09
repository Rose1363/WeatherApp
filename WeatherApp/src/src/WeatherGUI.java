package src;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.json.simple.JSONObject;

/**
 *
 * @author chuna
 */
public class WeatherGUI extends javax.swing.JFrame {
    private JSONObject weatherData;
    
    /**
     * Creates new form WeatherGUI
     */
    public WeatherGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("src/image/100clear.png");
        this.setIconImage(icon.getImage());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel30 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        soilTemperature = new javax.swing.JLabel();
        cloudCover = new javax.swing.JLabel();
        humidityImage = new javax.swing.JLabel();
        windspeeds = new javax.swing.JLabel();
        windspeedText = new javax.swing.JLabel();
        humidityText = new javax.swing.JLabel();
        windspeedImage = new javax.swing.JLabel();
        humidityPercent = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        weatherConditionDesc = new javax.swing.JLabel();
        temperatureText = new javax.swing.JLabel();
        weatherConditionImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        locationCurrentLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        myWeatherConditionDesc = new javax.swing.JLabel();
        myTemperatureText1 = new javax.swing.JLabel();
        myLocationName = new javax.swing.JLabel();
        viTriCuaToiLabel = new javax.swing.JLabel();
        myDayOrNightLabel = new javax.swing.JLabel();
        myCurrentDateLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        myLocationName2 = new javax.swing.JLabel();
        myWeatherConditionDesc2 = new javax.swing.JLabel();
        myCurrentDateLabel2 = new javax.swing.JLabel();
        myDayOrNightLabel2 = new javax.swing.JLabel();
        myTemperatureText2 = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        myLocationName3 = new javax.swing.JLabel();
        myWeatherConditionDesc3 = new javax.swing.JLabel();
        myCurrentDateLabel3 = new javax.swing.JLabel();
        myDayOrNightLabel3 = new javax.swing.JLabel();
        myTemperatureText3 = new javax.swing.JLabel();
        delete2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();

        jLabel30.setText("jLabel30");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Weather");
        setMaximumSize(new java.awt.Dimension(450, 650));
        setMinimumSize(new java.awt.Dimension(450, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(219, 246, 246));
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 650));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(219, 246, 246));
        jPanel2.setMaximumSize(new java.awt.Dimension(450, 650));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 650));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("12/12/2023");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(350, 50, 80, 16);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(310, 40, 40, 33);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("THỜI TIẾT HIỆN TẠI");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 20, 180, 22);

        jLabel9.setText("Quay lại");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(390, 620, 60, 16);

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));
        jPanel4.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cloud_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(220, 170, 24, 24);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Độ che phủ mây");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(250, 160, 127, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thermostat_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jPanel4.add(jLabel12);
        jLabel12.setBounds(220, 240, 20, 24);

        soilTemperature.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        soilTemperature.setText("30℃");
        jPanel4.add(soilTemperature);
        soilTemperature.setBounds(250, 260, 70, 21);

        cloudCover.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cloudCover.setText("90%");
        jPanel4.add(cloudCover);
        cloudCover.setBounds(250, 190, 80, 21);

        humidityImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/humidity_mid_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jPanel4.add(humidityImage);
        humidityImage.setBounds(20, 170, 20, 30);

        windspeeds.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        windspeeds.setText("15Km/h");
        jPanel4.add(windspeeds);
        windspeeds.setBounds(50, 260, 90, 21);

        windspeedText.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        windspeedText.setForeground(new java.awt.Color(102, 102, 102));
        windspeedText.setText("Tốc độ gió");
        jPanel4.add(windspeedText);
        windspeedText.setBounds(50, 230, 83, 23);

        humidityText.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        humidityText.setForeground(new java.awt.Color(102, 102, 102));
        humidityText.setText("Độ ẩm");
        jPanel4.add(humidityText);
        humidityText.setBounds(50, 160, 60, 24);

        windspeedImage.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        windspeedImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/air_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        windspeedImage.setToolTipText("");
        jPanel4.add(windspeedImage);
        windspeedImage.setBounds(20, 240, 24, 24);

        humidityPercent.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        humidityPercent.setText("100%");
        jPanel4.add(humidityPercent);
        humidityPercent.setBounds(50, 190, 41, 21);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Nhiệt độ đất");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(250, 230, 96, 23);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        weatherConditionDesc.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        weatherConditionDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherConditionDesc.setText("Trời quang đãng");
        weatherConditionDesc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(weatherConditionDesc);
        weatherConditionDesc.setBounds(110, 98, 180, 32);

        temperatureText.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        temperatureText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temperatureText.setText("10℃");
        jPanel7.add(temperatureText);
        temperatureText.setBounds(150, 50, 200, 40);

        weatherConditionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/100cloudy.png"))); // NOI18N
        weatherConditionImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        weatherConditionImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        weatherConditionImage.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel7.add(weatherConditionImage);
        weatherConditionImage.setBounds(80, 10, 110, 110);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(0, 0, 410, 140);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(0, 140, 390, 3);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(30, 70, 390, 300);

        jPanel5.setBackground(new java.awt.Color(130, 180, 255));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DỰ BÁO TRONG 3 NGÀY TỚI");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(30, 400, 390, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("12/12/2023");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(6, 39, 90, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("13/12/2023");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(6, 77, 80, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("14/12/2023");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(6, 115, 80, 20);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clearmini.png"))); // NOI18N
        jPanel3.add(jLabel18);
        jLabel18.setBounds(120, 40, 20, 20);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clearmini.png"))); // NOI18N
        jPanel3.add(jLabel19);
        jLabel19.setBounds(120, 70, 20, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clearmini.png"))); // NOI18N
        jPanel3.add(jLabel20);
        jLabel20.setBounds(120, 110, 20, 30);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("18℃");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(187, 42, 50, 16);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("28℃");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(312, 42, 50, 16);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("17℃");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(187, 80, 50, 16);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("38℃");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(312, 80, 50, 16);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("19℃");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(187, 118, 50, 16);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("23℃");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(300, 114, 70, 20);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel27.setText("NGÀY");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(30, 14, 28, 20);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel28.setText("NHIỆT ĐỘ THẤP NHẤT");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(160, 10, 110, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel29.setText("NHIỆT ĐỘ CAO NHẤT");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(280, 10, 110, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, 430, 390, 150);

        locationCurrentLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        locationCurrentLabel.setText("Địa điểm");
        jPanel2.add(locationCurrentLabel);
        locationCurrentLabel.setBounds(40, 40, 160, 25);

        jLabel7.setText("Đặt làm vị trí của tôi");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 620, 120, 16);

        jLabel4.setText("xem nhanh");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(210, 620, 90, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(2, 2, 0, 650);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(null);

        myWeatherConditionDesc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        myWeatherConditionDesc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myWeatherConditionDesc.setText("Descreption");
        myWeatherConditionDesc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(myWeatherConditionDesc);
        myWeatherConditionDesc.setBounds(10, 80, 150, 20);

        myTemperatureText1.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        myTemperatureText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myTemperatureText1.setText("0℃");
        jPanel6.add(myTemperatureText1);
        myTemperatureText1.setBounds(200, 50, 180, 50);

        myLocationName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        myLocationName.setForeground(new java.awt.Color(0, 51, 102));
        myLocationName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myLocationName.setText("LOCATION NAME");
        jPanel6.add(myLocationName);
        myLocationName.setBounds(10, 30, 180, 30);
        myLocationName.getAccessibleContext().setAccessibleName("locationName");

        viTriCuaToiLabel.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        viTriCuaToiLabel.setForeground(new java.awt.Color(0, 51, 102));
        viTriCuaToiLabel.setText("VỊ TRÍ CỦA TÔI");
        jPanel6.add(viTriCuaToiLabel);
        viTriCuaToiLabel.setBounds(10, 10, 150, 23);

        myDayOrNightLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        myDayOrNightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jPanel6.add(myDayOrNightLabel);
        myDayOrNightLabel.setBounds(230, 0, 40, 33);

        myCurrentDateLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        myCurrentDateLabel.setForeground(new java.awt.Color(0, 51, 102));
        myCurrentDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myCurrentDateLabel.setText("dd/mm/yyyy");
        jPanel6.add(myCurrentDateLabel);
        myCurrentDateLabel.setBounds(280, 0, 90, 30);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(45, 110, 370, 120);

        jPanel9.setBackground(new java.awt.Color(219, 246, 246));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(null);

        myLocationName2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        myLocationName2.setForeground(new java.awt.Color(0, 51, 102));
        myLocationName2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel9.add(myLocationName2);
        myLocationName2.setBounds(10, 20, 180, 30);

        myWeatherConditionDesc2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        myWeatherConditionDesc2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myWeatherConditionDesc2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(myWeatherConditionDesc2);
        myWeatherConditionDesc2.setBounds(10, 70, 150, 20);

        myCurrentDateLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        myCurrentDateLabel2.setForeground(new java.awt.Color(0, 51, 102));
        myCurrentDateLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel9.add(myCurrentDateLabel2);
        myCurrentDateLabel2.setBounds(280, 0, 90, 30);

        myDayOrNightLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel9.add(myDayOrNightLabel2);
        myDayOrNightLabel2.setBounds(230, 0, 40, 33);

        myTemperatureText2.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        myTemperatureText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(myTemperatureText2);
        myTemperatureText2.setBounds(200, 50, 180, 50);

        delete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel9.add(delete);
        delete.setBounds(340, 100, 30, 20);

        jPanel1.add(jPanel9);
        jPanel9.setBounds(45, 250, 370, 120);

        jPanel10.setBackground(new java.awt.Color(219, 246, 246));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(null);

        myLocationName3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        myLocationName3.setForeground(new java.awt.Color(0, 51, 102));
        myLocationName3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel10.add(myLocationName3);
        myLocationName3.setBounds(10, 20, 180, 30);

        myWeatherConditionDesc3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        myWeatherConditionDesc3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myWeatherConditionDesc3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(myWeatherConditionDesc3);
        myWeatherConditionDesc3.setBounds(10, 70, 150, 20);

        myCurrentDateLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        myCurrentDateLabel3.setForeground(new java.awt.Color(0, 51, 102));
        myCurrentDateLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel10.add(myCurrentDateLabel3);
        myCurrentDateLabel3.setBounds(280, 0, 90, 30);

        myDayOrNightLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel10.add(myDayOrNightLabel3);
        myDayOrNightLabel3.setBounds(230, 0, 40, 33);

        myTemperatureText3.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        myTemperatureText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(myTemperatureText3);
        myTemperatureText3.setBounds(200, 50, 180, 50);

        delete2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        delete2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete2MouseClicked(evt);
            }
        });
        jPanel10.add(delete2);
        delete2.setBounds(330, 100, 40, 20);

        jPanel1.add(jPanel10);
        jPanel10.setBounds(45, 390, 370, 120);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton1StateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 18, 60, 50);

        searchTextField.setFont(new java.awt.Font("Dubai Light", 0, 24)); // NOI18N
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchTextField);
        searchTextField.setBounds(25, 18, 341, 50);

        jPanel11.setPreferredSize(new java.awt.Dimension(450, 650));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void setIcon(String key, JLabel label, String path1, String path2,String path3,String path4){
        String weatherCondition = (String) weatherData.get(key);

        switch (weatherCondition){
            case "Trời quang đãng":
            label.setIcon(new javax.swing.ImageIcon(path1));            
            break;
            case "Có mây":
            label.setIcon(new javax.swing.ImageIcon(path2));           
            break;
            case "Có mưa":
            label.setIcon(new javax.swing.ImageIcon(path3));           
            break;
            case "Có tuyết":
            label.setIcon(new javax.swing.ImageIcon(path4));           
            break;
        }
    }
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      
        closeDetail();
        
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl= "jdbc:sqlserver://DESKTOP-A9JVF1E\\SQLEXPRESS:1433;databaseName=Location;user=sa;password=12";
                Connection con = DriverManager.getConnection(dbUrl);
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("select * from DiaDiem");
                
                if(rs.next()){
                    myLocationName.setText(rs.getString(2).trim().toUpperCase());

                    weatherData = WeatherApp.getWeatherData(rs.getString(2).trim());
                    myWeatherConditionDesc.setText((String) weatherData.get("weather_condition"));
        
                    double temperature = (double) weatherData.get("temperature");
                    myTemperatureText1.setText(temperature + "℃");


                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");      
                    String formattedDateTime = currentDate.format(formatterDate);

                    myCurrentDateLabel.setText(formattedDateTime.substring(0, 10));
                    long str = (long) weatherData.get("isDay");
                    if(str == 1){
                        myDayOrNightLabel.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
                    }else myDayOrNightLabel.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
                            }

                if(rs.next()){
                    
                    jLabel9.setBackground(Color.WHITE);
                    myLocationName2.setText(rs.getString(2).trim().toUpperCase());

                    weatherData = WeatherApp.getWeatherData(rs.getString(2).trim());
                    myWeatherConditionDesc2.setText((String) weatherData.get("weather_condition"));
        
                    double temperature = (double) weatherData.get("temperature");
                    myTemperatureText2.setText(temperature + "℃");
        
       
                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");      
                    String formattedDateTime = currentDate.format(formatterDate);

                    myCurrentDateLabel2.setText(formattedDateTime.substring(0, 10));
                    long str = (long) weatherData.get("isDay");
                    if(str == 1){
                        myDayOrNightLabel2.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
                    }else myDayOrNightLabel2.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
                    
                    
                    delete.setIcon(new javax.swing.ImageIcon("src/image/x.png"));
                }
                
                if(rs.next()){
                    jLabel10.setBackground(Color.WHITE);
                    myLocationName3.setText(rs.getString(2).trim().toUpperCase());

                    weatherData = WeatherApp.getWeatherData(rs.getString(2).trim());
                    myWeatherConditionDesc3.setText((String) weatherData.get("weather_condition"));
        
                    double temperature = (double) weatherData.get("temperature");
                    myTemperatureText3.setText(temperature + "℃");


                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");      
                    String formattedDateTime = currentDate.format(formatterDate);

                    myCurrentDateLabel3.setText(formattedDateTime.substring(0, 10));
                    long str = (long) weatherData.get("isDay");
                    if(str == 1){
                        myDayOrNightLabel3.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
                    }else myDayOrNightLabel3.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
                    
                    jLabel10.setBackground(Color.WHITE);
                    delete2.setIcon(new javax.swing.ImageIcon("src/image/x.png"));
                }
                con.close();
                }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
                
       try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl= "jdbc:sqlserver://DESKTOP-A9JVF1E\\SQLEXPRESS:1433;databaseName=Location;user=sa;password=12";
                Connection con = DriverManager.getConnection(dbUrl);
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("select * from DiaDiem");
                
                if(rs.next()){
                    jPanel6.setBackground(new Color(255,255,255));
                    myLocationName.setText(rs.getString(2).trim().toUpperCase());

                    weatherData = WeatherApp.getWeatherData(rs.getString(2).trim());
                    myWeatherConditionDesc.setText((String) weatherData.get("weather_condition"));
        
                    double temperature = (double) weatherData.get("temperature");
                    myTemperatureText1.setText(temperature + "℃");


                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");      
                    String formattedDateTime = currentDate.format(formatterDate);

                    myCurrentDateLabel.setText(formattedDateTime.substring(0, 10));
                    long str = (long) weatherData.get("isDay");
                    if(str == 1){
                        myDayOrNightLabel.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
                    }else myDayOrNightLabel.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
                            }

                if(rs.next()){
                    jPanel9.setBackground(new Color(255,255,255));
                    jPanel9.setEnabled(true);
                    myLocationName2.setText(rs.getString(2).trim().toUpperCase());

                    weatherData = WeatherApp.getWeatherData(rs.getString(2).trim());
                    myWeatherConditionDesc2.setText((String) weatherData.get("weather_condition"));
        
                    double temperature = (double) weatherData.get("temperature");
                    myTemperatureText2.setText(temperature + "℃");
        
       
                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");      
                    String formattedDateTime = currentDate.format(formatterDate);

                    myCurrentDateLabel2.setText(formattedDateTime.substring(0, 10));
                    long str = (long) weatherData.get("isDay");
                    if(str == 1){
                        myDayOrNightLabel2.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
                    }else myDayOrNightLabel2.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
                    jLabel9.setBackground(Color.WHITE);
                    delete.setIcon(new javax.swing.ImageIcon("src/image/x.png"));
                }
                
                if(rs.next()){
                    jPanel10.setBackground(new Color(255,255,255));
                    jPanel10.setEnabled(true);
                    myLocationName3.setText(rs.getString(2).trim().toUpperCase());

                    weatherData = WeatherApp.getWeatherData(rs.getString(2).trim());
                    myWeatherConditionDesc3.setText((String) weatherData.get("weather_condition"));
        
                    double temperature = (double) weatherData.get("temperature");
                    myTemperatureText3.setText(temperature + "℃");


                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");      
                    String formattedDateTime = currentDate.format(formatterDate);

                    myCurrentDateLabel3.setText(formattedDateTime.substring(0, 10));
                    long str = (long) weatherData.get("isDay");
                    if(str == 1){
                        myDayOrNightLabel3.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
                    }else myDayOrNightLabel3.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
                    jLabel10.setBackground(Color.WHITE);
                    delete2.setIcon(new javax.swing.ImageIcon("src/image/x.png"));
                }
                con.close();
                }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
       
        
        
                
    }//GEN-LAST:event_formWindowOpened

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        new MyWeatherGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        closeDetail();
        
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl= "jdbc:sqlserver://DESKTOP-A9JVF1E\\SQLEXPRESS:1433;databaseName=Location;user=sa;password=12";
                Connection con = DriverManager.getConnection(dbUrl);
                Statement s = con.createStatement();
                
                ResultSet rs = s.executeQuery("select STT from DiaDiem Where STT = 1");
                rs.next();
                if(!(rs.getString(1).equals(null))){
                   
                        s.execute("delete diadiem where STT = 1");
            
        
                }
                
                String l = "INSERT INTO DiaDiem values ("  + 1 + ","+ "'" + searchTextField.getText() + "'" +")";
                System.out.println(l);
                s.executeUpdate(l);
                
                con.close();
                }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
        new MyWeatherGUI().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl= "jdbc:sqlserver://DESKTOP-A9JVF1E\\SQLEXPRESS:1433;databaseName=Location;user=sa;password=12";
                Connection con = DriverManager.getConnection(dbUrl);
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("select Max(STT) from DiaDiem");
                int t;
                rs.next();
                
                    t = rs.getInt(1);
                t = t + 1;
                if(t>3){
                    JOptionPane.showMessageDialog(this, "Danh sách đầy không thể thêm!");
                }
                else {
                String l = "INSERT INTO DiaDiem values ("  + t + ","+ "'" + searchTextField.getText() + "'" +")";
                System.out.println(l);
                s.executeUpdate(l);                
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                }
                con.close();
                }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
       
        
        
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        
        String lc = myLocationName2.getText().trim();
        openDetail();
        weatherData = WeatherApp.getWeatherData(lc);
        locationCurrentLabel.setText(lc.toUpperCase());
 
        setIcon("weather_condition", weatherConditionImage, "src/image/100clear.png","src/image/100cloudy.png", "src/image/100rainy.png", "src/image/100snow.png");
        
        setIcon("weather_condition1", jLabel18, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        setIcon("weather_condition2", jLabel19, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        setIcon("weather_condition3", jLabel20, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        
        
        weatherConditionDesc.setText((String) weatherData.get("weather_condition"));
        double temperature = (double) weatherData.get("temperature");
        temperatureText.setText(temperature + "℃");
        long humidity = (long) weatherData.get("humidity");
        humidityPercent.setText(humidity + " %");
        
        double windspeed = (double) weatherData.get("windspeed");
        windspeeds.setText(windspeed + "km/h");
       
        long cloudCoverData = (long) weatherData.get("cloudCoverData");
        cloudCover.setText(cloudCoverData + "%");
        
        double soilTemperatureData = (double) weatherData.get("soilTemperature");
        soilTemperature.setText(soilTemperatureData + "℃");
        
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       
        String formattedDateTime = currentDate.format(formatterDate);
        
        jLabel3.setText(formattedDateTime.substring(0, 10));
        long str = (long) weatherData.get("isDay");
        if(str == 1){
            jLabel2.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
        }else jLabel2.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
        

        String date1 = (String) weatherData.get("date1");
        jLabel15.setText(date1);
        String date2 = (String) weatherData.get("date2");
        jLabel16.setText(date2);
        String date3 = (String) weatherData.get("date3");
        jLabel17.setText(date3);
        
        double temperatureMax1 = (double) weatherData.get("temperatureMax1");
        jLabel22.setText(temperatureMax1 + " ℃");
        double temperatureMax2 = (double) weatherData.get("temperatureMax2");
        jLabel24.setText(temperatureMax2 + " ℃");
        double temperatureMax3 = (double) weatherData.get("temperatureMax3");
        jLabel26.setText(temperatureMax3 + " ℃");
        
        
        double temperatureMin1 = (double) weatherData.get("temperatureMin1");
        jLabel21.setText(temperatureMin1 + " ℃");
        double temperatureMin2 = (double) weatherData.get("temperatureMin2");
        jLabel23.setText(temperatureMin2 + " ℃");
        double temperatureMin3 = (double) weatherData.get("temperatureMin3");
        jLabel25.setText(temperatureMin3 + " ℃");
        
        
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        String lc = myLocationName3.getText();
        openDetail();
        weatherData = WeatherApp.getWeatherData(lc);
        locationCurrentLabel.setText(lc.toUpperCase());
 
        setIcon("weather_condition", weatherConditionImage, "src/image/100clear.png","src/image/100cloudy.png", "src/image/100rainy.png", "src/image/100snow.png");
        
        setIcon("weather_condition1", jLabel18, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        setIcon("weather_condition2", jLabel19, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        setIcon("weather_condition3", jLabel20, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        
        
        weatherConditionDesc.setText((String) weatherData.get("weather_condition"));
        double temperature = (double) weatherData.get("temperature");
        temperatureText.setText(temperature + "℃");
        long humidity = (long) weatherData.get("humidity");
        humidityPercent.setText(humidity + " %");
        
        double windspeed = (double) weatherData.get("windspeed");
        windspeeds.setText(windspeed + "km/h");
       
        long cloudCoverData = (long) weatherData.get("cloudCoverData");
        cloudCover.setText(cloudCoverData + "%");
        
        double soilTemperatureData = (double) weatherData.get("soilTemperature");
        soilTemperature.setText(soilTemperatureData + "℃");
        
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       
        String formattedDateTime = currentDate.format(formatterDate);
        
        jLabel3.setText(formattedDateTime.substring(0, 10));
        long str = (long) weatherData.get("isDay");
        if(str == 1){
            jLabel2.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
        }else jLabel2.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
        

        String date1 = (String) weatherData.get("date1");
        jLabel15.setText(date1);
        String date2 = (String) weatherData.get("date2");
        jLabel16.setText(date2);
        String date3 = (String) weatherData.get("date3");
        jLabel17.setText(date3);
        
        double temperatureMax1 = (double) weatherData.get("temperatureMax1");
        jLabel22.setText(temperatureMax1 + " ℃");
        double temperatureMax2 = (double) weatherData.get("temperatureMax2");
        jLabel24.setText(temperatureMax2 + " ℃");
        double temperatureMax3 = (double) weatherData.get("temperatureMax3");
        jLabel26.setText(temperatureMax3 + " ℃");
        
        
        double temperatureMin1 = (double) weatherData.get("temperatureMin1");
        jLabel21.setText(temperatureMin1 + " ℃");
        double temperatureMin2 = (double) weatherData.get("temperatureMin2");
        jLabel23.setText(temperatureMin2 + " ℃");
        double temperatureMin3 = (double) weatherData.get("temperatureMin3");
        jLabel25.setText(temperatureMin3 + " ℃");
        
    }//GEN-LAST:event_jPanel10MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl= "jdbc:sqlserver://DESKTOP-A9JVF1E\\SQLEXPRESS:1433;databaseName=Location;user=sa;password=12";
                Connection con = DriverManager.getConnection(dbUrl);
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("select Max(STT) from DiaDiem");
                int t;
                rs.next();
                
                    t = rs.getInt(1);
                t = t + 1;
                
                String l = "Delete DiaDiem where tenDiaDiem = " + "'"+ myLocationName2.getText().toLowerCase()+ "'";
                System.out.println(l);
                s.executeUpdate(l);                
                myCurrentDateLabel2.setText("");
                myDayOrNightLabel2.setIcon(null);
                myLocationName2.setText("");
                myTemperatureText2.setText("");
                myWeatherConditionDesc2.setText("");
                delete.setIcon(null);
                jPanel9.setBackground(new Color(219,246,246));
                con.close();
                }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_deleteMouseClicked

    private void delete2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseClicked
        // TODO add your handling code here:
        
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl= "jdbc:sqlserver://DESKTOP-A9JVF1E\\SQLEXPRESS:1433;databaseName=Location;user=sa;password=12";
                Connection con = DriverManager.getConnection(dbUrl);
                Statement s = con.createStatement();
                
                String l = "Delete DiaDiem where tenDiaDiem = " + "'"+ myLocationName3.getText().toLowerCase()+ "'";
                System.out.println(l);
                s.executeUpdate(l);                
                myCurrentDateLabel3.setText("");
                myDayOrNightLabel3.setIcon(null);
                myLocationName3.setText("");
                myTemperatureText3.setText("");
                myWeatherConditionDesc3.setText("");
                delete2.setIcon(null);
                jPanel10.setBackground(new Color(219,246,246));
                con.close();
                }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_delete2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userInput = searchTextField.getText().trim();
        
        
        
        if(userInput.replaceAll("\\s", "").length() <= 0){
            JOptionPane.showMessageDialog(this, "Địa điểm đã nhập không hợp lệ!\nVui lòng nhập lại!");
           
            searchTextField.setText("");
            return;
        }
        
        if(WeatherApp.getLocationData(userInput)!=null){           
            weatherData = WeatherApp.getWeatherData(userInput);
            locationCurrentLabel.setText(userInput.toUpperCase());
        }else {
            JOptionPane.showMessageDialog(this, "Địa điểm đã nhập không tồn tại!\nVui lòng nhập lại!");
            
            searchTextField.setText("");
            return;
        }
        openDetail();
        

        
        setIcon("weather_condition", weatherConditionImage, "src/image/100clear.png","src/image/100cloudy.png", "src/image/100rainy.png", "src/image/100snow.png");
        
        setIcon("weather_condition1", jLabel18, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        setIcon("weather_condition2", jLabel19, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        setIcon("weather_condition3", jLabel20, "src/image/clearmini.png","src/image/cloudmini.png", "src/image/rainymini.png", "src/image/snowmini.png");
        
        
        weatherConditionDesc.setText((String) weatherData.get("weather_condition"));
        double temperature = (double) weatherData.get("temperature");
        temperatureText.setText(temperature + "℃");
        long humidity = (long) weatherData.get("humidity");
        humidityPercent.setText(humidity + " %");
        
        double windspeed = (double) weatherData.get("windspeed");
        windspeeds.setText(windspeed + "km/h");
       
        long cloudCoverData = (long) weatherData.get("cloudCoverData");
        cloudCover.setText(cloudCoverData + "%");
        
        double soilTemperatureData = (double) weatherData.get("soilTemperature");
        soilTemperature.setText(soilTemperatureData + "℃");
        
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       
        String formattedDateTime = currentDate.format(formatterDate);
        
        jLabel3.setText(formattedDateTime.substring(0, 10));
        long str = (long) weatherData.get("isDay");
        if(str == 1){
            jLabel2.setIcon(new javax.swing.ImageIcon("src/image/day.png"));
        }else jLabel2.setIcon(new javax.swing.ImageIcon("src/image/night.png"));
        

        String date1 = (String) weatherData.get("date1");
        jLabel15.setText(date1);
        String date2 = (String) weatherData.get("date2");
        jLabel16.setText(date2);
        String date3 = (String) weatherData.get("date3");
        jLabel17.setText(date3);
        
        double temperatureMax1 = (double) weatherData.get("temperatureMax1");
        jLabel22.setText(temperatureMax1 + " ℃");
        double temperatureMax2 = (double) weatherData.get("temperatureMax2");
        jLabel24.setText(temperatureMax2 + " ℃");
        double temperatureMax3 = (double) weatherData.get("temperatureMax3");
        jLabel26.setText(temperatureMax3 + " ℃");
        
        
        double temperatureMin1 = (double) weatherData.get("temperatureMin1");
        jLabel21.setText(temperatureMin1 + " ℃");
        double temperatureMin2 = (double) weatherData.get("temperatureMin2");
        jLabel23.setText(temperatureMin2 + " ℃");
        double temperatureMin3 = (double) weatherData.get("temperatureMin3");
        jLabel25.setText(temperatureMin3 + " ℃");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cloudCover;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel delete2;
    private javax.swing.JLabel humidityImage;
    private javax.swing.JLabel humidityPercent;
    private javax.swing.JLabel humidityText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel locationCurrentLabel;
    private javax.swing.JLabel myCurrentDateLabel;
    private javax.swing.JLabel myCurrentDateLabel2;
    private javax.swing.JLabel myCurrentDateLabel3;
    private javax.swing.JLabel myDayOrNightLabel;
    private javax.swing.JLabel myDayOrNightLabel2;
    private javax.swing.JLabel myDayOrNightLabel3;
    private javax.swing.JLabel myLocationName;
    private javax.swing.JLabel myLocationName2;
    private javax.swing.JLabel myLocationName3;
    private javax.swing.JLabel myTemperatureText1;
    private javax.swing.JLabel myTemperatureText2;
    private javax.swing.JLabel myTemperatureText3;
    private javax.swing.JLabel myWeatherConditionDesc;
    private javax.swing.JLabel myWeatherConditionDesc2;
    private javax.swing.JLabel myWeatherConditionDesc3;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel soilTemperature;
    private javax.swing.JLabel temperatureText;
    private javax.swing.JLabel viTriCuaToiLabel;
    private javax.swing.JLabel weatherConditionDesc;
    private javax.swing.JLabel weatherConditionImage;
    private javax.swing.JLabel windspeedImage;
    private javax.swing.JLabel windspeedText;
    private javax.swing.JLabel windspeeds;
    // End of variables declaration//GEN-END:variables

    private void openDetail() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 450; i++) {
                    jPanel2.setSize(i, 650);
                   
                }
            }
        }).start();
        
    }
    private void closeDetail() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 450; i > 0; i--) {
                    jPanel2.setSize(i, 650);
                                    }
            }
        }).start();
        
    }
    
    
}
