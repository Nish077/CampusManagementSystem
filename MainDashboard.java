/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package campusconnectjava;

import campusconnectjava.Client.Cafeteria.MenuPageCafe;
import campusconnectjava.Client.Timetable.TimetableOption;
import campusconnectjava.Client.UserProfile;
import static campusconnectjava.SignupPage.Prn;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author hp
 */
public class MainDashboard extends javax.swing.JFrame {

    public static String mainId;

   
    public MainDashboard(String mainid) {
        initComponents();
        this.setLocationRelativeTo(null);
        profileLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Assets/Profile.png")));
        this.mainId = mainid; // Store the passed PRN in userId variable
        WelcomeMessageTxt.setText(mainid); // Display the PRN in a welcome message or wherever needed
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        mainCloseButton = new javax.swing.JLabel();
        profileLogo = new javax.swing.JLabel();
        mainCcpLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        dashboardSidePanel1 = new javax.swing.JLabel();
        dashboardSidePanel2 = new javax.swing.JLabel();
        dashboardSidePanel3 = new javax.swing.JLabel();
        dashboardSidePanel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        WelcomeMessageTxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1072, 687));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 608));

        jPanel3.setBackground(new java.awt.Color(76, 34, 34));

        mainCloseButton.setBackground(new java.awt.Color(255, 130, 130));
        mainCloseButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        mainCloseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainCloseButton.setText("X");
        mainCloseButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        mainCloseButton.setOpaque(true);
        mainCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainCloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainCloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainCloseButtonMouseExited(evt);
            }
        });

        profileLogo.setBackground(new java.awt.Color(255, 255, 255));
        profileLogo.setForeground(new java.awt.Color(255, 255, 255));
        profileLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusconnectjava/Assets/Profile.png"))); // NOI18N
        profileLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profileLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileLogo.setOpaque(true);
        profileLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileLogoMouseClicked(evt);
            }
        });

        mainCcpLogo.setBackground(new java.awt.Color(255, 255, 255));
        mainCcpLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainCcpLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusconnectjava/Assets/mainLogo.png"))); // NOI18N
        mainCcpLogo.setFocusCycleRoot(true);
        mainCcpLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainCcpLogo.setIconTextGap(0);
        mainCcpLogo.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(189, 120, 120));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CampusConnect Pro");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(mainCcpLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(mainCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(profileLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainCcpLogo))
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 255));

        dashboardSidePanel1.setBackground(new java.awt.Color(102, 102, 255));
        dashboardSidePanel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        dashboardSidePanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardSidePanel1.setText("Cafeteria");
        dashboardSidePanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardSidePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardSidePanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardSidePanel1MouseExited(evt);
            }
        });

        dashboardSidePanel2.setBackground(new java.awt.Color(102, 102, 255));
        dashboardSidePanel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        dashboardSidePanel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardSidePanel2.setText("Time Table");
        dashboardSidePanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardSidePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardSidePanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardSidePanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardSidePanel2MouseExited(evt);
            }
        });

        dashboardSidePanel3.setBackground(new java.awt.Color(102, 102, 255));
        dashboardSidePanel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        dashboardSidePanel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardSidePanel3.setText("Profile");
        dashboardSidePanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardSidePanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardSidePanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardSidePanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardSidePanel3MouseExited(evt);
            }
        });

        dashboardSidePanel4.setBackground(new java.awt.Color(102, 102, 255));
        dashboardSidePanel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        dashboardSidePanel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardSidePanel4.setText("About Us");
        dashboardSidePanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardSidePanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardSidePanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardSidePanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardSidePanel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardSidePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboardSidePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(dashboardSidePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(dashboardSidePanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(dashboardSidePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(dashboardSidePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(dashboardSidePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(dashboardSidePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(51, 204, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cafeteria");
        jLabel4.setOpaque(true);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusconnectjava/Assets/Canteen.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 60, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel5.setBackground(new java.awt.Color(51, 204, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Time Tabel");
        jLabel5.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusconnectjava/Assets/Timetable.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        WelcomeMessageTxt.setBackground(new java.awt.Color(255, 255, 255));
        WelcomeMessageTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        WelcomeMessageTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeMessageTxt.setText("username");
        WelcomeMessageTxt.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRN");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WelcomeMessageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WelcomeMessageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainCloseButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_mainCloseButtonMouseClicked
    private String txt1;
    private Font originalFont1;
    private void dashboardSidePanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel1MouseEntered
        // TODO add your handling code here:
        txt1 = dashboardSidePanel1.getText();
        originalFont1 = dashboardSidePanel1.getFont();
        Font hoverFont1 = originalFont1.deriveFont(originalFont1.getSize() * 1.2f);

        // Underline the text with a yellow color when mouse enters the label
        dashboardSidePanel1.setText("<html><u><font color='yellow'>" + txt1 + "</font></u></html>");
        dashboardSidePanel1.setFont(hoverFont1);
    }//GEN-LAST:event_dashboardSidePanel1MouseEntered

    private void dashboardSidePanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel1MouseExited
        dashboardSidePanel1.setText(txt1);
        dashboardSidePanel1.setFont(originalFont1);

    }//GEN-LAST:event_dashboardSidePanel1MouseExited

    private String txt2;
    private Font originalFont2;
    private void dashboardSidePanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel2MouseEntered
        txt2 = dashboardSidePanel2.getText();
        // Store the original font
        originalFont2 = dashboardSidePanel2.getFont();

        // Modify the font size
        Font hoverFont2 = originalFont2.deriveFont(originalFont2.getSize() * 1.2f); // Increase font size by 20%

        // Underline the text with a yellow color and increase font size when mouse enters the label
        dashboardSidePanel2.setText("<html><u><font color='yellow'>" + txt2 + "</font></u></html>");
        dashboardSidePanel2.setFont(hoverFont2);

    }//GEN-LAST:event_dashboardSidePanel2MouseEntered

    private void dashboardSidePanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel2MouseExited
        // Restore the original text and font when mouse exits the label
        dashboardSidePanel2.setText(txt2);
        dashboardSidePanel2.setFont(originalFont2);
    }//GEN-LAST:event_dashboardSidePanel2MouseExited

    private void mainCloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainCloseButtonMouseEntered
        // TODO add your handling code here:
        mainCloseButton.setBackground(Color.RED);
    }//GEN-LAST:event_mainCloseButtonMouseEntered

    private void mainCloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainCloseButtonMouseExited
        // TODO add your handling code here:

        mainCloseButton.setBackground(new Color(255, 130, 130));
    }//GEN-LAST:event_mainCloseButtonMouseExited

    private String txt3;
    private Font originalFont3;
    private void dashboardSidePanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel3MouseEntered
        txt3 = dashboardSidePanel3.getText();
        // Store the original font
        originalFont3 = dashboardSidePanel3.getFont();

        // Modify the font size
        Font hoverFont3 = originalFont3.deriveFont(originalFont3.getSize() * 1.2f); // Increase font size by 20%

        // Underline the text with a yellow color and increase font size when mouse enters the label
        dashboardSidePanel3.setText("<html><u><font color='yellow'>" + txt3 + "</font></u></html>");
        dashboardSidePanel3.setFont(hoverFont3);
    }//GEN-LAST:event_dashboardSidePanel3MouseEntered

    private void dashboardSidePanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel3MouseExited
        dashboardSidePanel3.setText(txt3);
        dashboardSidePanel3.setFont(originalFont3);
    }//GEN-LAST:event_dashboardSidePanel3MouseExited

    private String txt4;
    private Font originalFont4;
    private void dashboardSidePanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel4MouseEntered
        // Store the original text
        txt4 = dashboardSidePanel4.getText();
        // Store the original font
        originalFont4 = dashboardSidePanel4.getFont();

        // Modify the font size
        Font hoverFont4 = originalFont4.deriveFont(originalFont4.getSize() * 1.2f); // Increase font size by 20%

        // Underline the text with a yellow color and increase font size when mouse enters the label
        dashboardSidePanel4.setText("<html><u><font color='yellow'>" + txt4 + "</font></u></html>");
        dashboardSidePanel4.setFont(hoverFont4);
    }//GEN-LAST:event_dashboardSidePanel4MouseEntered

    private void dashboardSidePanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel4MouseExited
        dashboardSidePanel4.setText(txt4);
        dashboardSidePanel4.setFont(originalFont4);
    }//GEN-LAST:event_dashboardSidePanel4MouseExited

    private void profileLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLogoMouseClicked
        // TODO add your handling code here:
        UserProfile up = new UserProfile(mainId);

        up.setVisible(true);
