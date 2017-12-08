package olivomed.logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import olivomed.modelos.Pase;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionPase {
    
    ServiciosDB service = new ServiciosDB();
    
    public void createPase(Pase p) {
        String query = "INSERT INTO PASE "
                + "(IDPASE, IDEMPLEADO ,NOMBRE, FECHA, VALOR, DEDUCCION, CONTADOR, NUMERO, MEDICO, MES, PAGOS) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, p.getIdPase());
            stmt.setString(2, p.getIdempleado());
            stmt.setString(3, p.getNombre());
            stmt.setString(4, p.getFecha());
            stmt.setFloat(5, p.getValor());
            stmt.setFloat(6, p.getDeduccion());
            stmt.setInt(7, p.getContador());
            stmt.setInt(8, p.getNumero());
            stmt.setString(9, p.getMedico());
            stmt.setString(10, p.getMes());
            stmt.setInt(11, p.getPagos());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " El pase: " + p.getIdPase() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El pase: " + p.getIdPase() + " no se ha guardado Exitosamente.");
        }
    }
    
    public void updatePase(String id, Pase p) throws SQLException {
        String query = "UPDATE PASE "
                + "SET IDEMPLEADO=?, NOMBRE=?, FECHA=?, VALOR=?, DEDUCCION=?, NUMERO=?, MEDICO=?, MES=?, PAGOS=?"
                + "WHERE IDPASE=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, p.getIdempleado());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getFecha());
            stmt.setFloat(4, p.getValor());
            stmt.setFloat(5, p.getDeduccion());
            stmt.setInt(6, p.getNumero());
            stmt.setString(7, p.getMedico());
            stmt.setString(8, p.getMes());
            stmt.setString(9, p.getIdPase());
            stmt.setInt(10, p.getPagos());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El pase: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El pase: " + id + " no ha actualizado correctamente.");
        }
    }
    
    public void deletePase(String id) throws SQLException {
        Pase p = findByIdPase(id);
        if (p == null) {
            JOptionPane.showMessageDialog(null, "Codigo de pase: " + id + " no existe.");
        }
        String query = "DELETE FROM PASE WHERE IDPASE = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de pase: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de pase: " + id + "no se ha borrado.");
        }
    }
    
    public Pase findByIdPase(String id) throws SQLException {
        String query = "SELECT * FROM PASE WHERE IDPASE = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Pase(rs.getString("IDPASE"), rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getFloat("DEDUCCION"), rs.getInt("CONTADOR"),
                    rs.getInt("NUMERO"), rs.getString("MEDICO"), rs.getString("MES"), rs.getInt("PAGOS")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha encontrado.");
        }
        return null;
    }
    
    public List<Pase> findAllPases() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM EMPLEADO";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Pase> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Pase(rs.getString("IDPASE"), rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getFloat("DEDUCCION"), rs.getInt("CONTADOR"),
                    rs.getInt("NUMERO"), rs.getString("MEDICO"), rs.getString("MES"), rs.getInt("PAGOS")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }
    
     public List<Pase> obtenerPaseByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM PASE WHERE IDEMPLEADO = " + "'" + idCliente + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Pase> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Pase(rs.getString("IDPASE"), rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getFloat("DEDUCCION"), rs.getInt("CONTADOR"),
                    rs.getInt("NUMERO"), rs.getString("MEDICO"), rs.getString("MES"), rs.getInt("PAGOS")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Pase> obtenerUltimoPaseByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM PASE WHERE IDEMPLEADO = " + "'" + idCliente + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Pase> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Pase(rs.getString("IDPASE"), rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getFloat("DEDUCCION"), rs.getInt("CONTADOR"),
                    rs.getInt("NUMERO"), rs.getString("MEDICO"), rs.getString("MES"), rs.getInt("PAGOS")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
