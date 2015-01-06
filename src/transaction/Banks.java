/**
 *
 * @author R. Harish Navnit<harishnavnit@gmail.com>
 */

package transaction;

import stores.*;
import clothes.*;

import java.sql.*;
import clothes.*;
import java.util.LinkedList;
import java.util.List;

public class Banks extends javax.swing.JFrame {

    /* Field Varaible declarations */
    String selectedBank,userName, cvvORpin, cardNum;
    List<String> bname = new LinkedList<> ();
    List<String> uname = new LinkedList<> ();
    List<String> cnum  = new LinkedList<> ();
    List<String> cvnum = new LinkedList<> ();
    
    /* SQL Variables */
    Connection c = null;
    Statement  s = null;
    ResultSet rs = null;
    
    public Banks() {
        initComponents();
        credentialCheckerLabel.setVisible(false);
        bankSelectorPanel.setVisible(true);
        transactionPanel.setVisible(false);
        
        establishConnection();
        
        populateData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bankSelectorPanel = new javax.swing.JPanel();
        citiBankRadioButton = new javax.swing.JRadioButton();
        axisBankLabel = new javax.swing.JLabel();
        axisBankRadioButton = new javax.swing.JRadioButton();
        stateBankLabel = new javax.swing.JLabel();
        stateBankRadioButton = new javax.swing.JRadioButton();
        unionBankRadioButton = new javax.swing.JRadioButton();
        topDisplayLabel = new javax.swing.JLabel();
        unionBankLabel = new javax.swing.JLabel();
        citiBankLabel = new javax.swing.JLabel();
        paymentBackButton = new javax.swing.JButton();
        paymentCancelButton = new javax.swing.JButton();
        transactionPanel = new javax.swing.JPanel();
        userNameField = new javax.swing.JTextField();
        cardNumberField = new javax.swing.JTextField();
        transactionTopDispalyLabel = new javax.swing.JLabel();
        userNameInfoLabel = new javax.swing.JLabel();
        cardNumberInfoLabel = new javax.swing.JLabel();
        CVVorPINinfoLabel = new javax.swing.JLabel();
        cvvPasswordField = new javax.swing.JPasswordField();
        transactionBackButton = new javax.swing.JButton();
        transactionEnterButton = new javax.swing.JButton();
        transactionCancelButton = new javax.swing.JButton();
        credentialCheckerLabel = new javax.swing.JLabel();
        transactionCompletePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewPurchasesButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        shopAgainButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        bankSelectorPanel.setBackground(new java.awt.Color(255, 255, 255));

        citiBankRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citiBankRadioButtonActionPerformed(evt);
            }
        });

        axisBankLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transaction/axis-bank-logo.jpg"))); // NOI18N

        axisBankRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                axisBankRadioButtonActionPerformed(evt);
            }
        });

        stateBankLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transaction/state_bank_of_india_logo_3898.png"))); // NOI18N

        stateBankRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateBankRadioButtonActionPerformed(evt);
            }
        });

        unionBankRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unionBankRadioButtonActionPerformed(evt);
            }
        });

        topDisplayLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        topDisplayLabel.setText("Payment Gateway");

        unionBankLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transaction/union-bank-logo-1.jpg"))); // NOI18N

        citiBankLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transaction/citi-logo.jpg"))); // NOI18N

        paymentBackButton.setText("Back");
        paymentBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBackButtonActionPerformed(evt);
            }
        });

        paymentCancelButton.setText("Cancel");
        paymentCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bankSelectorPanelLayout = new javax.swing.GroupLayout(bankSelectorPanel);
        bankSelectorPanel.setLayout(bankSelectorPanelLayout);
        bankSelectorPanelLayout.setHorizontalGroup(
            bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bankSelectorPanelLayout.createSequentialGroup()
                .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bankSelectorPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bankSelectorPanelLayout.createSequentialGroup()
                                .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(axisBankRadioButton)
                                    .addComponent(citiBankRadioButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(citiBankLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(axisBankLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bankSelectorPanelLayout.createSequentialGroup()
                                .addComponent(stateBankRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stateBankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bankSelectorPanelLayout.createSequentialGroup()
                                .addComponent(paymentBackButton)
                                .addGap(46, 46, 46)
                                .addComponent(paymentCancelButton))
                            .addGroup(bankSelectorPanelLayout.createSequentialGroup()
                                .addComponent(unionBankRadioButton)
                                .addGap(42, 42, 42)
                                .addComponent(unionBankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bankSelectorPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(topDisplayLabel)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        bankSelectorPanelLayout.setVerticalGroup(
            bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bankSelectorPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(topDisplayLabel)
                .addGap(18, 18, 18)
                .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(citiBankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bankSelectorPanelLayout.createSequentialGroup()
                        .addComponent(citiBankRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(axisBankRadioButton)
                    .addComponent(axisBankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateBankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateBankRadioButton))
                .addGap(18, 18, 18)
                .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unionBankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unionBankRadioButton))
                .addGap(26, 26, 26)
                .addGroup(bankSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentBackButton)
                    .addComponent(paymentCancelButton))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        getContentPane().add(bankSelectorPanel, "card2");

        transactionPanel.setBackground(new java.awt.Color(255, 255, 255));
        transactionPanel.setPreferredSize(new java.awt.Dimension(431, 401));

        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        transactionTopDispalyLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        transactionTopDispalyLabel.setText("Transaction Details");

        userNameInfoLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        userNameInfoLabel.setText("User Name");

        cardNumberInfoLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        cardNumberInfoLabel.setText("Card Number");

        CVVorPINinfoLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        CVVorPINinfoLabel.setText("CVV/PIN Number");

        transactionBackButton.setText("Back");
        transactionBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionBackButtonActionPerformed(evt);
            }
        });

        transactionEnterButton.setText("Enter");
        transactionEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionEnterButtonActionPerformed(evt);
            }
        });

        transactionCancelButton.setText("Cancel");
        transactionCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionCancelButtonActionPerformed(evt);
            }
        });

        credentialCheckerLabel.setFont(new java.awt.Font("Century Schoolbook L", 2, 12)); // NOI18N
        credentialCheckerLabel.setForeground(new java.awt.Color(255, 0, 51));
        credentialCheckerLabel.setText("Invalid Credentials");

        javax.swing.GroupLayout transactionPanelLayout = new javax.swing.GroupLayout(transactionPanel);
        transactionPanel.setLayout(transactionPanelLayout);
        transactionPanelLayout.setHorizontalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transactionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameInfoLabel)
                            .addComponent(cardNumberInfoLabel)
                            .addComponent(CVVorPINinfoLabel))
                        .addGap(57, 57, 57)
                        .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameField)
                            .addComponent(cardNumberField)
                            .addComponent(cvvPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                    .addGroup(transactionPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(transactionTopDispalyLabel))
                    .addGroup(transactionPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(transactionBackButton)
                        .addGap(18, 18, 18)
                        .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(credentialCheckerLabel)
                            .addGroup(transactionPanelLayout.createSequentialGroup()
                                .addComponent(transactionEnterButton)
                                .addGap(18, 18, 18)
                                .addComponent(transactionCancelButton)))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        transactionPanelLayout.setVerticalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(transactionTopDispalyLabel)
                .addGap(18, 18, 18)
                .addComponent(credentialCheckerLabel)
                .addGap(18, 18, 18)
                .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumberInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CVVorPINinfoLabel)
                    .addComponent(cvvPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionBackButton)
                    .addComponent(transactionEnterButton)
                    .addComponent(transactionCancelButton))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        getContentPane().add(transactionPanel, "card3");

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel1.setText("Purchase Complete");

        viewPurchasesButton.setText("View Purchases");
        viewPurchasesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPurchasesButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        shopAgainButton.setText("Shop Again");
        shopAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopAgainButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transactionCompletePanelLayout = new javax.swing.GroupLayout(transactionCompletePanel);
        transactionCompletePanel.setLayout(transactionCompletePanelLayout);
        transactionCompletePanelLayout.setHorizontalGroup(
            transactionCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionCompletePanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(shopAgainButton)
                .addGap(18, 18, 18)
                .addComponent(viewPurchasesButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addGap(65, 65, 65))
            .addGroup(transactionCompletePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transactionCompletePanelLayout.setVerticalGroup(
            transactionCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionCompletePanelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(transactionCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPurchasesButton)
                    .addComponent(exitButton)
                    .addComponent(shopAgainButton))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        getContentPane().add(transactionCompletePanel, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void axisBankRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_axisBankRadioButtonActionPerformed
        selectedBank = "Axis";
        bankSelectorPanel.setVisible(false);
        transactionPanel.setVisible(true);
        transactionCompletePanel.setVisible(false);
    }//GEN-LAST:event_axisBankRadioButtonActionPerformed

    private void paymentCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentCancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_paymentCancelButtonActionPerformed

    private void paymentBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBackButtonActionPerformed
        this.setVisible(false);
        new clothes().setVisible(true);
    }//GEN-LAST:event_paymentBackButtonActionPerformed

    private void citiBankRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citiBankRadioButtonActionPerformed
        selectedBank = "Citi";
        bankSelectorPanel.setVisible(false);
        transactionPanel.setVisible(true);
        transactionCompletePanel.setVisible(true);
    }//GEN-LAST:event_citiBankRadioButtonActionPerformed

    private void stateBankRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateBankRadioButtonActionPerformed
        selectedBank = "SBI";
        bankSelectorPanel.setVisible(false);
        transactionPanel.setVisible(true);
        transactionCompletePanel.setVisible(false);
    }//GEN-LAST:event_stateBankRadioButtonActionPerformed

    private void unionBankRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unionBankRadioButtonActionPerformed
        selectedBank = "Union";
        bankSelectorPanel.setVisible(false);
        transactionPanel.setVisible(true);
        transactionCompletePanel.setVisible(false);
    }//GEN-LAST:event_unionBankRadioButtonActionPerformed

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        userName = userNameField.getText();
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void transactionCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionCancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_transactionCancelButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void shopAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopAgainButtonActionPerformed
        this.setVisible(false);
        new Stores().setVisible(true);
    }//GEN-LAST:event_shopAgainButtonActionPerformed

    private void viewPurchasesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPurchasesButtonActionPerformed
        this.setVisible(false);
        new purchaseHistory().setVisible(true);
    }//GEN-LAST:event_viewPurchasesButtonActionPerformed

    private void transactionEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionEnterButtonActionPerformed
        completeTransactions();
    }//GEN-LAST:event_transactionEnterButtonActionPerformed

    private void transactionBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionBackButtonActionPerformed
        bankSelectorPanel.setVisible(true);
        transactionPanel.setVisible(false);
        transactionCompletePanel.setVisible(false);
    }//GEN-LAST:event_transactionBackButtonActionPerformed

    private boolean establishConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dennis", "dennis", "earlscourt");
        } catch (Exception e) {
            System.err.println("Failed to establish Connection");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    private boolean populateData() {
        String sql = "select * from transactions";
        String b_name, u_name, c_num, cv_num;
        
        try {
            if (establishConnection()) {
                s = c.createStatement();
                rs = s.executeQuery(sql);
                
                while (rs.next()) {
                    b_name = rs.getString("b_name");        bname.add(b_name);
                    u_name = rs.getString("u_name");        uname.add(u_name);
                    c_num  = rs.getString("c_num");         cnum.add(c_num);
                    cv_num = rs.getString("cv_num");        cvnum.add(cv_num);
                }
                
                rs.close();
                s.close();
                c.close();
            }
            else {
                System.err.println("Connection to the database failed.\nPlease connect again");
            }
        } catch (Exception e) {
            System.err.println("Failed while obtaining match");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    private boolean checkMatch(String bank, String name, String cardnum, String pass) {
        int countEntryFlag = 0;
        userName = userNameField.getText();
        cvvORpin = cvvPasswordField.getText();
        cardNum  = cardNumberField.getText();
        
        if (selectedBank.equals(bank)) {
            if (userName.equals(name)) {
                if (cardNum.equals(cardnum)) {
                    if (cvvORpin.equals(pass)) {
                        countEntryFlag++;
                    }
                }
            }
        }
        return (countEntryFlag > 0) ? true : false;
    }
    
    private void completeTransactions() {
        
        System.out.println("User Entered Card Number = " + cardNum);
        for (int i = 0; i < cnum.size(); i++) {
            System.out.println("Bank Name " + i + " : " + bname.get(i));
            System.out.println("User Name " + i + " : " + uname.get(i));
            System.out.println("Card Number " + i + " : " + cnum.get(i));
            System.out.println("CVV Number " + i + " : " + cvnum.get(i));
        }
        
        cardNum  = cardNumberField.getText();
        int index = cnum.indexOf(cardNum);
        System.out.println("\nIndex = " + index);
        
        if (index >= 0) {
            if (checkMatch(bname.get(index), uname.get(index), cnum.get(index), cvnum.get(index))) {
                transactionCompletePanel.setVisible(true);
                bankSelectorPanel.setVisible(false);
                transactionPanel.setVisible(false);
            }
            else {
                credentialCheckerLabel.setVisible(true);
            }
        } else {
            credentialCheckerLabel.setVisible(true);
        }
        
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
            java.util.logging.Logger.getLogger(Banks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CVVorPINinfoLabel;
    private javax.swing.JLabel axisBankLabel;
    private javax.swing.JRadioButton axisBankRadioButton;
    private javax.swing.JPanel bankSelectorPanel;
    private javax.swing.JTextField cardNumberField;
    private javax.swing.JLabel cardNumberInfoLabel;
    private javax.swing.JLabel citiBankLabel;
    private javax.swing.JRadioButton citiBankRadioButton;
    private javax.swing.JLabel credentialCheckerLabel;
    private javax.swing.JPasswordField cvvPasswordField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton paymentBackButton;
    private javax.swing.JButton paymentCancelButton;
    private javax.swing.JButton shopAgainButton;
    private javax.swing.JLabel stateBankLabel;
    private javax.swing.JRadioButton stateBankRadioButton;
    private javax.swing.JLabel topDisplayLabel;
    private javax.swing.JButton transactionBackButton;
    private javax.swing.JButton transactionCancelButton;
    private javax.swing.JPanel transactionCompletePanel;
    private javax.swing.JButton transactionEnterButton;
    private javax.swing.JPanel transactionPanel;
    private javax.swing.JLabel transactionTopDispalyLabel;
    private javax.swing.JLabel unionBankLabel;
    private javax.swing.JRadioButton unionBankRadioButton;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameInfoLabel;
    private javax.swing.JButton viewPurchasesButton;
    // End of variables declaration//GEN-END:variables

}
