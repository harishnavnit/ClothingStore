/**
 *
 * @author R. Harish Navnit<harishnavnit@gmail.com>
 */

package clothes;

import java.sql.*;
import customer.login.*;
import java.util.LinkedList;
import java.util.List;
import stores.*;

public class purchaseHistory extends javax.swing.JFrame {

    String  serialNum, storeName, clothType, clothColor, clothSize, clothPrice;
    int clothId, storeId;

    // SQL variables
    Connection          c = null;
    Statement           s = null;
    ResultSet           rs = null;
    ResultSetMetaData   meta = null;

    /* Lists to contain tabular data */
    List<List<String>>  rows            = new LinkedList<> ();
    List<Integer>       serialNumList   = new LinkedList<> ();
    List<Integer>       clothIdList     = new LinkedList<> ();
    List<Integer>       storeIdList     = new LinkedList<> ();
    List<String>        clothTypeList   = new LinkedList<> ();
    List<String>        clothSizeList   = new LinkedList<> ();
    List<String>        clothPriceList  = new LinkedList<> ();
    List<String>        storeNameList   = new LinkedList<> ();

    public purchaseHistory() {
        initComponents();
        try {
            establishConnection();
            populateData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        displayPurchaseTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchaseHistoryPanel = new javax.swing.JPanel();
        partingImageDisplayLabel = new javax.swing.JLabel();
        shopAgainButton = new javax.swing.JButton();
        leaveStoreButton = new javax.swing.JButton();
        purchaseDoneSoFarLabel = new javax.swing.JLabel();
        purchaseHistoryScrollPane = new javax.swing.JScrollPane();
        purchaseHistoryTable = new javax.swing.JTable();

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

        purchaseDoneSoFarLabel.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        purchaseDoneSoFarLabel.setText("Purchases done so far");

        purchaseHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.No", "Store Name", "Cloth Type", "Cloth Size", "Cloth Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        purchaseHistoryScrollPane.setViewportView(purchaseHistoryTable);

        javax.swing.GroupLayout purchaseHistoryPanelLayout = new javax.swing.GroupLayout(purchaseHistoryPanel);
        purchaseHistoryPanel.setLayout(purchaseHistoryPanelLayout);
        purchaseHistoryPanelLayout.setHorizontalGroup(
            purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                        .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(shopAgainButton)
                                .addGap(74, 74, 74)
                                .addComponent(leaveStoreButton))
                            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(purchaseDoneSoFarLabel)
                                    .addComponent(partingImageDisplayLabel))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseHistoryPanelLayout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(purchaseHistoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        purchaseHistoryPanelLayout.setVerticalGroup(
            purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(partingImageDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(purchaseDoneSoFarLabel)
                .addGap(31, 31, 31)
                .addComponent(purchaseHistoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shopAgainButton)
                    .addComponent(leaveStoreButton))
                .addContainerGap(53, Short.MAX_VALUE))
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

    public boolean establishConnection() {

        System.out.println("\nEstablishing Connection");
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dennis", "dennis", "earlscourt");
        }
        catch (Exception e) {
            System.err.println("\nFailed to connect to Database");
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public void populateData() {
        // Use the getStoreName function
        try {
            if (establishConnection()) {
                s = c.createStatement();
                rs = s.executeQuery("SELECT * from cloth");
                meta = rs.getMetaData();
                final int col_count = meta.getColumnCount();

                while (rs.next()) {
                    for (int i = 1; i <= col_count; i++) {
                        serialNumList.add(i);

                        Object val = rs.getObject(i);

                        if (val != null) {
                            //if (i == 1)     {storeIdList.add((Integer) val); getStoreName((Integer) val); }
                            if (i == 2)     clothIdList.add((Integer) val);
                            if (i == 3)     clothTypeList.add(String.valueOf(val));
                            if (i == 4)     ;//System.out.println("Cloth Color : " + String.valueOf(val);
                            if (i == 5)     clothSizeList.add(String.valueOf(val));
                            if (i == 6)     clothPriceList.add(String.valueOf(val));
                        }
                        else {
                            //if (i == 1)     {storeIdList.add(null); getStoreName((Integer) val); }
                            if (i == 2)     clothIdList.add(null);
                            if (i == 3)     clothTypeList.add(null);
                            if (i == 4)     ;//System.out.println("Cloth Color : " + String.valueOf(val));
                            if (i == 5)     clothSizeList.add(null);
                            if (i == 6)     clothPriceList.add(String.valueOf(val));
                        }
                    }

                    /* Insert columns into the rows */
                    //rows.add(serialNumList);
                    rows.add(storeNameList);
                    rows.add(clothTypeList);
                    rows.add(clothSizeList);
                    rows.add(clothPriceList);
                }
            } else {
                System.err.println("\nPlease ensure you're connected to the Database.");
            }
        } catch (Exception e) {
            System.err.println("Failed to fetch the data from database !");
            e.printStackTrace();
        }

        //updatePurchaseTable(storeId, clothId);
    }

    public void getStoreName(int val) {

        try {
            if (establishConnection()) {
                s = c.createStatement();
                s.executeQuery("select getStoreName(" + val + ")");

                while (rs.next()) {
                    String name = rs.getString("getstorename");
                    storeNameList.add(name);
                }
            }
        } catch (Exception e) {
            System.err.println("\nFailed to retrieve the store name");
            e.printStackTrace();
        }
    }

    public void updatePurchaseTable(int storeId, int clothId) {
        /** NOTE : relation in backend has changed !
         *  Need to provide customerId as one of the
         * arguments along with the list of args present already
         */
        System.out.println("Updating the reference table");
        String insert = "INSERT into purchase_history values (" + storeId + "," + clothId + ")";
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

    public void displayPurchaseTable() {

        int row_count        = purchaseHistoryTable.getRowCount();
        int col_count        = purchaseHistoryTable.getColumnCount();
        int actual_row_count = rows.size();
        int actual_col_count = serialNumList.size();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0)     purchaseHistoryTable.setValueAt((Object)serialNumList.get(i), i, j);
                if (j == 1)     purchaseHistoryTable.setValueAt((Object)clothIdList.get(i), i, j);
                //if (j == 2)     purchaseHistoryTable.setValueAt((Object)storeNameList.get(j), i, j);
                if (j == 2)     purchaseHistoryTable.setValueAt((Object)clothTypeList.get(i), i, j);
                if (j == 3)     purchaseHistoryTable.setValueAt(clothSizeList.get(i), i, j);
                if (j == 4)     purchaseHistoryTable.setValueAt((Object)clothPriceList.get(i), i, j);
            }
        }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton leaveStoreButton;
    private javax.swing.JLabel partingImageDisplayLabel;
    private javax.swing.JLabel purchaseDoneSoFarLabel;
    private javax.swing.JPanel purchaseHistoryPanel;
    private javax.swing.JScrollPane purchaseHistoryScrollPane;
    private javax.swing.JTable purchaseHistoryTable;
    private javax.swing.JButton shopAgainButton;
    // End of variables declaration//GEN-END:variables

}
