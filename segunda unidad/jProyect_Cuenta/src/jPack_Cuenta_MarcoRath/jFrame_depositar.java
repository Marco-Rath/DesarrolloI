/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jPack_Cuenta_MarcoRath;

import javax.swing.JOptionPane;

public class jFrame_depositar extends javax.swing.JFrame {
private CuentaFacil cuenta;
  
    public jFrame_depositar() {
        initComponents();
       cuenta = new CuentaFacil("Marco", 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jbtn_depositar = new javax.swing.JButton();
        jbtn_retirar = new javax.swing.JButton();
        jbtn_resultado = new javax.swing.JLabel();
        jlabel_saldoagregado = new javax.swing.JLabel();
        jlabel_saldoretirado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtn_depositar.setText("Depositar");
        jbtn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_depositarActionPerformed(evt);
            }
        });

        jbtn_retirar.setText("Retirar");
        jbtn_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_retirarActionPerformed(evt);
            }
        });

        jbtn_resultado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        jlabel_saldoagregado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        jlabel_saldoretirado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_depositar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_retirar))
                    .addComponent(jlabel_saldoagregado, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jbtn_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_saldoretirado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jlabel_saldoagregado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_saldoretirado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_depositar)
                    .addComponent(jbtn_retirar))
                .addGap(18, 18, 18)
                .addComponent(jbtn_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>                        

    private void jbtn_depositarActionPerformed(java.awt.event.ActionEvent evt) {                                               
    double cantidad = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la cantidad a depositar:"));
        cuenta.depositar(cantidad);
       
        jlabel_saldoagregado.setText("Saldo depositado: " + cantidad);
        jbtn_resultado.setText("Saldo actual: " + cuenta.getCantidad());
    }                                              

    private void jbtn_retirarActionPerformed(java.awt.event.ActionEvent evt) {                                             
     double cantidad = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la cantidad a retirar:"));
    if (cuenta.retirar(cantidad)) {
        jlabel_saldoretirado.setText("Saldo retirado: " + cantidad);
    } else {
        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
    }
    jbtn_resultado.setText("Saldo actual: " + cuenta.getCantidad());
    }                                            

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
            java.util.logging.Logger.getLogger(jFrame_depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_depositar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jbtn_depositar;
    private javax.swing.JLabel jbtn_resultado;
    private javax.swing.JButton jbtn_retirar;
    private javax.swing.JLabel jlabel_saldoagregado;
    private javax.swing.JLabel jlabel_saldoretirado;
    // End of variables declaration                   
}
