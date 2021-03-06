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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelProductos;

/**
 *
 * @author Steven
 */
public class ViewProduct extends javax.swing.JDialog {

    ModelProductos model;
    control.ProductosController pC;
    VerInventario vI;
    /**
     * Creates new form ViewProduct
     */
    public ViewProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public ViewProduct(javax.swing.JDialog ventanaPadre, boolean modal, ModelProductos producto) {
        super(ventanaPadre, modal);
        initComponents();
        
        //Actualiza Ventana y Variables
        vI = (VerInventario) ventanaPadre; // Ventana de donde es llamada esta
        
        this.model = producto;           //El producto Seleccionado
        
        String nombre = producto.getNombre(); //Nombre del Producto
        txtDesc.setText(nombre);    //Coloca en TXTNOmbre
        String cantidad = producto.getCantidad(); //Cantidad del Producto
        txtCantidad.setText(cantidad); //Coloca en TXTCantidad
        /////////////////////////////////////////////////////
        setLocationRelativeTo(ventanaPadre);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDesc = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        agregar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDesc.setEditable(false);
        txtDesc.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtDesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 320, 50));

        txtCantidad.setEditable(false);
        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 180, 68));

        agregar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 140, 60));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 40));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 100, 30));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 90, 20));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 320, 50));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 90, 70));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panelver_products.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            pC = new ProductosController();
            pC.delete(model.getIdProducto());
            this.dispose();
            vI.loadAll(0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         try {
            double total = Double.parseDouble(txtCantidad.getText());
            double add = Double.parseDouble(agregar.getText());
            
            modificarCantidad(total, add, 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
        double total = Double.parseDouble(txtCantidad.getText());
        double rem = Double.parseDouble(agregar.getText());

        modificarCantidad(total, rem, 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewProduct dialog = new ViewProduct(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField agregar;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables


    public void modificarCantidad(Double cantActual, Double CantAddRem, int addRem) {

        try {
            double cantMod = 0;
            if (addRem == 0) {

                cantMod = cantActual - CantAddRem;
                if (cantMod < 0) {
                    cantMod = cantActual;
                    JOptionPane.showMessageDialog(this, "No se puede eliminar  por debajo de existencias ");

                } else {
                    //  double cantTemp = cantMod;
                    if (cantMod < 10) {
                        
                    } else {
                        cantMod = cantActual - CantAddRem;
                    }
                }
            } else {

                try {
                    cantMod = cantActual + CantAddRem;
                    double cant_maxima = Double.parseDouble(model.getCantidad_maxima());
                    if (cantMod >= cant_maxima) {
                        ProductosController.message.add("Producto" + model.getIdProducto() + " sobrepasa a la cantidad maxima de reservas");
                    }
                } catch (Exception e) {
                    cantMod = cantActual + CantAddRem;
                }

            }
            pC = new ProductosController();
            pC.editCantidad(cantMod, model.idProducto);
            txtCantidad.setText(cantMod + "");
            vI.loadAll(0);
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(ViewProduct.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Ups- Corrige los datos");
        }

    }

}
