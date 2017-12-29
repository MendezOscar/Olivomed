
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
    String url = "jdbc:oracle:thin:@localhost:1521/xe";
    String username = "OLIVOPMED";
    String password = "medico";

    public ServiciosDB() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error al conectar");
        }
    }
}
