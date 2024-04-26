
package javax;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
public class Conexion {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     String ConnectionURL="jdbc:sqlserver://ISABELLA:1433;databaseName=VentaLibros_MarcoAP;user=usersql;password=root;";
     Connection con=DriverManager.getConnection(ConnectionURL);
     System.out.println("Nos conectamos");
        
    }
}
