/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jPack_MiPromedio2;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class jFrame_MiNotas extends javax.swing.JFrame {
   JLabel jLabel_Nota1,jLabel_Nota2,jLabel_Nota3,jLabel_resultado;
   JTextField nota1,nota2,nota3;
   JButton nota11;
    /**
     * Creates new form jFrame_MiNotas
     */
    public jFrame_MiNotas() {
        initComponents();
        crearventana();
    }
public void crearventana(){
this.setTitle("Mi Promedio es: ");
this.setSize(500, 400);
this.setLocation(100, 100);

jLabel_Nota1 = new JLabel();
jLabel_Nota1.setText("NOTA 1:");
jLabel_Nota1.setBounds(50, 70, 70, 20);
this.getContentPane().add(jLabel_Nota1);

nota1 = new JTextField();
nota1.setBounds(120, 70, 200, 20);
this.getContentPane().add(nota1);

jLabel_Nota2 = new JLabel();
jLabel_Nota2.setText("NOTA 2:");
jLabel_Nota2.setBounds(50, 100, 70, 20);
this.getContentPane().add(jLabel_Nota2);

nota2 = new JTextField();
nota2.setBounds(120, 100, 200, 20);
this.getContentPane().add(nota2);

jLabel_Nota3 = new JLabel();
jLabel_Nota3.setText("NOTA 3:");
jLabel_Nota3.setBounds(50, 130, 70, 20);
this.getContentPane().add(jLabel_Nota3);

nota3 = new JTextField();
nota3.setBounds(120, 130, 200, 20);
this.getContentPane().add(nota3);

nota11 = new JButton("Calcular");
nota11.setBounds(50, 200, 100, 50);
this.getContentPane().add(nota11); 
 nota11.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
calcularpromedioactionPerformed(evt);
}
});
 ;
jLabel_resultado = new JLabel("");
jLabel_resultado.setBounds(190, 250, 300, 80); 
this.getContentPane().add(jLabel_resultado);
}
  public void calcularpromedioactionPerformed(ActionEvent evt) {
        if (evt.getSource() == nota11) {
            double n1 = Double.parseDouble(nota1.getText());
            double n2 = Double.parseDouble(nota2.getText());
            double n3 = Double.parseDouble(nota3.getText());

            double promedio = (n1 + n2 + n3) / 3;

            jLabel_resultado.setText("El promedio es: " + promedio);
        }
    }  













    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MI PROMEDIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(300, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(jFrame_MiNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_MiNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_MiNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_MiNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_MiNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
