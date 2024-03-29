/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package green_supermarket.admin;

import green_supermarket.dao.ProductDao;
import green_supermarket.dao.Statistics;
import green_supermarket.user.UserDashboard;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nimesh
 */
public class ManageProduct extends javax.swing.JFrame {

    ProductDao productDao;
    Statistics statistics;
    Color notEdit = new Color(204, 204, 204);
    Color textPrimaryColor = new Color(30, 30, 30);
    Color primaryColor = new Color(255, 255, 255);
    DefaultTableModel model;
    int xx, xy;
    private int pid;
    String[] categories;

    /**
     * Creates new form Manage_product
     */
    public ManageProduct() throws SQLException {
        this.statistics = new Statistics();
        this.productDao = new ProductDao();
        initComponents();
        init();
    }

    private void init() {
        productTable();
        txt_pid1.setBackground(notEdit);
        txt_pid1.setText(String.valueOf(productDao.getMaxRow()));
        categories = new String[productDao.countCategories()];
        setCat();
    }

    private void setCat(){
        categories = productDao.getCat();
        for(String s: categories){
            jComboBox1.addItem(s);
        }
    }
    
    private void productTable() {
        productDao.getProductsValue(jTable3, "");
        model = (DefaultTableModel) jTable3.getModel();
        jTable3.setRowHeight(30);
        jTable3.setShowGrid(true);
        jTable3.setGridColor(Color.BLACK);
        jTable3.setBackground(Color.WHITE);
        jTable3.setSelectionBackground(Color.LIGHT_GRAY);
    }

    public boolean isEmpty() {
        if (txt_pname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter product name", "Warning", 2);
            return false;
        }
        if (jComboBox1.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Select a product category", "Warning", 2);
            return false;
        }
        if (txt_quantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product quantity required", "Warning", 2);
            return false;
        }
        if (txt_price.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product price is required", "Warning", 2);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txt_pname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btn_refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_pid1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txt_pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 214, 30));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 104, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 117, -1));
        jPanel3.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 214, 30));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 95, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 260, 30));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 60, 30));

        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category Name ", "Quantity", "Price"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 557, 460));

        btn_refresh.setBackground(new java.awt.Color(0, 102, 102));
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel3.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 110, 30));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product ID");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 79, -1));

        txt_pid1.setEditable(false);
        jPanel3.add(txt_pid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 214, 30));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 79, -1));
        jPanel3.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 214, 30));

        btn_update.setBackground(new java.awt.Color(0, 102, 102));
        btn_update.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 90, -1));

        btn_add.setBackground(new java.awt.Color(0, 102, 102));
        btn_add.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 90, -1));

        btn_clear.setBackground(new java.awt.Color(0, 102, 102));
        btn_clear.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 90, -1));

        btn_delete.setBackground(new java.awt.Color(0, 102, 102));
        btn_delete.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 90, -1));

        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 210, 30));

        jLabel11.setBackground(new java.awt.Color(0, 153, 102));
        jLabel11.setFont(new java.awt.Font("Kannada MN", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("X");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();

        int rIndex = jTable3.getSelectedRow();

        txt_pid1.setText(model.getValueAt(rIndex, 0).toString());
        txt_pname.setText(model.getValueAt(rIndex, 1).toString());
        jComboBox1.setSelectedItem(model.getValueAt(rIndex, 2).toString());
        txt_quantity.setText(model.getValueAt(rIndex, 3).toString());
        txt_price.setText(model.getValueAt(rIndex, 4).toString());

    }//GEN-LAST:event_jTable3MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if (isEmpty()) {
            int pid = Integer.parseInt(txt_pid1.getText());
            String pro = txt_pname.getText();
            String cat = jComboBox1.getSelectedItem().toString();
            int pqty = Integer.parseInt(txt_quantity.getText());
            double pprice = Double.parseDouble(txt_price.getText());
            productDao.updateProduct(pid, pro, cat, pqty, pprice);
        }
    }//GEN-LAST:event_btn_updateActionPerformed


    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if (isEmpty()) {
            int pid = Integer.parseInt(txt_pid1.getText());
            String pro = txt_pname.getText();
            String cat = jComboBox1.getSelectedItem().toString();
            int pqty = Integer.parseInt(txt_quantity.getText());
            double pprice = Double.parseDouble(txt_price.getText());
            if (!productDao.isIDExist(pid)) {
                if (!productDao.isProCatExist(pro, cat)) {
                    productDao.insert(pid, pro, cat, pqty, pprice);
                    jTable3.setModel(new DefaultTableModel(null,new Object[]{"Product ID","Product Name","Category Name","Quantity","Price"}));
                    productDao.getProductsValue(jTable3, "");
                    clear();
                } else {
                    JOptionPane.showMessageDialog(this, "This product id already exists", "Warning", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Product name or category type already exists", "Warning", 2);
            }
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void clear(){
        txt_pid1.setText(String.valueOf(productDao.getMaxRow()));
        txt_pname.setText("");
        jComboBox1.setSelectedItem(-1);
        txt_quantity.setText("");
        txt_price.setText("");
        statistics.admin();
    }

            
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        productDao.deleteProduct(pid);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        AdminDashboard.jPanel9.setBackground(primaryColor);
        AdminDashboard.jPanel10.setBackground(primaryColor);
        AdminDashboard.jLabel9.setForeground(textPrimaryColor);
        AdminDashboard.jLabel10.setVisible(true);
        AdminDashboard.jLabel19.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        model.setRowCount(0);
        productTable();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        jTable3.setModel(new DefaultTableModel(null, new Object[]{"Product ID","Product Name","Category Name","Quantity","Price"}));
        productDao.getProductsValue(jTable3, "");
    }//GEN-LAST:event_jTextField4KeyReleased

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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManageProduct().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ManageProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txt_pid1;
    private javax.swing.JTextField txt_pname;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
