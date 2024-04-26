/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jPack_MejorAmigo;
import javax.swing.*;

public class jFrame_MejorAmigo extends javax.swing.JFrame {
 private JLabel jLabel_Nota1;
    private JTextField nota1;
    private JButton mejoramige;
    private JLabel jLabel_resultado;
    public jFrame_MejorAmigo() {
        initComponents();
        this.setTitle("MEJOR AMIGO"); 
        this.setSize(500, 400);
        this.setLocation(100, 100);
        
        JLabel jLabel_Nota1 = new JLabel();
        jLabel_Nota1.setText("Ingrese el nombre de su mejor amigo:");
        jLabel_Nota1.setBounds(100, 70, 250, 20); 
        this.getContentPane().add(jLabel_Nota1);

        JTextField nota1 = new JTextField();
        nota1.setBounds(100, 100, 250, 30); 
        this.getContentPane().add(nota1);
        mejoramige = new JButton();
        mejoramige.setBounds(50, 200, 180, 50);
        mejoramige.setText("Mostrar mejor amigo");
        mejoramige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String amigo = nota1.getText();
                jLabel_resultado.setText("Tu mejor amigo es " + amigo);
            }
        });
        this.getContentPane().add(mejoramige);

        jLabel_resultado = new JLabel();
        jLabel_resultado.setText("");
        jLabel_resultado.setBounds(180, 270, 250, 40);
        this.getContentPane().add(jLabel_resultado);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(jFrame_MejorAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_MejorAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_MejorAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_MejorAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_MejorAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
