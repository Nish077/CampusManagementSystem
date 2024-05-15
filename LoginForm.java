/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package campusconnectjava;
//import java.awt.BorderLayout;
//import javax.swing.*;

import campusconnectjava.DatabaseClasses.DB;
import static campusconnectjava.SignupPage.Prn;
import java.sql.*;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();

        //center the form 
        this.setLocationRelativeTo(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Assets/images.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        loginLeftPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginCreateAcc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginUsernameBox = new javax.swing.JTextField();
        loginPassBox = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        loginCloseButton = new javax.swing.JLabel();
        loginRadioPass = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        loginLeftPanel.setBackground(new java.awt.Color(144, 144, 248));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusconnectjava/Assets/images.png"))); // NOI18N
        logo.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Don't have an account ?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        loginCreateAcc.setBackground(new java.awt.Color(255, 163, 252));
        loginCreateAcc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        loginCreateAcc.setText("Create Account");
        loginCreateAcc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginCreateAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginCreateAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLeftPanelLayout = new javax.swing.GroupLayout(loginLeftPanel);
        loginLeftPanel.setLayout(loginLeftPanelLayout);
        loginLeftPanelLayout.setHorizontalGroup(
            loginLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLeftPanelLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(loginLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLeftPanelLayout.createSequentialGroup()
                        .addComponent(loginCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLeftPanelLayout.createSequentialGroup()
                        .addGroup(loginLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(91, 91, 91))))
        );
        loginLeftPanelLayout.setVerticalGroup(
            loginLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLeftPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Username:");

        loginUsernameBox.setForeground(new java.awt.Color(204, 204, 204));
        loginUsernameBox.setText("username");
        loginUsernameBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginUsernameBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginUsernameBoxFocusLost(evt);
            }
        });
        loginUsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameBoxActionPerformed(evt);
            }
        });

        loginPassBox.setForeground(new java.awt.Color(204, 204, 204));
        loginPassBox.setText("Password");
        loginPassBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginPassBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginPassBoxFocusLost(evt);
            }
        });
        loginPassBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPassBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Password:");

        loginButton.setBackground(new java.awt.Color(255, 163, 252));
        loginButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginCloseButton.setBackground(new java.awt.Color(255, 130, 130));
        loginCloseButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        loginCloseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginCloseButton.setText("X");
        loginCloseButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        loginCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginCloseButton.setOpaque(true);
        loginCloseButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginCloseButtonMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginCloseButtonMouseMoved(evt);
            }
        });
        loginCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginCloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginCloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginCloseButtonMouseExited(evt);
            }
        });

        loginRadioPass.setText("Show Password");
        loginRadioPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginRadioPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRadioPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(loginLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginUsernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginRadioPass, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginPassBox, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(125, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(loginCloseButton)
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(loginUsernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPassBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginRadioPass)
                .addGap(33, 33, 33)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameBoxActionPerformed

    private void loginPassBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPassBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPassBoxActionPerformed

    private void loginCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginCreateAccActionPerformed
        // TODO add your handling code here:
        SignupPage sp = new SignupPage();
        sp.setVisible(true);

    }//GEN-LAST:event_loginCreateAccActionPerformed

    private void loginCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginCloseButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_loginCloseButtonMouseClicked

    private void loginCloseButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginCloseButtonMouseDragged

        // TODO add your handling code here:
    }//GEN-LAST:event_loginCloseButtonMouseDragged

    private void loginCloseButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginCloseButtonMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_loginCloseButtonMouseMoved

    private void loginCloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginCloseButtonMouseEntered
        // TODO add your handling code here:
        loginCloseButton.setBackground(Color.RED);
    }//GEN-LAST:event_loginCloseButtonMouseEntered

    private void loginUsernameBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameBoxFocusGained
        // TODO add your handling code here:
        if (loginUsernameBox.getText().trim().toLowerCase().equals("username")) {
            loginUsernameBox.setText("");
            loginUsernameBox.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_loginUsernameBoxFocusGained

    private void loginUsernameBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameBoxFocusLost
        // TODO add your handling code here:
        if (loginUsernameBox.getText().trim().toLowerCase().equals("username") || loginUsernameBox.getText().trim().toLowerCase().equals("")) {
            loginUsernameBox.setText("username");
            loginUsernameBox.setForeground(Color.LIGHT_GRAY);
        }

    }//GEN-LAST:event_loginUsernameBoxFocusLost

    private void loginPassBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPassBoxFocusGained
        // TODO add your handling code here:
        String password = String.valueOf(loginPassBox.getPassword());
        if (password.trim().toLowerCase().equals("password")) {
            loginPassBox.setText("");
            loginPassBox.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_loginPassBoxFocusGained

    private void loginPassBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPassBoxFocusLost
        // TODO add your handling code here:
        String password = String.valueOf(loginPassBox.getPassword());
        if (password.trim().toLowerCase().equals("password") || password.trim().toLowerCase().equals("")) {
            loginPassBox.setText("password");
            loginPassBox.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_loginPassBoxFocusLost

    private void loginRadioPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRadioPassActionPerformed
        // TODO add your handling code here:
        if (loginRadioPass.isSelected()) {
            loginPassBox.setEchoChar((char) 0);
        } else {
            loginPassBox.setEchoChar('*');
        }
    }//GEN-LAST:event_loginRadioPassActionPerformed

    private void loginCloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginCloseButtonMouseExited
        // TODO add your handling code here:
        loginCloseButton.setBackground(new Color(255, 130, 130));
    }//GEN-LAST:event_loginCloseButtonMouseExited

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = loginUsernameBox.getText();
        String password = String.valueOf(loginPassBox.getPassword());

        if (username.trim().isEmpty() || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid username and password.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PreparedStatement ps;
        ResultSet rs;

        String query = "SELECT `prn` FROM `users` WHERE `email` = ? AND `password` = ?";

        try {
            ps = DB.getConnection().prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            rs = ps.executeQuery();

            if (rs.next()) {
                String prn = rs.getString("prn");
                // Assuming you have the PRN stored in a variable called prn
                MainDashboard dashboard = new MainDashboard(prn);
                dashboard.setVisible(true);

                // Hide the login page
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
//  public static String PassPrn(){
//        return Prn;
//        
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginCloseButton;
    private javax.swing.JButton loginCreateAcc;
    private javax.swing.JPanel loginLeftPanel;
    private javax.swing.JPasswordField loginPassBox;
    private javax.swing.JRadioButton loginRadioPass;
    private javax.swing.JTextField loginUsernameBox;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
