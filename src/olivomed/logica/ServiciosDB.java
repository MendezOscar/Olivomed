
package olivomed.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public class ServiciosDB {
    public Connection con = null;
    Statement st;
    String sURL = "jdbc:mysql://localhost:3306/olivopmed";
    

    public ServiciosDB() {
        try {
            con = DriverManager.getConnection(sURL,"root","olivodb");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error al conectar");
        }
    }
}
