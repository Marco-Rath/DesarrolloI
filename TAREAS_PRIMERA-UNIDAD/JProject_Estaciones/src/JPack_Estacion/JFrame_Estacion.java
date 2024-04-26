package JPack_Estacion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;

public class JFrame_Estacion extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Estacion
     */
    public JFrame_Estacion() {
        initComponents();
        Mouse();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Estacion = new javax.swing.ButtonGroup();
        jButton_Rellenar = new javax.swing.JButton();
        jButton_Vaciar = new javax.swing.JButton();
        jPanel_Estaciones = new javax.swing.JPanel();
        radio_primavera = new javax.swing.JRadioButton();
        radio_otoño = new javax.swing.JRadioButton();
        radio_verano = new javax.swing.JRadioButton();
        radio_invierno = new javax.swing.JRadioButton();
        label_titulo = new javax.swing.JLabel();
        jLabel_Resultado = new javax.swing.JLabel();
        scroll_meses = new javax.swing.JScrollPane();
        jList_Meses = new javax.swing.JList<>();
        boton_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setLocationByPlatform(true);

        jButton_Rellenar.setBackground(new java.awt.Color(102, 102, 102));
        jButton_Rellenar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Rellenar.setText("Rellenar");
        jButton_Rellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RellenarActionPerformed(evt);
            }
        });

        jButton_Vaciar.setBackground(new java.awt.Color(102, 102, 102));
        jButton_Vaciar.setFont(new java.awt.Font("Lao UI", 0, 18)); // NOI18N
        jButton_Vaciar.setText("Vaciar");
        jButton_Vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VaciarActionPerformed(evt);
            }
        });

        jPanel_Estaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        buttonGroup_Estacion.add(radio_primavera);
        radio_primavera.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_primavera.setText("Primavera");
        radio_primavera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPack_Imagenes/primavera.png"))); // NOI18N

        buttonGroup_Estacion.add(radio_otoño);
        radio_otoño.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_otoño.setText("Otoño");
        radio_otoño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPack_Imagenes/arbol-de-otono.png"))); // NOI18N

        buttonGroup_Estacion.add(radio_verano);
        radio_verano.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_verano.setText("Verano");
        radio_verano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPack_Imagenes/sol.png"))); // NOI18N
        radio_verano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_veranoActionPerformed(evt);
            }
        });

        buttonGroup_Estacion.add(radio_invierno);
        radio_invierno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_invierno.setText("Invierno");
        radio_invierno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPack_Imagenes/copo-de-nieve.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_EstacionesLayout = new javax.swing.GroupLayout(jPanel_Estaciones);
        jPanel_Estaciones.setLayout(jPanel_EstacionesLayout);
        jPanel_EstacionesLayout.setHorizontalGroup(
            jPanel_EstacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_EstacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_EstacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(radio_otoño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radio_primavera, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(radio_verano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addGroup(jPanel_EstacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio_invierno, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_EstacionesLayout.setVerticalGroup(
            jPanel_EstacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EstacionesLayout.createSequentialGroup()
                .addComponent(radio_primavera, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_verano, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_otoño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_invierno)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        label_titulo.setFont(new java.awt.Font("Times", 2, 36)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(0, 51, 51));
        label_titulo.setText("Estaciones");

        jLabel_Resultado.setFont(new java.awt.Font("Times", 1, 18)); // NOI18N
        jLabel_Resultado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        scroll_meses.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Meses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jList_Meses.setBackground(new java.awt.Color(255, 255, 255));
        jList_Meses.setFont(new java.awt.Font("Times", 2, 24)); // NOI18N
        jList_Meses.setForeground(new java.awt.Color(51, 51, 51));
        scroll_meses.setViewportView(jList_Meses);

        boton_salir.setFont(new java.awt.Font("Times", 3, 36)); // NOI18N
        boton_salir.setForeground(new java.awt.Color(0, 51, 51));
        boton_salir.setText("x");
        boton_salir.setBorder(null);
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(scroll_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton_Vaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Rellenar)))
                .addGap(184, 184, 184)
                .addComponent(jPanel_Estaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(label_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_salir)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(boton_salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Estaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo)
                .addGap(64, 64, 64)
                .addComponent(jButton_Rellenar)
                .addGap(91, 91, 91)
                .addComponent(jButton_Vaciar)
                .addGap(219, 219, 219))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton_RellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RellenarActionPerformed

        // Comprobando cual de las Jradionbutton esta selecionado

        if (radio_primavera.isSelected()) {
            //Mandando los meses de la primavera a Jlist
            jList_Meses.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = { " abril", " mayo", " junio" };
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            scroll_meses.setViewportView(jList_Meses);
        }

        if (radio_verano.isSelected()) {
            //Mandando los meses de la primavera a Jlist
            jList_Meses.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = { " julio", " agosto" , " septiembre" };
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            scroll_meses.setViewportView(jList_Meses);
        }

        if (radio_otoño.isSelected()) {
            //Mandando los meses de la primavera a Jlist
            jList_Meses.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = { " octubre", " noviembre" , " diciembre" };
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            scroll_meses.setViewportView(jList_Meses);
        }

        if (radio_invierno.isSelected()) {
            //Mandando los meses de la primavera a Jlist
            jList_Meses.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = { " enero", " febrero", " marzo" };
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            scroll_meses.setViewportView(jList_Meses);
        }
    }//GEN-LAST:event_jButton_RellenarActionPerformed


    private void jButton_VaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VaciarActionPerformed

        // Vaciar el jlist  meses y el resultado
        jList_Meses.setModel(new DefaultListModel<String>());
        jLabel_Resultado.setText("");

    }//GEN-LAST:event_jButton_VaciarActionPerformed

    private void radio_veranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_veranoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_veranoActionPerformed

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
       this.dispose();
    }//GEN-LAST:event_boton_salirActionPerformed


    private void Mouse(){
        //Agregar un mes selecionado a jlabel a partir de un jlist selecionado
        jList_Meses.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtener el elemento seleccionado en la lista
                String selectedMonth = jList_Meses.getSelectedValue();
                // Mostrar el resultado seleccionado mas el mensaje agregado
                jLabel_Resultado.setText("Selecciono el mes de: " + selectedMonth);
            }
        });

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
            java.util.logging.Logger.getLogger(JFrame_Estacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Estacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Estacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Estacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Estacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_salir;
    private javax.swing.ButtonGroup buttonGroup_Estacion;
    private javax.swing.JButton jButton_Rellenar;
    private javax.swing.JButton jButton_Vaciar;
    private javax.swing.JLabel jLabel_Resultado;
    private javax.swing.JList<String> jList_Meses;
    private javax.swing.JPanel jPanel_Estaciones;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JRadioButton radio_invierno;
    private javax.swing.JRadioButton radio_otoño;
    private javax.swing.JRadioButton radio_primavera;
    private javax.swing.JRadioButton radio_verano;
    private javax.swing.JScrollPane scroll_meses;
    // End of variables declaration//GEN-END:variables
}
