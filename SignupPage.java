/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package campusconnectjava;

import campusconnectjava.DatabaseClasses.DB;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class SignupPage extends javax.swing.JFrame {
static String Prn;
    /**
     * Creates new form SignupPage
     */
    public SignupPage() {
        initComponents();
            this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confirmPasswordField = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        prnTextField = new javax.swing.JTextField();
        ConfirmPassword = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        branchComboBox = new javax.swing.JComboBox<>();
        phoneNumberTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        signupButton = new javax.swing.JButton();
        closeCursor = new javax.swing.JLabel();
        mainCcpLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        confirmPasswordField.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SignUp");

        nameTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(153, 153, 153));
        nameTextField.setText("Name");
        nameTextField.setAlignmentX(0.0F);
        nameTextField.setAutoscrolls(false);
        nameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        EmailTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        EmailTextField.setForeground(new java.awt.Color(153, 153, 153));
        EmailTextField.setText("Email");
        EmailTextField.setAlignmentX(0.0F);
        EmailTextField.setAutoscrolls(false);
        EmailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmailTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EmailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailTextFieldFocusLost(evt);
            }
        });
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        prnTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        prnTextField.setForeground(new java.awt.Color(153, 153, 153));
        prnTextField.setText("PRN Number");
        prnTextField.setAlignmentX(0.0F);
        prnTextField.setAutoscrolls(false);
        prnTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prnTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        prnTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prnTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prnTextFieldFocusLost(evt);
            }
        });
        prnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prnTextFieldActionPerformed(evt);
            }
        });

        ConfirmPassword.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        ConfirmPassword.setForeground(new java.awt.Color(153, 153, 153));
        ConfirmPassword.setText("Confirm Password");
        ConfirmPassword.setAlignmentX(0.0F);
        ConfirmPassword.setAutoscrolls(false);
        ConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConfirmPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConfirmPasswordFocusLost(evt);
            }
        });
        ConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordActionPerformed(evt);
            }
        });

        genderComboBox.setForeground(new java.awt.Color(102, 102, 102));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "Male", "Female", "Other" }));
        genderComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genderComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                genderComboBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                genderComboBoxFocusLost(evt);
            }
        });

        branchComboBox.setForeground(new java.awt.Color(102, 102, 102));
        branchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branch", "Computer Engineering", "Information Technology", "CSE(AIML)", "ENTC", "Mechanical Engineering", "Civil Engineering", "Other" }));
        branchComboBox.setToolTipText("");
        branchComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        branchComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                branchComboBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                branchComboBoxFocusLost(evt);
            }
        });

        phoneNumberTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        phoneNumberTextField.setForeground(new java.awt.Color(153, 153, 153));
        phoneNumberTextField.setText("Phone Number");
        phoneNumberTextField.setAlignmentX(0.0F);
        phoneNumberTextField.setAutoscrolls(false);
        phoneNumberTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        phoneNumberTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        phoneNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberTextFieldFocusLost(evt);
            }
        });
        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });

        passwordField.setText("Password");
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        signupButton.setBackground(new java.awt.Color(102, 102, 102));
        signupButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Confirm");
        signupButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        signupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        closeCursor.setBackground(new java.awt.Color(255, 153, 153));
        closeCursor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        closeCursor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeCursor.setText("X");
        closeCursor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        closeCursor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeCursor.setOpaque(true);
        closeCursor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeCursorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeCursorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeCursorMouseExited(evt);
            }
        });

        mainCcpLogo.setBackground(new java.awt.Color(255, 255, 255));
        mainCcpLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainCcpLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusconnectjava/Assets/mainLogo.png"))); // NOI18N
        mainCcpLogo.setFocusCycleRoot(true);
        mainCcpLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainCcpLogo.setIconTextGap(0);
        mainCcpLogo.setOpaque(true);

        javax.swing.GroupLayout confirmPasswordFieldLayout = new javax.swing.GroupLayout(confirmPasswordField);
        confirmPasswordField.setLayout(confirmPasswordFieldLayout);
        confirmPasswordFieldLayout.setHorizontalGroup(
            confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmPasswordFieldLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeCursor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(confirmPasswordFieldLayout.createSequentialGroup()
                .addGroup(confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmPasswordFieldLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(confirmPasswordFieldLayout.createSequentialGroup()
                                                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(branchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(prnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(EmailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(confirmPasswordFieldLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(confirmPasswordFieldLayout.createSequentialGroup()
                        .addComponent(mainCcpLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        confirmPasswordFieldLayout.setVerticalGroup(
            confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPasswordFieldLayout.createSequentialGroup()
                .addGroup(confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmPasswordFieldLayout.createSequentialGroup()
                        .addComponent(closeCursor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainCcpLogo))
                .addGap(47, 47, 47)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(confirmPasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(branchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void prnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prnTextFieldActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
    String fullname = nameTextField.getText();
    String email = EmailTextField.getText();
    String password = String.valueOf(passwordField.getPassword());
    String confirmPassword = ConfirmPassword.getText();
    String gender = (String) genderComboBox.getSelectedItem(); // Retrieve selected gender
    String prn = prnTextField.getText();
    String branch = (String) branchComboBox.getSelectedItem();
    String phoneNumber = phoneNumberTextField.getText();
    
    // Check if passwords match
    if (!password.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
   PreparedStatement ps;    
    
        String query ="INSERT INTO `users`(`fullname`, `email`, `password`,`prn`,`gender`, `branch`, `phone`) VALUES ( ?, ?,?, ?, ?, ?, ?)";
        
       try {
    ps = DB.getConnection().prepareStatement(query);
   
    ps.setString(1, fullname);
    ps.setString(2, email);
    ps.setString(3, password);
    ps.setString(4, prn);
    ps.setString(5, gender);
    ps.setString(6, branch);
    ps.setString(7, phoneNumber);
    
    //passing to the gloal variable
    Prn = prn;
    
    int rowsAffected = ps.executeUpdate(); // Execute INSERT statement
    
    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(this, "User registered successfully! Your User ID is: " + prn);
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Failed to register user.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
}

        
    }//GEN-LAST:event_signupButtonActionPerformed

    private void closeCursorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeCursorMouseClicked
this.dispose();
 // TODO add your handling code here:
    }//GEN-LAST:event_closeCursorMouseClicked

    private void closeCursorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeCursorMouseEntered
        // TODO add your handling code here:
         closeCursor.setBackground(Color.RED);
    }//GEN-LAST:event_closeCursorMouseEntered

    private void closeCursorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeCursorMouseExited
  
        closeCursor.setBackground(new Color(150, 150, 150));
    }//GEN-LAST:event_closeCursorMouseExited

    private void ConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswordActionPerformed

    private void nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusGained
        // Check if the text is the default "Name"
    if(nameTextField.getText().trim().toLowerCase().equals("name")) {
        nameTextField.setText("");
        nameTextField.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_nameTextFieldFocusGained

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
   // Check if the text is empty or the default "Name"
    if(nameTextField.getText().trim().isEmpty() || nameTextField.getText().trim().toLowerCase().equals("name")) {
        nameTextField.setText("Name");
        nameTextField.setForeground(new Color(150, 150, 150));
    }
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void EmailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailTextFieldFocusGained
        // TODO add your handling code here:
        if(EmailTextField.getText().trim().toLowerCase().equals("email"))
        {
            EmailTextField.setText("");
              EmailTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_EmailTextFieldFocusGained

    private void EmailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailTextFieldFocusLost
        // TODO add your handling code here:
         if(EmailTextField.getText().trim().toLowerCase().equals("email") || EmailTextField.getText().trim().toLowerCase().equals(""))
        {
            EmailTextField.setText("Email");
            EmailTextField.setForeground(new Color(150, 150, 150));
        }
    }//GEN-LAST:event_EmailTextFieldFocusLost

    private void prnTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prnTextFieldFocusGained
       if( prnTextField.getText().trim().toLowerCase().equals("prn number"))
        {
             prnTextField.setText("");
               prnTextField.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_prnTextFieldFocusGained

    private void prnTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prnTextFieldFocusLost
       if(prnTextField.getText().trim().toLowerCase().equals("prn number") || prnTextField.getText().trim().toLowerCase().equals(""))
        {
            prnTextField.setText("prn number");
            prnTextField.setForeground(new Color(150, 150, 150));
        }
    }//GEN-LAST:event_prnTextFieldFocusLost
private boolean genderComboBoxClicked = false;
    private void genderComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genderComboBoxFocusGained
       genderComboBoxClicked = true;
    // Check if the selected item is the default "Gender"
    if (genderComboBox.getSelectedItem().toString().trim().toLowerCase().equals("gender")) {
        genderComboBox.setSelectedItem("");
        genderComboBox.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_genderComboBoxFocusGained

    private void genderComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genderComboBoxFocusLost
        if (!genderComboBoxClicked && genderComboBox.getSelectedItem().toString().trim().isEmpty()) {
        genderComboBox.setSelectedItem("Gender");
         genderComboBox.setForeground(new Color(150, 150, 150));
        
    }
    // Reset the flag
    genderComboBoxClicked = false;
    }//GEN-LAST:event_genderComboBoxFocusLost

    private void branchComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_branchComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_branchComboBoxFocusGained

    private void branchComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_branchComboBoxFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_branchComboBoxFocusLost

    private void phoneNumberTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldFocusGained
        // TODO add your handling code here:
         if( phoneNumberTextField.getText().trim().toLowerCase().equals("phone number"))
        {
             phoneNumberTextField.setText("");
               phoneNumberTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_phoneNumberTextFieldFocusGained

    private void phoneNumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldFocusLost
 if(phoneNumberTextField.getText().trim().toLowerCase().equals("phone number") || phoneNumberTextField.getText().trim().toLowerCase().equals(""))
        {
            phoneNumberTextField.setText("Phone number");
            phoneNumberTextField.setForeground(new Color(150, 150, 150));
        }
    }//GEN-LAST:event_phoneNumberTextFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
       String  password = String.valueOf(passwordField.getPassword());
         if(password.trim().toLowerCase().equals("password"))
        {
            passwordField.setText("");
            passwordField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        // TODO add your handling code here:
        String  password = String.valueOf(passwordField.getPassword());
         if(password.trim().toLowerCase().equals("password") || password.trim().toLowerCase().equals(""))
         {
              passwordField.setText("password");
            passwordField.setForeground(Color.LIGHT_GRAY);
         }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void ConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordFocusGained
        // TODO add your handling code here:
         if(ConfirmPassword.getText().trim().toLowerCase().equals("confirm password")) {
        ConfirmPassword.setText("");
        ConfirmPassword.setForeground(Color.BLACK);
    }
        
    }//GEN-LAST:event_ConfirmPasswordFocusGained

    private void ConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordFocusLost
        // TODO add your handling code here:
        if(ConfirmPassword.getText().trim().isEmpty() || ConfirmPassword.getText().trim().toLowerCase().equals("confiem password")) {
        ConfirmPassword.setText("confirm password");
        ConfirmPassword.setForeground(new Color(150, 150, 150));
    }
        
    }//GEN-LAST:event_ConfirmPasswordFocusLost

    
    public static String PassPrn(){
        return Prn;
        
    }
    

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmPassword;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JComboBox<String> branchComboBox;
    private javax.swing.JLabel closeCursor;
    private javax.swing.JPanel confirmPasswordField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainCcpLogo;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField prnTextField;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
