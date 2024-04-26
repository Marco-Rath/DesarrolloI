
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Isabel
 */
public class pregunta2 extends javax.swing.JFrame {
private List<JButton> botonesSeleccionados = new ArrayList<>();
      private int sumaTotal;
      

    public pregunta2() {
               initComponents();             
                jbtn_1.setActionCommand("1");
                jbtn_2.setActionCommand("2");
                jbtn_3.setActionCommand("3");                       
                jbtn_4.setActionCommand("4");
                jbtn_5.setActionCommand("5");
                jbtn_6.setActionCommand("6");


   }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtn_1 = new javax.swing.JButton();
        jbtn_2 = new javax.swing.JButton();
        jbtn_3 = new javax.swing.JButton();
        jbtn_4 = new javax.swing.JButton();
        jbtn_5 = new javax.swing.JButton();
        jbtn_6 = new javax.swing.JButton();
        jbtn_desactivartodo = new javax.swing.JButton();
        jbtn_activartodo = new javax.swing.JButton();
        jbtn_total = new javax.swing.JButton();
        label_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtn_1.setText("1");
        jbtn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_1ActionPerformed(evt);
            }
        });

        jbtn_2.setText("2");
        jbtn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_2ActionPerformed(evt);
            }
        });

        jbtn_3.setText("3");
        jbtn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_3ActionPerformed(evt);
            }
        });

        jbtn_4.setText("4");
        jbtn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_4ActionPerformed(evt);
            }
        });

        jbtn_5.setText("5");
        jbtn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_5ActionPerformed(evt);
            }
        });

        jbtn_6.setText("6");
        jbtn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_6ActionPerformed(evt);
            }
        });

        jbtn_desactivartodo.setText("Desactivar Todo");
        jbtn_desactivartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_desactivartodoActionPerformed(evt);
            }
        });

        jbtn_activartodo.setText("Activar Todo");
        jbtn_activartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_activartodoActionPerformed(evt);
            }
        });

        jbtn_total.setText("Total");
        jbtn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_totalActionPerformed(evt);
            }
        });

        label_resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtn_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtn_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtn_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtn_desactivartodo, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                                .addComponent(jbtn_activartodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtn_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jbtn_desactivartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_activartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_total, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_activartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_activartodoActionPerformed
    jbtn_1.setSelected(true);
    jbtn_2.setSelected(true);
    jbtn_3.setSelected(true);
    jbtn_4.setSelected(true);
    jbtn_5.setSelected(true);
    jbtn_6.setSelected(true);

    // Limpiar la lista de botones seleccionados antes de agregar los nuevos
    botonesSeleccionados.clear();

    // Agregar solo los botones seleccionados a la lista
    if (jbtn_1.isSelected()) {
        botonesSeleccionados.add(jbtn_1);
    }
    if (jbtn_2.isSelected()) {
        botonesSeleccionados.add(jbtn_2);
    }
    if (jbtn_3.isSelected()) {
        botonesSeleccionados.add(jbtn_3);
    }
    if (jbtn_4.isSelected()) {
        botonesSeleccionados.add(jbtn_4);
    }
    if (jbtn_5.isSelected()) {
        botonesSeleccionados.add(jbtn_5);
    }
    if (jbtn_6.isSelected()) {
        botonesSeleccionados.add(jbtn_6);
    }
    }//GEN-LAST:event_jbtn_activartodoActionPerformed

    private void jbtn_desactivartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_desactivartodoActionPerformed
    jbtn_1.setSelected(false);
        jbtn_2.setSelected(false);
        jbtn_3.setSelected(false);
        jbtn_4.setSelected(false);
        jbtn_5.setSelected(false);
        jbtn_6.setSelected(false);

        botonesSeleccionados.clear();
       
    }//GEN-LAST:event_jbtn_desactivartodoActionPerformed
    private int sumarBotonesSeleccionados() {
    int suma = 0;
    for (int i = 0; i < botonesSeleccionados.size(); i++) {
        jbtn_activartodo = botonesSeleccionados.get(i);
        if (jbtn_activartodo.isSelected()) {
            suma += Integer.parseInt(jbtn_activartodo.getActionCommand());
        }
    }
    return suma;
}

    private void jbtn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_totalActionPerformed
      sumaTotal = sumarBotonesSeleccionados();
    label_resultado.setText("La suma total es: " + sumaTotal);
    }//GEN-LAST:event_jbtn_totalActionPerformed

    private void jbtn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_1ActionPerformed
  
    if (jbtn_1.isSelected() && !botonesSeleccionados.contains(jbtn_1)) {
        botonesSeleccionados.add(jbtn_1);
    } else {
        botonesSeleccionados.remove(jbtn_1);
    }
    }//GEN-LAST:event_jbtn_1ActionPerformed

    private void jbtn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_2ActionPerformed
    
    if (jbtn_2.isSelected() && !botonesSeleccionados.contains(jbtn_2)) {
        botonesSeleccionados.add(jbtn_2);
    } else {
        botonesSeleccionados.remove(jbtn_2);
    }
    }//GEN-LAST:event_jbtn_2ActionPerformed

    private void jbtn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_3ActionPerformed
  
    if (jbtn_3.isSelected() && !botonesSeleccionados.contains(jbtn_3)) {
        botonesSeleccionados.add(jbtn_3);
    } else {
        botonesSeleccionados.remove(jbtn_3);
    }
    }//GEN-LAST:event_jbtn_3ActionPerformed

    private void jbtn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_4ActionPerformed
   
    if (jbtn_4.isSelected() && !botonesSeleccionados.contains(jbtn_4)) {
        botonesSeleccionados.add(jbtn_4);
    } else {
        botonesSeleccionados.remove(jbtn_4);
    }
    }//GEN-LAST:event_jbtn_4ActionPerformed

    private void jbtn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_5ActionPerformed

    if (jbtn_5.isSelected() && !botonesSeleccionados.contains(jbtn_5)) {
        botonesSeleccionados.add(jbtn_5);
    } else {
        botonesSeleccionados.remove(jbtn_5);
    }
    }//GEN-LAST:event_jbtn_5ActionPerformed

    private void jbtn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_6ActionPerformed
      
    if (jbtn_6.isSelected() && !botonesSeleccionados.contains(jbtn_6)) {
        botonesSeleccionados.add(jbtn_6);
    } else {
        botonesSeleccionados.remove(jbtn_6);
    }
    }//GEN-LAST:event_jbtn_6ActionPerformed

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
            java.util.logging.Logger.getLogger(pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pregunta2().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_1;
    private javax.swing.JButton jbtn_2;
    private javax.swing.JButton jbtn_3;
    private javax.swing.JButton jbtn_4;
    private javax.swing.JButton jbtn_5;
    private javax.swing.JButton jbtn_6;
    private javax.swing.JButton jbtn_activartodo;
    private javax.swing.JButton jbtn_desactivartodo;
    private javax.swing.JButton jbtn_total;
    private javax.swing.JLabel label_resultado;
    // End of variables declaration//GEN-END:variables
}
