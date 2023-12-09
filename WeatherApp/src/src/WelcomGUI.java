/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author chuna
 */
public class WelcomGUI extends javax.swing.JFrame {

    /**
     * Creates new form Welcom
     */
    public WelcomGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("src/image/100clear.png");
        this.setIconImage(icon.getImage());
        startButton.setVisible(false);
        openDetail();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomGui1 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        welcome1 = new javax.swing.JLabel();
        welcomeGui2 = new javax.swing.JPanel();
        welcome2 = new javax.swing.JLabel();
        welcomeGui3 = new javax.swing.JPanel();
        welcome3 = new javax.swing.JLabel();
        welcomeGui4 = new javax.swing.JPanel();
        welcome4 = new javax.swing.JLabel();
        welcomeGui5 = new javax.swing.JPanel();
        welcome5 = new javax.swing.JLabel();
        welcomeGui6 = new javax.swing.JPanel();
        welcome6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Weather");
        setMaximumSize(new java.awt.Dimension(450, 650));
        setMinimumSize(new java.awt.Dimension(450, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        welcomGui1.setMaximumSize(new java.awt.Dimension(450, 650));
        welcomGui1.setMinimumSize(new java.awt.Dimension(0, 650));
        welcomGui1.setPreferredSize(new java.awt.Dimension(0, 650));
        welcomGui1.setLayout(null);

        startButton.setBackground(new java.awt.Color(255, 255, 204));
        startButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startButton.setText("BẮT ĐẦU");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        welcomGui1.add(startButton);
        startButton.setBounds(170, 410, 110, 40);

        welcome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.png"))); // NOI18N
        welcomGui1.add(welcome1);
        welcome1.setBounds(0, 0, 450, 650);

        getContentPane().add(welcomGui1);
        welcomGui1.setBounds(0, 0, 0, 650);

        welcomeGui2.setBackground(new java.awt.Color(219, 246, 246));
        welcomeGui2.setMaximumSize(new java.awt.Dimension(450, 650));
        welcomeGui2.setMinimumSize(new java.awt.Dimension(0, 650));
        welcomeGui2.setLayout(null);

        welcome2.setBackground(new java.awt.Color(204, 255, 255));
        welcome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2.png"))); // NOI18N
        welcome2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcome2.setName("WEATHERAPP"); // NOI18N
        welcomeGui2.add(welcome2);
        welcome2.setBounds(0, 0, 450, 650);

        getContentPane().add(welcomeGui2);
        welcomeGui2.setBounds(0, 0, 0, 650);

        welcomeGui3.setBackground(new java.awt.Color(219, 246, 246));
        welcomeGui3.setMaximumSize(new java.awt.Dimension(450, 650));
        welcomeGui3.setMinimumSize(new java.awt.Dimension(0, 650));
        welcomeGui3.setLayout(null);

        welcome3.setBackground(new java.awt.Color(204, 255, 255));
        welcome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3.png"))); // NOI18N
        welcome3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcome3.setName("WEATHERAPP"); // NOI18N
        welcomeGui3.add(welcome3);
        welcome3.setBounds(0, 0, 450, 650);

        getContentPane().add(welcomeGui3);
        welcomeGui3.setBounds(0, 0, 0, 650);

        welcomeGui4.setBackground(new java.awt.Color(219, 246, 246));
        welcomeGui4.setMaximumSize(new java.awt.Dimension(450, 650));
        welcomeGui4.setMinimumSize(new java.awt.Dimension(0, 650));
        welcomeGui4.setLayout(null);

        welcome4.setBackground(new java.awt.Color(204, 255, 255));
        welcome4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4.png"))); // NOI18N
        welcome4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcome4.setName("WEATHERAPP"); // NOI18N
        welcomeGui4.add(welcome4);
        welcome4.setBounds(0, 0, 450, 650);

        getContentPane().add(welcomeGui4);
        welcomeGui4.setBounds(0, 0, 0, 650);

        welcomeGui5.setBackground(new java.awt.Color(219, 246, 246));
        welcomeGui5.setMaximumSize(new java.awt.Dimension(450, 650));
        welcomeGui5.setMinimumSize(new java.awt.Dimension(450, 650));
        welcomeGui5.setLayout(null);

        welcome5.setBackground(new java.awt.Color(204, 255, 255));
        welcome5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/5.png"))); // NOI18N
        welcome5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcome5.setName("WEATHERAPP"); // NOI18N
        welcomeGui5.add(welcome5);
        welcome5.setBounds(0, 0, 450, 650);

        getContentPane().add(welcomeGui5);
        welcomeGui5.setBounds(0, 0, 450, 650);

        welcomeGui6.setBackground(new java.awt.Color(219, 246, 246));
        welcomeGui6.setMaximumSize(new java.awt.Dimension(450, 650));
        welcomeGui6.setMinimumSize(new java.awt.Dimension(450, 650));
        welcomeGui6.setPreferredSize(new java.awt.Dimension(450, 650));
        welcomeGui6.setLayout(null);

        welcome6.setBackground(new java.awt.Color(204, 255, 255));
        welcome6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/6.png"))); // NOI18N
        welcome6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcome6.setName("WEATHERAPP"); // NOI18N
        welcomeGui6.add(welcome6);
        welcome6.setBounds(0, 0, 450, 650);

        getContentPane().add(welcomeGui6);
        welcomeGui6.setBounds(0, 0, 450, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openDetail() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 450; i++) {
                    welcomeGui5.setSize(i, 650);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WelcomGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                for (int i = 0; i < 450; i++) {
                    welcomeGui4.setSize(i, 650);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WelcomGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                for (int i = 0; i < 450; i++) {
                    welcomeGui3.setSize(i, 650);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WelcomGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                for (int i = 0; i < 450; i++) {
                    welcomeGui2.setSize(i, 650);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WelcomGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                for (int i = 0; i < 450; i++) {
                    welcomGui1.setSize(i, 650);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WelcomGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                startButton.setVisible(true);
            }
        }).start();
        
    }
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        new MyWeatherGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomGUI().setVisible(true);
               
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton startButton;
    private javax.swing.JPanel welcomGui1;
    private javax.swing.JLabel welcome1;
    private javax.swing.JLabel welcome2;
    private javax.swing.JLabel welcome3;
    private javax.swing.JLabel welcome4;
    private javax.swing.JLabel welcome5;
    private javax.swing.JLabel welcome6;
    private javax.swing.JPanel welcomeGui2;
    private javax.swing.JPanel welcomeGui3;
    private javax.swing.JPanel welcomeGui4;
    private javax.swing.JPanel welcomeGui5;
    private javax.swing.JPanel welcomeGui6;
    // End of variables declaration//GEN-END:variables
}