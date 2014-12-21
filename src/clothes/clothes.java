/**
 *
 * @author R. Harish Navnit <harishnavnit@gmail.com>
 */

package clothes;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import stores.Stores;

public class clothes extends javax.swing.JFrame {

    // SQL variables
    Connection          c = null;
    Statement           s = null;
    ResultSet           rs = null;
    ResultSetMetaData   meta = null;
    
    /* Lists to contain data */
    List<List<String>>  rowList     = new LinkedList<> ();
    List<String>        columnList  = new LinkedList<> ();
    
    public clothes() {
        initComponents();
        
        try {
            populateData();
            loadClothesTable();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storePanel = new javax.swing.JPanel();
        clothIdInfoLabel = new javax.swing.JLabel();
        clothIdLabel = new javax.swing.JLabel();
        clothTypeInfoLabel = new javax.swing.JLabel();
        clothTypeLabel = new javax.swing.JLabel();
        clothColorInfoLabel = new javax.swing.JLabel();
        clothColorLabel = new javax.swing.JLabel();
        clothSizeInfoLabel = new javax.swing.JLabel();
        clothSizeLabel = new javax.swing.JLabel();
        clothPriceInfoLabel = new javax.swing.JLabel();
        clothPriceLabel = new javax.swing.JLabel();
        clothBackButton = new javax.swing.JButton();
        purchaseButton = new javax.swing.JButton();
        clothNextButton = new javax.swing.JButton();
        clothDisplayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        storePanel.setBackground(new java.awt.Color(210, 231, 175));

        clothIdInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothIdInfoLabel.setText("Shipment");

        clothIdLabel.setText("Id");

        clothTypeInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothTypeInfoLabel.setText("Type");

        clothTypeLabel.setText("Type");

        clothColorInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothColorInfoLabel.setText("Color");

        clothColorLabel.setText("Color");

        clothSizeInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothSizeInfoLabel.setText("Size");

        clothSizeLabel.setText("Size");

        clothPriceInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothPriceInfoLabel.setText("Price");

        clothPriceLabel.setText("Price");

        clothBackButton.setText("Back");
        clothBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothBackButtonActionPerformed(evt);
            }
        });

        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        clothNextButton.setText("View Next");
        clothNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothNextButtonActionPerformed(evt);
            }
        });

        clothDisplayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stores/stack-o-shirts.jpg"))); // NOI18N

        javax.swing.GroupLayout storePanelLayout = new javax.swing.GroupLayout(storePanel);
        storePanel.setLayout(storePanelLayout);
        storePanelLayout.setHorizontalGroup(
            storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(storePanelLayout.createSequentialGroup()
                        .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clothIdInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(clothTypeInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clothColorInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clothSizeInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clothPriceInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(storePanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(clothBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(storePanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(purchaseButton)
                                .addGap(36, 36, 36)
                                .addComponent(clothNextButton))
                            .addGroup(storePanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clothIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clothSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clothColorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(clothTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clothPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(clothDisplayLabel))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        storePanelLayout.setVerticalGroup(
            storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(clothDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothIdInfoLabel)
                    .addComponent(clothIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothTypeInfoLabel)
                    .addComponent(clothTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothColorInfoLabel)
                    .addComponent(clothColorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothSizeLabel)
                    .addComponent(clothSizeInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothPriceInfoLabel)
                    .addComponent(clothPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothBackButton)
                    .addComponent(purchaseButton)
                    .addComponent(clothNextButton))
                .addGap(33, 33, 33))
        );

        getContentPane().add(storePanel, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateData() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "harish", "earlscourt");
            s = c.createStatement();
            rs = s.executeQuery("SELECT * from cloth");
            meta = rs.getMetaData();
            final int col_count = meta.getColumnCount();
            
            while (rs.next()) {
                rowList.add(columnList);
                
                for (int i = 1; i < col_count; i++) {
                    Object value = rs.getObject(i);
                    
                    if (value != null) {
                        columnList.add(String.valueOf(value));
                    }
                    else {
                        columnList.add(null);
                    }
                }
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
    
    /**
     *
     */
    public void loadClothesTable() {
        for(int i = 0; i < rowList.size(); i++) {  
            int j = 0;
            List<String> cols = rowList.get(i);
            String curr_val = cols.get(i);
            
            do  {
                System.out.print("\nElement at " + j + " = " + cols.get(j));
                curr_val = cols.get(j);
                if (j < 5) {
                    if (j == 0)     clothIdLabel.setText(curr_val);
                    if (j == 1)     clothTypeLabel.setText(curr_val);
                    if (j == 2)     clothColorLabel.setText(curr_val);
                    if (j == 3)     clothSizeLabel.setText(curr_val);
                    if (j == 4)     clothPriceLabel.setText(curr_val);
                }
                else {
                    if (j % 5 == 0)     clothIdLabel.setText(curr_val);
                    if (j % 5 == 1)     clothTypeLabel.setText(curr_val);
                    if (j % 5 == 2)     clothColorLabel.setText(curr_val);
                    if (j % 5 == 3)     clothSizeLabel.setText(curr_val);
                    if (j % 5 == 4)     clothPriceLabel.setText(curr_val);                
                }
                // Increment j onViewNextButton press
                //if (viewNextStoreButtonActionPerformed()) ++j;
                j++;
            }   while (j < cols.size());
        }
    }
    
    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        new purchaseHistory().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void clothBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothBackButtonActionPerformed
        new Stores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clothBackButtonActionPerformed

    private void clothNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothNextButtonActionPerformed
        loadClothesTable();
    }//GEN-LAST:event_clothNextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clothes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clothBackButton;
    private javax.swing.JLabel clothColorInfoLabel;
    private javax.swing.JLabel clothColorLabel;
    private javax.swing.JLabel clothDisplayLabel;
    private javax.swing.JLabel clothIdInfoLabel;
    private javax.swing.JLabel clothIdLabel;
    private javax.swing.JButton clothNextButton;
    private javax.swing.JLabel clothPriceInfoLabel;
    private javax.swing.JLabel clothPriceLabel;
    private javax.swing.JLabel clothSizeInfoLabel;
    private javax.swing.JLabel clothSizeLabel;
    private javax.swing.JLabel clothTypeInfoLabel;
    private javax.swing.JLabel clothTypeLabel;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JPanel storePanel;
    // End of variables declaration//GEN-END:variables

}
