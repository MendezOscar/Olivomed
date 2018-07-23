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

    public Connection con;
    Statement st;
    String url = "jdbc:mysql://localhost:3306/olivopmed?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String username = "root";
    String password = "mysql2018";

    public ServiciosDB() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException se) {
            se.toString();
            JOptionPane.showMessageDialog(null, "Error al conectar");
        }
    }
}
