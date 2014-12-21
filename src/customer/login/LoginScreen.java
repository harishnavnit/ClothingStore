/**
 *
 * @author R. Harish Navnit<harishnavnit@gmail.com>
 */

package customer.login;

import static java.lang.String.valueOf;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import stores.Stores;
import clothes.purchaseHistory;

public class LoginScreen extends javax.swing.JFrame {

    /* Field variable declarations */
    Connection c = null;
    Statement  s = null;
    int age, contactno;
    String c_name, c_id,c_addr;
    boolean dbConnected, customerLoggedIn;

    public LoginScreen() {
        // Establish a conneciton on startup
        dbConnected = establishConnection();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginFailedPopUp = new javax.swing.JPopupMenu();
        loginScreenPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        errorMsg = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        homeScreenPanel = new javax.swing.JPanel();
        homeScreenExitButton = new javax.swing.JButton();
        homeScreenBackButton = new javax.swing.JButton();
        homeScreenWelcomeLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        viewStoreButton = new javax.swing.JButton();
        purchaseHistoryButton = new javax.swing.JButton();
        cnameLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        customerAgeLabel = new javax.swing.JLabel();
        customerContactNumberLabel = new javax.swing.JLabel();
        customerAddressLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        loginScreenPanel.setBackground(new java.awt.Color(224, 224, 124));

        userNameLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        userNameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        passwordLabel.setText("Password");

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        errorMsg.setForeground(new java.awt.Color(255, 3, 0));
        errorMsg.setText("Invalid username and/or password");
        errorMsg.setVisible(false);

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer/login/user_lock.png"))); // NOI18N

        javax.swing.GroupLayout loginScreenPanelLayout = new javax.swing.GroupLayout(loginScreenPanel);
        loginScreenPanel.setLayout(loginScreenPanelLayout);
        loginScreenPanelLayout.setHorizontalGroup(
            loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginScreenPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(loginScreenPanelLayout.createSequentialGroup()
                        .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(loginScreenPanelLayout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(loginScreenPanelLayout.createSequentialGroup()
                                            .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(passwordLabel)
                                                .addComponent(userNameLabel))
                                            .addGap(34, 34, 34)
                                            .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(errorMsg)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginScreenPanelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(loginScreenPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        loginScreenPanelLayout.setVerticalGroup(
            loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorMsg)
                .addGap(14, 14, 14)
                .addGroup(loginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(exitButton)
                    .addComponent(enterButton))
                .addGap(60, 60, 60))
        );

        getContentPane().add(loginScreenPanel, "card2");

        homeScreenPanel.setBackground(new java.awt.Color(235, 224, 112));

        homeScreenExitButton.setText("Exit");
        homeScreenExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeScreenExitButtonActionPerformed(evt);
            }
        });

