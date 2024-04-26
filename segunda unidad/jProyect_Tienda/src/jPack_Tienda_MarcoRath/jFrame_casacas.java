
package jPack_Tienda_MarcoRath;

import jPack_Tienda_MarcoRath.jClass_Prendas_Vestir;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class jFrame_casacas extends javax.swing.JFrame {

 private int precioAcumulado = 0;
 private StringBuilder productosSeleccionados = new StringBuilder();

private jClass_Prendas_Vestir tiendaRopa;
    public jFrame_casacas() {
        initComponents();
    this.tiendaRopa = new jClass_Prendas_Vestir(); // Crear una instancia de jClass_Prendas_Vestir y asignarla a this.tiendaRopa
    int precioamericana = tiendaRopa.getprecioamericana();
    int precioblazer = tiendaRopa.getprecioblazer();
    int preciocruzada = tiendaRopa.getpreciocruzada();
    int preciobomber = tiendaRopa.getpreciobomber();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_agrupar = new javax.swing.ButtonGroup();
        radio_americana = new javax.swing.JCheckBox();
        radio_blazer = new javax.swing.JCheckBox();
        jbtn_aceptar = new javax.swing.JButton();
        radio_cruzada = new javax.swing.JCheckBox();
        jbtn_limpiar = new javax.swing.JButton();
        radio_bomber = new javax.swing.JCheckBox();
        jbtn_atras = new javax.swing.JButton();
        jbtn_estadistica = new javax.swing.JButton();
        jbtn_comprar = new javax.swing.JButton();
        label_icono = new javax.swing.JLabel();
        label_concepto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_agrupar.add(radio_americana);
        radio_americana.setText("Americana");
        getContentPane().add(radio_americana, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 21, -1, -1));

        boton_agrupar.add(radio_blazer);
        radio_blazer.setText("Blazer");
        getContentPane().add(radio_blazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 21, -1, -1));

        jbtn_aceptar.setText("Aceptar");
        jbtn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 371, -1, -1));

        boton_agrupar.add(radio_cruzada);
        radio_cruzada.setText("Cruzada");
        getContentPane().add(radio_cruzada, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 21, -1, -1));

        jbtn_limpiar.setText("Limpiar");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 368, -1, -1));

        boton_agrupar.add(radio_bomber);
        radio_bomber.setText("Bomber");
        getContentPane().add(radio_bomber, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 21, -1, -1));

        jbtn_atras.setText("Atras");
        jbtn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 409, -1, -1));

        jbtn_estadistica.setText("Estadistica");
        jbtn_estadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_estadisticaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_estadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 368, -1, -1));

        jbtn_comprar.setText("Comprar");
        jbtn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_comprarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 412, -1, -1));

        label_icono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        getContentPane().add(label_icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 694, 297));

        label_concepto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        getContentPane().add(label_concepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 447, 461, 57));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_aceptarActionPerformed
        String mensaje = ""; // Declarar la variable mensaje una vez antes de los bloques if
        ImageIcon imagen = null;

        // Preguntas qué botón se seleccionó
         if (radio_americana.isSelected()) {
        mensaje += "Selecciono Camisa Ingles ** Precio:$60 Talla: X";
        imagen = new ImageIcon("D:\\imgfotos\\americana.PNG");
        productosSeleccionados.append("Casaca Americana\n");
    }
    if (radio_blazer.isSelected()) {
        mensaje += "Selecciono Camisa Italiana ** Precio:$40 Talla: M";
        imagen = new ImageIcon("D:\\imgfotos\\blazer.PNG");
        productosSeleccionados.append("Casaca Blazer\n");
    }
    if (radio_cruzada.isSelected()) {
        mensaje += "Selecciono Camisa Cutaway ** Precio:$35 Talla: S";
        imagen = new ImageIcon("D:\\imgfotos\\cruzada.PNG");
        productosSeleccionados.append("Casaca Cruzada\n");
    }
    if (radio_bomber.isSelected()) {
        mensaje += "Selecciono Camisa Paloma ** Precio:$50 Talla: XL";
        imagen = new ImageIcon("D:\\imgfotos\\bomber.PNG");
        productosSeleccionados.append("Casaca Bomber\n");
    }

        label_concepto.setText(mensaje);
        label_icono.setIcon(imagen);
    }//GEN-LAST:event_jbtn_aceptarActionPerformed

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed
        radio_americana.setSelected(false);
        radio_blazer.setSelected(false);
        radio_cruzada.setSelected(false);
        radio_bomber.setSelected(false);
        label_concepto.setText("");
        label_icono.setIcon(null);
    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    private void jbtn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_atrasActionPerformed
        jFrame_Seleccion seleccion=new jFrame_Seleccion();
        seleccion.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_atrasActionPerformed

    private void jbtn_estadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_estadisticaActionPerformed
        String seleccionados = "";

        if (radio_americana.isSelected()) {
            seleccionados += "Americana\n";
        }
        if (radio_blazer.isSelected()) {
            seleccionados += "Bluza\n";
        }
        if (radio_cruzada.isSelected()) {
            seleccionados += "Cruzada\n";
        }
        if (radio_bomber.isSelected()) {
            seleccionados += "Bomber\n";
        }

        
    String mensaje = "Elementos seleccionados:\n" + productosSeleccionados.toString() + "\nPrecio acumulado: " + precioAcumulado;
    JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_jbtn_estadisticaActionPerformed

    private void jbtn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_comprarActionPerformed
        int precioSeleccionado = 0;

        if (radio_americana.isSelected()) {
            precioSeleccionado = tiendaRopa.getprecioamericana();
        } else if (radio_blazer.isSelected()) {
            precioSeleccionado = tiendaRopa.getprecioblazer();
        } else if (radio_cruzada.isSelected()) {
            precioSeleccionado = tiendaRopa.getpreciocruzada();
        } else if (radio_bomber.isSelected()) {
            precioSeleccionado = tiendaRopa.getpreciobomber();
        }

        precioAcumulado += precioSeleccionado;

        String mensaje = "¡Has comprado un pantalón!\nPrecio Total: " + precioAcumulado;
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_jbtn_comprarActionPerformed

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
            java.util.logging.Logger.getLogger(jFrame_casacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_casacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_casacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_casacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_casacas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boton_agrupar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_atras;
    private javax.swing.JButton jbtn_comprar;
    private javax.swing.JButton jbtn_estadistica;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JLabel label_concepto;
    private javax.swing.JLabel label_icono;
    private javax.swing.JCheckBox radio_americana;
    private javax.swing.JCheckBox radio_blazer;
    private javax.swing.JCheckBox radio_bomber;
    private javax.swing.JCheckBox radio_cruzada;
    // End of variables declaration//GEN-END:variables
}