/*
 * Copyright (C) 2015 Steven Rod.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package view;

import control.ProductosController;
import java.awt.Frame;
import java.util.ArrayList;
import model.ModelProductos;

/**
 *
 * @author Steven
 */
public class VerInventario extends javax.swing.JDialog {

    Frame parent;
    ProductosController productC;
    ArrayList<ModelProductos> allProducts;

    /**
     * Creates new form VerInventario
     * @param parent
     * @param modal
     * @param pC
     */
    public VerInventario(java.awt.Frame parent, boolean modal, ProductosController pC) {
        super(parent, modal);
        initComponents();
        productC = pC;
        loadAll(0);
    }

     public VerInventario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        loadAll(0);
    }
     
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("verInv"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idProducto", "Nombre", "Descripcion", "Cantidad", "Unidad Medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 680, 300));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 250, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_products.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            if (evt.getClickCount() == 2) {

                int row = jTable1.getSelectedRow();
                String obj = jTable1.getValueAt(row, 0).toString();
                //JOptionPane.showMessageDialog(this, obj);
                ModelProductos product = getProduct(obj);
                view.ViewProduct vP = new ViewProduct(this, true, product);
                vP.setVisible(true);

            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String type = jTextField1.getText();
        loadTyped(type);

    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerInventario dialog = new VerInventario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    //================================================================================

    public void loadAll(int c) {

        clearTable();
        ProductosController.message.removeAll();
        allProducts = productC.getAllProducts();
        int cont = 0;
        while (cont != allProducts.size()) {

            if (c == 0) {
                toTable(cont);
            }

            cont = cont + 1;
        }

    }

    public void toTable(int cont) {
        ModelProductos model = allProducts.get(cont);
        jTable1.setValueAt(model.getIdProducto(), cont, 0);
        jTable1.setValueAt(model.getNombre(), cont, 1);
        jTable1.setValueAt(model.getDescripcion(), cont, 2);
        jTable1.setValueAt(model.getCantidad(), cont, 3);
        jTable1.setValueAt(model.getUnidad_medida(), cont, 4);

        double cant = Double.parseDouble(model.cantidad);
        if (cant <= 10) {
            ProductosController.message.add("Producto: " + model.getNombre() + " esta bajo de reservas");
        }
    }

    //================================================================================

    private void loadTyped(String c) {
        clearTable();
        allProducts = productC.getAllProducts();
        int cont = 0;
        int contR = 0;
        while (cont != allProducts.size()) {
            ModelProductos actualP = allProducts.get(cont);
            if (actualP.nombre.contains(c)) {
                jTable1.setValueAt(actualP.getIdProducto(), contR, 0);
                jTable1.setValueAt(actualP.getNombre(), contR, 1);
                jTable1.setValueAt(actualP.getDescripcion(), contR, 2);
                jTable1.setValueAt(actualP.getCantidad(), contR, 3);
                jTable1.setValueAt(actualP.getUnidad_medida(), contR, 4);
                contR = contR + 1;
            }
            cont = cont + 1;
        }

    }

    //=================================================================================
    public void clearTable() {
        int c = 0;
        int f = 0;
        while (f != jTable1.getRowCount()) {
            c = 0;
            while (c != jTable1.getColumnCount()) {
                jTable1.setValueAt("", f, c);
                c = c + 1;
            }
            f = f + 1;
        }

    }
  ////////////////////// Obtiene un producto por ID ////////////////////////////
    private ModelProductos getProduct(String id) {

        ModelProductos ret = null;
        int c = 0;
        while (c != allProducts.size()) {
            if (allProducts.get(c).getIdProducto().equals(id)) {
                ret = allProducts.get(c);
                break;
            } else {
                c = c + 1;
            }
        }
        return ret;
    }

}