//        up.sendEmailInfo(mainId);

    }//GEN-LAST:event_profileLogoMouseClicked

    private void dashboardSidePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel2MouseClicked
       
        TimetableOption to = new TimetableOption();
        to.setVisible(true);
        
    }//GEN-LAST:event_dashboardSidePanel2MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
           TimetableOption to = new TimetableOption();
        to.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        MenuPageCafe menu = new MenuPageCafe(mainId);
        menu.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void dashboardSidePanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel3MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_dashboardSidePanel3MouseClicked

    private void dashboardSidePanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardSidePanel4MouseClicked
        // TODO add your handling code here:
          UserProfile up = new UserProfile(mainId);

        up.setVisible(true);
    }//GEN-LAST:event_dashboardSidePanel4MouseClicked

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
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
            // Assuming you have the PRN stored in a variable called prn
            String prn = "123456"; // Replace "123456" with the actual PRN
            new MainDashboard(prn).setVisible(true);
        }
        });
    }
public static String PassPrn(){
        return mainId;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel WelcomeMessageTxt;
    private javax.swing.JLabel dashboardSidePanel1;
    private javax.swing.JLabel dashboardSidePanel2;
    private javax.swing.JLabel dashboardSidePanel3;
    private javax.swing.JLabel dashboardSidePanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel mainCcpLogo;
    private javax.swing.JLabel mainCloseButton;
    private javax.swing.JLabel profileLogo;
    // End of variables declaration//GEN-END:variables
}
