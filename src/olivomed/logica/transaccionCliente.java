package olivomed.logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import olivomed.modelos.Empleado;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionCliente {

    ServiciosDB service = new ServiciosDB();

    public void createCliente(Empleado clie) {
        String query = "INSERT INTO EMPLEADO "
                + "(CODIGO, NOMBRE, CONTADOR, CAPATAZ, TIPO) "
                + "VALUES (? , ? , ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, clie.getIdEmpleado());
            stmt.setString(2, clie.getNombre());
            stmt.setInt(3, clie.getContador());
            stmt.setString(4, clie.getCapataz());
            stmt.setString(5, clie.getTipo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " El empleado: " + clie.getIdEmpleado() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El empleado: " + clie.getIdEmpleado() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateCliente(String id, Empleado clie) throws SQLException {
        String query = "UPDATE EMPLEADO "
                + "SET NOMBRE=?, CAPATAZ =?, TIPO =?"
                + "WHERE CODIGO=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, clie.getNombre());
            stmt.setString(2, clie.getCapataz());
            stmt.setString(3, clie.getTipo());
            stmt.setString(4, clie.getIdEmpleado());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El empleado: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El empleado: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteCliente(String id) throws SQLException {
        Empleado clie = findByIdClientes(id);
        if (clie == null) {
            JOptionPane.showMessageDialog(null, "Codigo de empleado: " + id + " no existe.");
        }
        String query = "DELETE FROM EMPLEADO WHERE CODIGO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de empleado: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha borrado.");
        }
    }

    public Empleado findByIdClientes(String id) throws SQLException {
        String query = "SELECT * FROM EMPLEADO WHERE CODIGO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Empleado(rs.getString("CODIGO"), rs.getString("NOMBRE"), rs.getInt("CONTADOR"),
                    rs.getString("CAPATAZ"), rs.getString("TIPO")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Empleado> findAllClientes() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM EMPLEADO";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Empleado> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Empleado(rs.getString("CODIGO"), rs.getString("NOMBRE"), rs.getInt("CONTADOR"),
                        rs.getString("CAPATAZ"), rs.getString("TIPO")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR. ");
        }
        return null;
    }
    
    
}
