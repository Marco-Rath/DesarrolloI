
package JPack_JhontanEspinoza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;

public class jFrame_Conexion_JhonatanEspinoza extends javax.swing.JFrame {
   Connection Conexion;
   Statement Sentencia;
   TableModel model;
    public jFrame_Conexion_JhonatanEspinoza() {
        initComponents();
        PrepararBaseDatos();
    }
    
    public void PrepararBaseDatos(){
    //cargar el controlador 
       
    try{
     String Controlador="com.microsoft.sqlserver.jdbc.SQLServerDriver";
     Class.forName(Controlador).newInstance();
     JOptionPane.showMessageDialog(null," ***** Conectado ******");
    }
    catch(Exception e){
         JOptionPane.showMessageDialog(null,"*-*  Nose puede Conectar *-* ");
    }
   
    
    
     try{
     String DSN="jdbc:sqlserver://DESKTOP-SR2O0L0:1433;databaseName=VentaLibros_NombreAP;encrypt=false";
     String user="marco1";
     String password="123";
     Conexion=DriverManager.getConnection(DSN,user,password);
      JOptionPane.showMessageDialog(null," **** BASE DE DATOS CONECTADOOO ***");
     }
     catch(Exception e){
     JOptionPane.showMessageDialog(null,"ERROR NOSE PUEDE CONECTAR");
    }
           try{
               
              Sentencia=Conexion.createStatement(
              ResultSet.TYPE_SCROLL_INSENSITIVE,
              ResultSet.CONCUR_READ_ONLY);
             
           JOptionPane.showMessageDialog(null," **** CREA EL OBJETO DE SENTENCIA***");
           }
          catch(Exception e){
                   JOptionPane.showMessageDialog(null," **** ERROR AL CREAR OBJETO SENTENCIA ***"); 
          }
    
    }
    
    
        
    
    
 
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Venta = new javax.swing.JTable();
        jButton_Mostrar = new javax.swing.JButton();
        jDesktopPane = new javax.swing.JDesktopPane();
        jmenu_PrincipalLibros = new javax.swing.JMenuBar();
        jmenu_mantenimiento = new javax.swing.JMenu();
        jMenuItem_ManteniendoDepartamento = new javax.swing.JMenuItem();
        jMenuItem2_MantenimientoProvincia = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmenu_proceso = new javax.swing.JMenu();
        jMenuItem1_Prosventa = new javax.swing.JMenuItem();
        jmenu_Reporte = new javax.swing.JMenu();
        jMenu_ListadeDepartamentos = new javax.swing.JMenuItem();
        jMenu_ListaProvincia = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu_Buscar = new javax.swing.JMenu();
        jMenu_Buscardepartamento = new javax.swing.JMenuItem();
        jMenu_Provincia = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmenu_Buscarfecha = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2_ReporteVentas = new javax.swing.JMenu();
        jMenuItem1_PorDepartamento = new javax.swing.JMenuItem();
        jmenu_hacerca = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Titulo.setText("Venta de libros");