        homeScreenBackButton.setText("Back");
        homeScreenBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeScreenBackButtonActionPerformed(evt);
            }
        });

        homeScreenWelcomeLabel.setFont(new java.awt.Font("TlwgTypewriter", 1, 18)); // NOI18N
        homeScreenWelcomeLabel.setText("Welcome");

        ageLabel.setText("Customer Age");

        contactLabel.setText("Contact Number");

        addressLabel.setText("Customer Address");

        viewStoreButton.setText("View Stores");
        viewStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStoreButtonActionPerformed(evt);
            }
        });

        purchaseHistoryButton.setText("Purchase History");
        purchaseHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseHistoryButtonActionPerformed(evt);
            }
        });

        cnameLabel.setText("Customer Name");

        customerNameLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        customerNameLabel.setText("Name");

        customerAgeLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        customerAgeLabel.setText("Age");

        customerContactNumberLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        customerContactNumberLabel.setText("Number");

        customerAddressLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        customerAddressLabel.setText("Address");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer/login/shopping.jpg"))); // NOI18N

        javax.swing.GroupLayout homeScreenPanelLayout = new javax.swing.GroupLayout(homeScreenPanel);
        homeScreenPanel.setLayout(homeScreenPanelLayout);
        homeScreenPanelLayout.setHorizontalGroup(
            homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeScreenPanelLayout.createSequentialGroup()
                .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeScreenPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerContactNumberLabel)
                            .addGroup(homeScreenPanelLayout.createSequentialGroup()
                                .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerAddressLabel)
                                    .addComponent(customerAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerNameLabel))
                                .addGap(41, 41, 41)
                                .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(homeScreenPanelLayout.createSequentialGroup()
                                .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(homeScreenBackButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewStoreButton))
                                .addGap(38, 38, 38)
                                .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(purchaseHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(homeScreenExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(homeScreenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(homeScreenPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(homeScreenWelcomeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeScreenPanelLayout.setVerticalGroup(
            homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeScreenPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeScreenWelcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeScreenPanelLayout.createSequentialGroup()
                        .addComponent(customerNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerAgeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerContactNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewStoreButton)
                            .addComponent(purchaseHistoryButton))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeScreenPanelLayout.createSequentialGroup()
                        .addComponent(cnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressLabel)
                        .addGap(49, 49, 49)))
                .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeScreenExitButton)
                    .addComponent(homeScreenBackButton))
                .addContainerGap())
        );

        getContentPane().add(homeScreenPanel, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* User modified code
     * Provide utility functions.
     */

    public boolean establishConnection() {
        /* Attempt connecting to the Data Base */
            try {
                // Register the driver
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "harish", "earlscourt");
            }
            catch (Exception e) {
                e.printStackTrace();
                System.err.print("Unable to connect to server"
                        + "\nPlease contact the administrator");
                System.err.println("Connecting to DataBase Failed");
                return false;
            }
            System.out.println("Connected to DataBase successfully");
            return true;
    }

    public boolean customerLogin() throws SQLException {
        int countEntryFlag = 0;
        c_name  = userNameField.getText();
        c_id    = passwordField.getText();
        
        if (dbConnected) {
            try {
                s = c.createStatement();
                try (ResultSet rs = s.executeQuery("SELECT * from customer")) {
                    while(rs.next()) {
                        String customerId   = rs.getString("c_id");
                        String customerName = rs.getString("c_name");
                        String customerAddr = rs.getString("c_address");
                        int    customerAge  = rs.getInt("c_age");
                        int    customerContact = rs.getInt("c_contactnumber");
                        
                        if (c_name.equals(customerName)) {
                            if (c_id.equals(customerId)) {
                                countEntryFlag ++;
                                errorMsg.setVisible(false);
                                modifyHomeScreen(customerName, customerId, customerAddr, customerAge, customerContact);
                            }
                        }
                        else {
                            errorMsg.setVisible(true);
                        }
                    }
                    
                    // Close all open connections
                    s.close();
                    c.close();
                }
            }
            catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return (countEntryFlag > 0) ? true : false;
    } 
    
    public void modifyHomeScreen(String name, String id, String address, int age, int contactNo) {
        homeScreenWelcomeLabel.setText("Welcome " + name);
        cnameLabel.setText(name);
        addressLabel.setText(address);
        ageLabel.setText(valueOf(age));
        contactLabel.setText("\t" + valueOf(contactNo));
    }

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        userNameField.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        try {
            customerLoggedIn = customerLogin();
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (customerLoggedIn) {
            System.out.println("Customer Login Successful");
            homeScreenPanel.setVisible(true); 
            loginScreenPanel.setVisible(false);
        }
        else {
            System.err.println("Customer Login Failed");
            loginScreenPanel.setVisible(true);
            homeScreenPanel.setVisible(false);
            loginFailedPopUp.setVisible(true);
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void homeScreenExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeScreenExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_homeScreenExitButtonActionPerformed

    private void homeScreenBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeScreenBackButtonActionPerformed
        loginScreenPanel.setVisible(true);
        homeScreenPanel.setVisible(false);
    }//GEN-LAST:event_homeScreenBackButtonActionPerformed

    private void viewStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStoreButtonActionPerformed
        new Stores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewStoreButtonActionPerformed

    private void purchaseHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseHistoryButtonActionPerformed
        new purchaseHistory().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_purchaseHistoryButtonActionPerformed

    /** Begining of the main method
     * @param args */
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel cnameLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel customerAddressLabel;
    private javax.swing.JLabel customerAgeLabel;
    private javax.swing.JLabel customerContactNumberLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeScreenBackButton;
    private javax.swing.JButton homeScreenExitButton;
    private javax.swing.JPanel homeScreenPanel;
    private javax.swing.JLabel homeScreenWelcomeLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu loginFailedPopUp;
    private javax.swing.JPanel loginScreenPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton purchaseHistoryButton;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JButton viewStoreButton;
    // End of variables declaration//GEN-END:variables

}
