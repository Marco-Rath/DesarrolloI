/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jPack_Tienda_MarcoRath;

/**
 *
 * @author Isabel
 */
public class jFrame_Seleccion extends javax.swing.JFrame {

    /**
     * Creates new form jFrame_Seleccion
     */
    public jFrame_Seleccion() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        jbtn_pantalon = new javax.swing.JButton();
        jbtn_camisa = new javax.swing.JButton();
        jbtn_casaca = new javax.swing.JButton();
        jbtn_calsado = new javax.swing.JButton();
        panel_interfas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Times", 2, 36)); // NOI18N
        label_titulo.setText("Seleccione Su Compra");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 16, 348, -1));

        jbtn_pantalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pantalon.PNG"))); // NOI18N
        jbtn_pantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_pantalonActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_pantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 48, -1, -1));

        jbtn_camisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camiza.PNG"))); // NOI18N
        jbtn_camisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_camisaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_camisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 201, -1, -1));

        jbtn_casaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casaca.PNG"))); // NOI18N
        jbtn_casaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_casacaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_casaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 108, -1, 308));

        jbtn_calsado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calsado.PNG"))); // NOI18N
        jbtn_calsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_calsadoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_calsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 108, -1, -1));

        panel_interfas.setBackground(new java.awt.Color(51, 51, 51));
        panel_interfas.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panel_interfasLayout = new javax.swing.GroupLayout(panel_interfas);
        panel_interfas.setLayout(panel_interfasLayout);
        panel_interfasLayout.setHorizontalGroup(
            panel_interfasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        panel_interfasLayout.setVerticalGroup(
            panel_interfasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(panel_interfas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_casacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_casacaActionPerformed
      jFrame_casacas casaca=new jFrame_casacas();
      casaca.setVisible(true);
      dispose();
      
    }//GEN-LAST:event_jbtn_casacaActionPerformed

    private void jbtn_calsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_calsadoActionPerformed
       jFrame_calsado calsado=new jFrame_calsado();
       calsado.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_calsadoActionPerformed

    private void jbtn_pantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_pantalonActionPerformed
     jFrame_Pantalones pantalon=new jFrame_Pantalones();
     pantalon.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_pantalonActionPerformed

    private void jbtn_camisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_camisaActionPerformed
      jFrame_Camisa camisa=new jFrame_Camisa();
      camisa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_camisaActionPerformed

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
            java.util.logging.Logger.getLogger(jFrame_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_calsado;
    private javax.swing.JButton jbtn_camisa;
    private javax.swing.JButton jbtn_casaca;
    private javax.swing.JButton jbtn_pantalon;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_interfas;
    // End of variables declaration//GEN-END:variables
}
