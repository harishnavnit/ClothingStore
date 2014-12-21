/**
 *
 * @author R. Harish Navnit<harishnavnit@gmail.com>
 */

package clothes;

import java.sql.*;
import customer.login.*;
import stores.*;

public class purchaseHistory extends javax.swing.JFrame {

    // SQL variables
    Connection c = null;
    Statement  s = null;
    ResultSet rs = null;
    
    String  c_type, s_name, c_id;
    int     s_id, c_price;
    
    public purchaseHistory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchaseHistoryPanel = new javax.swing.JPanel();
        partingImageDisplayLabel = new javax.swing.JLabel();
        shopAgainButton = new javax.swing.JButton();
        leaveStoreButton = new javax.swing.JButton();
        purchaseDoneSoFarLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerIdTextPane = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        clothTypeTextPane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        storeIdTextPane = new javax.swing.JTextPane();
        serialNoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clothPriceTextPane = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        purchaseHistoryPanel.setBackground(new java.awt.Color(175, 184, 186));

        partingImageDisplayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clothes/thanks.png"))); // NOI18N

        shopAgainButton.setText("Shop Again");
        shopAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopAgainButtonActionPerformed(evt);
            }
        });

        leaveStoreButton.setText("Leave Store");
        leaveStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveStoreButtonActionPerformed(evt);
            }
        });

        purchaseDoneSoFarLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        purchaseDoneSoFarLabel.setText("Purchases done so far");

        customerIdTextPane.setEditable(false);
        jScrollPane3.setViewportView(customerIdTextPane);

        clothTypeTextPane.setEditable(false);
        jScrollPane2.setViewportView(clothTypeTextPane);

        storeIdTextPane.setEditable(false);
        jScrollPane4.setViewportView(storeIdTextPane);

        serialNoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        serialNoLabel.setText("S.No");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Purchase Details");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Store");

        jScrollPane1.setViewportView(clothPriceTextPane);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Type");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Price");

        javax.swing.GroupLayout purchaseHistoryPanelLayout = new javax.swing.GroupLayout(purchaseHistoryPanel);
        purchaseHistoryPanel.setLayout(purchaseHistoryPanelLayout);
        purchaseHistoryPanelLayout.setHorizontalGroup(
            purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(shopAgainButton)
                        .addGap(50, 50, 50)
                        .addComponent(leaveStoreButton))
                    .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialNoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseHistoryPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49)))
                        .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseHistoryPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(17, 17, 17))))
                    .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2))
                    .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(purchaseDoneSoFarLabel)
                            .addComponent(partingImageDisplayLabel))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        purchaseHistoryPanelLayout.setVerticalGroup(
            purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(partingImageDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(purchaseDoneSoFarLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(serialNoLabel)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shopAgainButton)
                    .addComponent(leaveStoreButton))
                .addGap(46, 46, 46))
        );

        getContentPane().add(purchaseHistoryPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leaveStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveStoreButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_leaveStoreButtonActionPerformed

    private void shopAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopAgainButtonActionPerformed
        new stores.Stores().setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_shopAgainButtonActionPerformed

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
            java.util.logging.Logger.getLogger(purchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchaseHistory().setVisible(true);
            }
        });
    }

    public void establishConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "harish", "earlscourt");
        }
        catch (Exception e) {
            System.err.println("\nFailed to connect to Database");
            e.printStackTrace();
        }
    }
    
    public void getInsertData() {
        
        String storeTable   = "SELECT s_id, s_name from stores";
        String clothTable   = "SELECT cloth_type, cloth_price from cloth";
        
        /* Get data from the stores table */
        try {
            establishConnection();
            s = c.createStatement();
            rs = s.executeQuery(storeTable);
            
            while (rs.next()) {
                s_id    = rs.getInt("s_id");
                s_name  = rs.getString("s_name");
            }
            
            c.close();
            s.close();
            rs.close();
        }catch (Exception e) {
            System.err.println("Connection Failed while fetching data from stores table");
            e.printStackTrace();
        }
        
        /* Get data from the cloth table */
        try {
            establishConnection();
            s  = c.createStatement();
            rs = s.executeQuery(clothTable);
            
            while (rs.next()) {
                c_type = rs.getString("cloth_type");
                c_price   = rs.getInt("cloth_price");
            }
            
            c.close();
            s.close();
            rs.close();
        } catch (Exception e) {
            System.err.println("\nConnection Failed while fetching data from cloth table");
            e.printStackTrace();
        }
        
        updatePurchaseTable(s_id, c_id);
    }
    
    public void updatePurchaseTable(int sId, String cId) {
        
        System.out.println("s_id = " + sId);
        System.out.println("C_ID = " + cId);
        String insert = "INSERT into purchase_history values (" +
                "'" + sId + "'" + "'" + cId + "')";
        
        try {
            establishConnection();
            s  = c.createStatement();
            s.executeUpdate(insert);
            
            s.close();
            c.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void displayPurchaseTable(String ctype, String storeName, int c_price) {
        
        clothTypeTextPane.setText(clothTypeTextPane.getText() + "\n" + ctype);
        storeIdTextPane.setText(storeIdTextPane.getText() + "\n" + storeName);
        clothPriceTextPane.setText(clothPriceTextPane.getText() + "\n" + c_price);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane clothPriceTextPane;
    private javax.swing.JTextPane clothTypeTextPane;
    private javax.swing.JTextPane customerIdTextPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton leaveStoreButton;
    private javax.swing.JLabel partingImageDisplayLabel;
    private javax.swing.JLabel purchaseDoneSoFarLabel;
    private javax.swing.JPanel purchaseHistoryPanel;
    private javax.swing.JLabel serialNoLabel;
    private javax.swing.JButton shopAgainButton;
    private javax.swing.JTextPane storeIdTextPane;
    // End of variables declaration//GEN-END:variables

}
