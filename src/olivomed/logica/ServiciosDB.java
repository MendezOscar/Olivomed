package olivomed.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import olivomed.grafico.Login;

/**
 *
 * @author Oscar Mendez
 */
public class ServiciosDB {

    public Connection con;
    Statement st;
    Login lg = new Login();
    String url = "jdbc:mysql://localhost:3306/olivopmed?useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String username = "root";
    String password = "mysql82018";
    

    public ServiciosDB() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException se) {
            System.out.println(se.toString());
            //temporal+1
            JOptionPane.showMessageDialog(null, "Error al conectar");
        }
    }
    
    public void conectar() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException se) {
            se.toString();
            JOptionPane.showMessageDialog(null, "Acesso Denegado");
        }
    }
}