        jTable_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Venta);

        jButton_Mostrar.setText("Mostrar");
        jButton_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jmenu_mantenimiento.setText("Mantenimiento");

        jMenuItem_ManteniendoDepartamento.setText("Departamento");
        jMenuItem_ManteniendoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ManteniendoDepartamentoActionPerformed(evt);
            }
        });
        jmenu_mantenimiento.add(jMenuItem_ManteniendoDepartamento);

        jMenuItem2_MantenimientoProvincia.setText("Provincia");
        jmenu_mantenimiento.add(jMenuItem2_MantenimientoProvincia);

        jMenuItem1.setText("Distrito");
        jmenu_mantenimiento.add(jMenuItem1);

        jMenuItem2.setText("Socio");
        jmenu_mantenimiento.add(jMenuItem2);

        jMenuItem3.setText("Libro");
        jmenu_mantenimiento.add(jMenuItem3);

        jmenu_PrincipalLibros.add(jmenu_mantenimiento);

        jmenu_proceso.setText("Proceso");

        jMenuItem1_Prosventa.setText("Venta");
        jmenu_proceso.add(jMenuItem1_Prosventa);

        jmenu_PrincipalLibros.add(jmenu_proceso);

        jmenu_Reporte.setText("Reporte");

        jMenu_ListadeDepartamentos.setText("Lista de Departamentos");
        jmenu_Reporte.add(jMenu_ListadeDepartamentos);

        jMenu_ListaProvincia.setText("Lista de Provincias");
        jmenu_Reporte.add(jMenu_ListaProvincia);
        jmenu_Reporte.add(jSeparator1);

        jMenu_Buscar.setText("Buscar");

        jMenu_Buscardepartamento.setText("Departamento");
        jMenu_Buscar.add(jMenu_Buscardepartamento);

        jMenu_Provincia.setText("Provincia");
        jMenu_Buscar.add(jMenu_Provincia);
        jMenu_Buscar.add(jSeparator2);

        jmenu_Buscarfecha.setText("Fecha");
        jMenu_Buscar.add(jmenu_Buscarfecha);

        jmenu_Reporte.add(jMenu_Buscar);
        jmenu_Reporte.add(jSeparator3);

        jMenu2_ReporteVentas.setText("Ventas");

        jMenuItem1_PorDepartamento.setText("Por Departamento");
        jMenu2_ReporteVentas.add(jMenuItem1_PorDepartamento);

        jmenu_Reporte.add(jMenu2_ReporteVentas);

        jmenu_PrincipalLibros.add(jmenu_Reporte);

        jmenu_hacerca.setText("Acerca de..");
        jmenu_PrincipalLibros.add(jmenu_hacerca);

        jMenu1.setText("Salir");
        jmenu_PrincipalLibros.add(jMenu1);

        setJMenuBar(jmenu_PrincipalLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton_Mostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Mostrar)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MostrarActionPerformed
   
     try {
        String etiquetas[] = { "Identificador", "Nombre" };
        DefaultTableModel modeloTabla = new DefaultTableModel(null, etiquetas);
        
        ResultSet resultado;
        resultado = Sentencia.executeQuery("SELECT * FROM Departamento");
        
        while (resultado.next()) {
            String fila[] = new String[2];
            fila[0] = resultado.getString(1);
            fila[1] = resultado.getString(2);
            modeloTabla.addRow(fila);
        }
        
        jTable_Venta.setModel(modeloTabla);
        
        JOptionPane.showMessageDialog(null, "Se cargaron los departamentos en la tabla");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al consultar la tabla Departamento");
    }
    }//GEN-LAST:event_jButton_MostrarActionPerformed

    private void jMenuItem_ManteniendoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ManteniendoDepartamentoActionPerformed
   
  if (evt.getSource() == jMenuItem_ManteniendoDepartamento) {
        jFrame_MarDepart marDepart = new jFrame_MarDepart();
        marDepart.setVisible(true);
        jDesktopPane.add(marDepart);
    }   
    }//GEN-LAST:event_jMenuItem_ManteniendoDepartamentoActionPerformed
  
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
            java.util.logging.Logger.getLogger(jFrame_Conexion_JhonatanEspinoza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_Conexion_JhonatanEspinoza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_Conexion_JhonatanEspinoza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_Conexion_JhonatanEspinoza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_Conexion_JhonatanEspinoza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Mostrar;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2_ReporteVentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1_PorDepartamento;
    private javax.swing.JMenuItem jMenuItem1_Prosventa;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem2_MantenimientoProvincia;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_ManteniendoDepartamento;
    private javax.swing.JMenu jMenu_Buscar;
    private javax.swing.JMenuItem jMenu_Buscardepartamento;
    private javax.swing.JMenuItem jMenu_ListaProvincia;
    private javax.swing.JMenuItem jMenu_ListadeDepartamentos;
    private javax.swing.JMenuItem jMenu_Provincia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTable jTable_Venta;
    private javax.swing.JMenuItem jmenu_Buscarfecha;
    private javax.swing.JMenuBar jmenu_PrincipalLibros;
    private javax.swing.JMenu jmenu_Reporte;
    private javax.swing.JMenu jmenu_hacerca;
    private javax.swing.JMenu jmenu_mantenimiento;
    private javax.swing.JMenu jmenu_proceso;
    // End of variables declaration//GEN-END:variables
}
