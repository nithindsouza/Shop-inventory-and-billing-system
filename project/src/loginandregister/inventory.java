
package loginandregister;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class inventory extends javax.swing.JFrame {

    /**
     * Creates new form inventory
     */
    public inventory() {
        initComponents();
        fetch();
       
    }
   public void fetch(){
        try{
            Connection cn = mysqlconnection.getconnection();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM inventory");
            ResultSet rs =ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)jTable_DisplayUser.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[] = {rs.getString("id"),rs.getString("name"),rs.getString("price"),rs.getString("category"),rs.getString("quantity")};
                tm.addRow(o);
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        }

        
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        comboCat = new javax.swing.JComboBox<>();
        btn_delete = new javax.swing.JButton();
        btn_insert = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_DisplayUser = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVENTORY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Kgs");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 80, 35));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 187, 38, 34));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("CATEGORY :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 124, 35));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("QUANTITY :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 35));

        txtPrice.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 179, -1));

        txtName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 250, 179, -1));

        txtId.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 186, 179, -1));

        comboCat.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        comboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits", "Veges", "FastFoods", "Chocolates", "IceCreams" }));
        jPanel1.add(comboCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 378, 179, 35));

        btn_delete.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 500, 124, 34));

        btn_insert.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_insert.setText("INSERT");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        jPanel1.add(btn_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 500, 124, 34));

        jButton4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 188, 124, 36));

        jTable_DisplayUser.setBackground(new java.awt.Color(102, 153, 255));
        jTable_DisplayUser.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTable_DisplayUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PRICE", "CATEGORY", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_DisplayUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DisplayUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_DisplayUser);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 131, 835, -1));

        btn_update.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 124, 34));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("PRICE :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 82, 35));

        txtQuantity.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 179, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("NAME :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 80, 35));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       txtId.setText("");
       txtName.setText("");
       txtPrice.setText("");
       txtQuantity.setText("");
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
          
        String id = txtId.getText();
        String name = txtName.getText();
        String price = txtPrice.getText();
        String category = comboCat.getSelectedItem().toString();
         String quantity = txtQuantity.getText();
        
        if(id.equals("")){
             JOptionPane.showMessageDialog(null, "ADD ID");
        }else if(name.equals("")){
         JOptionPane.showMessageDialog(null, "ADD A NAME");
    }else if(price.equals("")){
         JOptionPane.showMessageDialog(null, "ADD price");
    }else if(category.equals(""))
    {
         JOptionPane.showMessageDialog(null, "SELECT CATEGORY");
    }else if(quantity.equals(""))
    {
         JOptionPane.showMessageDialog(null, "ADD QUANTITY");
    }
         String query = "INSERT INTO inventory VALUES ('"+id+"','"+name+"','"+price+"','"+category+"','"+quantity+"')";
         
          Statement stmt = null;
           try{Connection con = mysqlconnection.getconnection();
            stmt = con.createStatement();
            stmt.executeUpdate(query);
             
            JOptionPane.showMessageDialog(null,"ITEM ADDED SUCCESSFULLY");
           
           }catch (SQLException ex){
               JOptionPane.showMessageDialog(null,"UNABLE TO ADD A ITEM  \n PLEASE FILL VALID DETAILS");
           }
         fetch();
         
          txtId.setText("");
       txtName.setText("");
       txtPrice.setText("");
         txtQuantity.setText("");
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       String id = txtId.getText();
 
       String query = "DELETE FROM inventory WHERE id='"+id+"'";
        
         Statement stmt = null;
           try{Connection con = mysqlconnection.getconnection();    
            stmt = con.createStatement();
            stmt.executeUpdate(query);
             
            JOptionPane.showMessageDialog(null,"ITEM DELETED SUCCESSFULLY");
           
           }catch (SQLException ex){
               JOptionPane.showMessageDialog(null,"UNABLE TO DELETE A ITEM\n PLEASE TRY AGAIN");
           }
        fetch();
         txtId.setText("");
       txtName.setText("");
       txtPrice.setText("");
        txtQuantity.setText("");

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String name = txtName.getText();
        String price = txtPrice.getText();
        String category = comboCat.getSelectedItem().toString();
         String quantity = txtQuantity.getText();
        
        if(id.equals("")){
             JOptionPane.showMessageDialog(null, "ADD ID");
        }else if(name.equals("")){
         JOptionPane.showMessageDialog(null, "ADD A NAME");
    }else if(price.equals("")){
         JOptionPane.showMessageDialog(null, "ADD price");
    }else if(category.equals(""))
    {
         JOptionPane.showMessageDialog(null, "SELECT CATEGORY");
    }else if(quantity.equals(""))
    {
         JOptionPane.showMessageDialog(null, "ADD QUANTITY");
    }
         String query = "UPDATE inventory set name = '"+name+"',price = '"+price+"',category = '"+category+"',quantity = '"+quantity+"' WHERE id = '"+id+"' ";
     
          Statement stmt = null;
           try{Connection con = mysqlconnection.getconnection();
            stmt = con.createStatement();
            stmt.executeUpdate(query);
             
            JOptionPane.showMessageDialog(null,"ITEM UPDATED SUCCESSFULLY");
           
           }catch (SQLException ex){
               JOptionPane.showMessageDialog(null,"UNABLE TO UPDATE A ITEM \n PLEASE FILL VALID DETAILS");
           }
         fetch();
         
          txtId.setText("");
       txtName.setText("");
       txtPrice.setText("");
         txtQuantity.setText("");
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jTable_DisplayUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DisplayUserMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable_DisplayUser.getModel();
        int selectedRowIndex = jTable_DisplayUser.getSelectedRow();
           txtId.setText(model.getValueAt(selectedRowIndex, 0).toString());
           txtName.setText(model.getValueAt(selectedRowIndex, 1).toString());
           txtPrice.setText(model.getValueAt(selectedRowIndex, 2).toString());
       comboCat.addItem(model.getValueAt(selectedRowIndex, 3).toString());
       txtQuantity.setText(model.getValueAt(selectedRowIndex, 4).toString());
       JOptionPane.showMessageDialog(null,"PLEASE DO SELECT CATEGORY\nFIELD MANUALLY BEFORE UPDATING!! \n DEFAULT CATEGORY IS FRUITS");
    }//GEN-LAST:event_jTable_DisplayUserMouseClicked

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtQuantityActionPerformed

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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> comboCat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_DisplayUser;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
