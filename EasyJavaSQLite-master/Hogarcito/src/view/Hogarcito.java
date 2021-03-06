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

import subView.Acerca;
import control.ProductosController;
import java.awt.Color;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Steven
 */
public class Hogarcito extends javax.swing.JFrame {

    /**
     * Creates new form Hogarcito
     */
    ProductosController productController;
    public VerInventario vI ;
    public Hogarcito() throws ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        productController= new ProductosController();
        ProductosController.message = list1;
        vI = new VerInventario(this, true,productController);
    }
//========================================================
    public void onMouseEntered(JButton button){
        button.setBackground(Color.WHITE);
    }
//========================================================
    public void onMouseExit(JButton button){
        button.setBackground(new Color(51, 204, 255));
    }
//========================================================
    public void restartInventario(){
        vI = new VerInventario(this, true,productController);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        list1 = new java.awt.List();
        labelAdd = new javax.swing.JLabel();
        labelImage = new javax.swing.JLabel();
        labelInventario = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel Inicio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 640, 180));

        labelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddMouseClicked(evt);
            }
        });
        getContentPane().add(labelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 90));

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_inicio.jpg"))); // NOI18N
        getContentPane().add(labelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labelInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(labelInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddMouseClicked
       AddProduct addP = new AddProduct(this, true,productController,1);
     addP.setLocationRelativeTo(this);
     addP.setVisible(true);
    }//GEN-LAST:event_labelAddMouseClicked

    private void labelInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInventarioMouseClicked
    
     
      vI.setLocationRelativeTo(this);
       vI.setVisible(true);
    }//GEN-LAST:event_labelInventarioMouseClicked
Connection connection = null;
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
            java.util.logging.Logger.getLogger(Hogarcito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hogarcito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hogarcito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hogarcito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Hogarcito().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Hogarcito.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelAdd;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelInventario;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
