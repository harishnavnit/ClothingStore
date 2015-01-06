/**
 *
 * @author R. Harish Navnit<harishnavnit@gmail.com>
 */

package stores;

import customer.login.LoginScreen;
import clothes.*;
import java.util.List;
import static java.lang.String.valueOf;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import customer.login.LoginScreen;
import clothes.*;


public class Stores extends javax.swing.JFrame {
    
    int index = 0;
    
    // SQL variables
    Connection c = null;
    Statement  s = null;
    ResultSet rs = null;
    ResultSetMetaData meta = null;
    LoginScreen ls;
    
    /* Lists to store the information from the rows and columns of the tables */
    List<List<String>>  rowList         = new LinkedList<> ();
    List<String>        IDList          = new LinkedList<> ();
    List<String>        storeNameList   = new LinkedList<> ();
    List<String>        storeAddressList= new LinkedList<> ();
    List<String>        storeManagerList= new LinkedList<> ();
    List<String>        storeContactList= new LinkedList<> ();
    
    public Stores() {
        this.ls = new LoginScreen();
        
        initComponents();
        
        try {
            populateData();
            loadStoresTable(index);        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storeDetailsPanel = new javax.swing.JPanel();
        storeNameDisplayLabel = new javax.swing.JLabel();
        storeIdLabel = new javax.swing.JLabel();
        storeNameLabel = new javax.swing.JLabel();
        storeAddressLabel = new javax.swing.JLabel();
        storeManagerLabel = new javax.swing.JLabel();
        storeContactNumberLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        enterStoreButton = new javax.swing.JButton();
        viewNextStoreButton = new javax.swing.JButton();
        storeIdInfoLabel = new javax.swing.JLabel();
        storeNameInfoLabel = new javax.swing.JLabel();
        storeAddressInfoLabel = new javax.swing.JLabel();
        storeMangerInfoLabel = new javax.swing.JLabel();
        storeManagerContactNumberInfoLabel = new javax.swing.JLabel();
        storeImageDisplayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        storeDetailsPanel.setBackground(new java.awt.Color(241, 200, 90));

        storeNameDisplayLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        storeNameDisplayLabel.setText("Store Details");

        storeIdLabel.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        storeIdLabel.setText("Store Id");

        storeNameLabel.setFont(new java.awt.Font("Courier 10 Pitch", 0, 14)); // NOI18N
        storeNameLabel.setText("Store Name");

        storeAddressLabel.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        storeAddressLabel.setText("Store Address");

        storeManagerLabel.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        storeManagerLabel.setText("Store Manager");

        storeContactNumberLabel.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        storeContactNumberLabel.setText("Manger Contact Number");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        enterStoreButton.setText("Enter Store");
        enterStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterStoreButtonActionPerformed(evt);
            }
        });

        viewNextStoreButton.setText("Next");
        viewNextStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNextStoreButtonActionPerformed(evt);
            }
        });

        storeIdInfoLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        storeIdInfoLabel.setText("ID");

        storeNameInfoLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        storeNameInfoLabel.setText("Name");

        storeAddressInfoLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        storeAddressInfoLabel.setText("Address");

        storeMangerInfoLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        storeMangerInfoLabel.setText("Manager");

        storeManagerContactNumberInfoLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        storeManagerContactNumberInfoLabel.setText("Contact ");

        storeImageDisplayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stores/store.jpg"))); // NOI18N

        javax.swing.GroupLayout storeDetailsPanelLayout = new javax.swing.GroupLayout(storeDetailsPanel);
        storeDetailsPanel.setLayout(storeDetailsPanelLayout);
        storeDetailsPanelLayout.setHorizontalGroup(
            storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storeNameDisplayLabel)
                .addGap(150, 150, 150))
            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(storeImageDisplayLabel)
                    .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                        .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storeIdInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storeNameInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storeAddressInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storeMangerInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(storeManagerContactNumberInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(storeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeManagerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeContactNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(enterStoreButton)
                                .addGap(54, 54, 54)
                                .addComponent(viewNextStoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        storeDetailsPanelLayout.setVerticalGroup(
            storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storeNameDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(storeImageDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeIdLabel)
                    .addComponent(storeIdInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeNameLabel)
                    .addComponent(storeNameInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeAddressLabel)
                    .addComponent(storeAddressInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeManagerLabel)
                    .addComponent(storeMangerInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeContactNumberLabel)
                    .addComponent(storeManagerContactNumberInfoLabel))
                .addGap(18, 18, 18)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(enterStoreButton)
                    .addComponent(viewNextStoreButton))
                .addGap(32, 32, 32))
        );

        getContentPane().add(storeDetailsPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ls.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void enterStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterStoreButtonActionPerformed
        new clothes().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_enterStoreButtonActionPerformed

    private void viewNextStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNextStoreButtonActionPerformed
        ++index;
        if (index >= 5) index = 0;
        loadStoresTable(index);
    }//GEN-LAST:event_viewNextStoreButtonActionPerformed

    public void populateData() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dennis", "dennis", "earlscourt");
            s = c.createStatement();
            rs = s.executeQuery("SELECT * from stores");
            meta = rs.getMetaData();
            final int col_count = meta.getColumnCount();
            
            while (rs.next()) {
                
                /* Populate the column with values */
                for (int i = 1; i <= col_count; i++) {
                    Object value = rs.getObject(i);
                    if (value != null) {
                        if (i == 1)     IDList.add(String.valueOf(value));
                        if (i == 2)     storeNameList.add(String.valueOf(value));
                        if (i == 3)     storeAddressList.add(String.valueOf(value));
                        if (i == 4)     storeManagerList.add(String.valueOf(value));
                        if (i == 5)     storeContactList.add(String.valueOf(value));
                    }
                    else {
                        if (i == 1)     IDList.add(null);
                        if (i == 2)     storeNameList.add(null);
                        if (i == 3)     storeAddressList.add(null);
                        if (i == 4)     storeManagerList.add(null);
                        if (i == 5)     storeContactList.add(null);
                    }
                }
                
                /* Insert elements(columns) into the 2-D Linked List */
                rowList.add(IDList);
                rowList.add(storeNameList);
                rowList.add(storeAddressList);
                rowList.add(storeManagerList);
                rowList.add(storeContactList);
                
            }
            
            // Closing all open connections
            s.close();
            c.close();
            rs.close();
        } catch (Exception e) {
            System.err.println("\nFailed to populate Data");
            e.printStackTrace();
        }        
    }
    
    public void loadStoresTable(int index) {
        List<String> columns = rowList.get(index);

        storeIdLabel.setText(IDList.get(index));
        storeNameLabel.setText(storeNameList.get(index));
        storeAddressLabel.setText(storeAddressList.get(index));
        storeManagerLabel.setText(storeManagerList.get(index));
        storeContactNumberLabel.setText(storeContactList.get(index));
        
    }
    
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
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Stores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton enterStoreButton;
    private javax.swing.JLabel storeAddressInfoLabel;
    private javax.swing.JLabel storeAddressLabel;
    private javax.swing.JLabel storeContactNumberLabel;
    private javax.swing.JPanel storeDetailsPanel;
    private javax.swing.JLabel storeIdInfoLabel;
    private javax.swing.JLabel storeIdLabel;
    private javax.swing.JLabel storeImageDisplayLabel;
    private javax.swing.JLabel storeManagerContactNumberInfoLabel;
    private javax.swing.JLabel storeManagerLabel;
    private javax.swing.JLabel storeMangerInfoLabel;
    private javax.swing.JLabel storeNameDisplayLabel;
    private javax.swing.JLabel storeNameInfoLabel;
    private javax.swing.JLabel storeNameLabel;
    private javax.swing.JButton viewNextStoreButton;
    // End of variables declaration//GEN-END:variables

}
