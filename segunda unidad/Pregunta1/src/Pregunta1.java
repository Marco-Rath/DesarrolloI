
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Pregunta1 extends javax.swing.JFrame {

    int nota1,nota2,nota3;
    int count=0;
    public Pregunta1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo_principal = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_inicio = new javax.swing.JTextField();
        txt_fin = new javax.swing.JTextField();
        txt_intervalo = new javax.swing.JTextField();
        jbtn_rellenar = new javax.swing.JButton();
        jbtn_vaciar = new javax.swing.JButton();
        jlabel_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        combo_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_principalActionPerformed(evt);
            }
        });

        jLabel1.setText("Progresion");

        jLabel2.setText("Inicio");

        jLabel3.setText("Fin");

        jLabel4.setText("Intervalo");

        txt_inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        txt_fin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        txt_intervalo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        jbtn_rellenar.setText("Rellenar");
        jbtn_rellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_rellenarActionPerformed(evt);
            }
        });

        jbtn_vaciar.setText("Vaciar");
        jbtn_vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_vaciarActionPerformed(evt);
            }
        });

        jlabel_resultado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(combo_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_intervalo, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(txt_fin))))
                    .addComponent(jbtn_rellenar)
                    .addComponent(jbtn_vaciar)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlabel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txt_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_fin, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_rellenar)
                .addGap(18, 18, 18)
                .addComponent(jbtn_vaciar)
                .addGap(18, 18, 18)
                .addComponent(jlabel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void calculando(int nota1, int nota2, int nota3) {
    combo_principal.removeAllItems();
    if (nota1 > nota2 || nota3 <= 0) {
        throw new IllegalArgumentException("Los valores de entrada no son válidos.");
    }

    int incremento = Math.abs(nota3);
    for (int i = nota1; i <= nota2; i += incremento) {
        combo_principal.addItem(String.valueOf(i));
    }
}
    
    
    private void jbtn_rellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_rellenarActionPerformed
 String inicioText = txt_inicio.getText();
    String finText = txt_fin.getText();
    String intervaloText = txt_intervalo.getText();

    if (!inicioText.matches("\\d+") || !finText.matches("\\d+") || !intervaloText.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números enteros.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return; // Sale del método si se muestra la advertencia
    }

    int nota1 = Integer.parseInt(inicioText);
    int nota2 = Integer.parseInt(finText);
    int nota3 = Integer.parseInt(intervaloText);

    if (nota1 > nota2 || nota3 <= 0) {
        JOptionPane.showMessageDialog(this, "Los valores de entrada no son válidos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return; // Sale del método si se muestra la advertencia
    }

    calculando(nota1, nota2, nota3);
    }//GEN-LAST:event_jbtn_rellenarActionPerformed

    private void jbtn_vaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_vaciarActionPerformed
       combo_principal.removeAllItems();
           txt_inicio.setText("");
           txt_fin.setText("");
           txt_intervalo.setText("");
    }//GEN-LAST:event_jbtn_vaciarActionPerformed

    private void combo_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_principalActionPerformed
   Object selectedItem = combo_principal.getSelectedItem();
    if (selectedItem != null) {
    String seleccionado = selectedItem.toString();
    jlabel_resultado.setText(seleccionado);
    }
    else {
    jlabel_resultado.setText("");
}
    }//GEN-LAST:event_combo_principalActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtn_rellenar;
    private javax.swing.JButton jbtn_vaciar;
    private javax.swing.JLabel jlabel_resultado;
    private javax.swing.JTextField txt_fin;
    private javax.swing.JTextField txt_inicio;
    private javax.swing.JTextField txt_intervalo;
    // End of variables declaration//GEN-END:variables
}
