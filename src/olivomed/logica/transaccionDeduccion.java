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
import olivomed.modelos.Deduccion;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionDeduccion {

    ServiciosDB service = new ServiciosDB();

    public void createDeduccion(Deduccion d) {
        String query = "INSERT INTO DEDUCCION "
                + "(IDDEDUCCION,NOMBRE, FECHA, DEUDA, VALOR, SALDO, CONTADOR, IDDEUDA) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, d.getIdDeduccion());
            stmt.setString(2, d.getNombre());
            stmt.setString(3, d.getFecha());
            stmt.setFloat(4, d.getPase());
            stmt.setFloat(5, d.getValor());
            stmt.setFloat(6, d.getSaldo());
            stmt.setInt(7, d.getContador());
            stmt.setString(8, d.getIdPase());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " La Deduccion: " + d.getIdDeduccion() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error La Deduccion: " + d.getIdDeduccion() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateDeduccion(String id, Deduccion d) throws SQLException {
        String query = "UPDATE DEDUCCION "
                + "SET NOMBRE=?, FECHA=?, DEUDA=?, VALOR=?, SALDO=?, MEDICO=?"
                + "WHERE IDDEDUCCION=?, IDDEUDA=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, d.getIdPase());
            stmt.setString(2, d.getNombre());
            stmt.setString(3, d.getFecha());
            stmt.setFloat(4, d.getPase());
            stmt.setFloat(5, d.getValor());
            stmt.setFloat(6, d.getSaldo());
            stmt.setString(7, d.getIdDeduccion());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Deduccion: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR La Deduccion: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteDeduccion(String id) throws SQLException {
        Deduccion d = findByIdDeduccion(id);
        if (d == null) {
            JOptionPane.showMessageDialog(null, "Codigo de deduccion: " + id + " no existe.");
        }
        String query = "DELETE FROM DEDUCCION WHERE IDDEDUCCION = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de la Deduccion: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de la Deduccion: " + id + "no se ha borrado.");
        }
    }

    public Deduccion findByIdDeduccion(String id) throws SQLException {
        String query = "SELECT * FROM DEDUCCION WHERE IDDEDUCCION = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Deduccion(rs.getString("IDDEDUCCION"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("DEUDA"), rs.getFloat("VALOR"), rs.getFloat("SALDO"),
                    rs.getInt("CONTADOR"), rs.getString("IDDUEDA")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de la Deduccion: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Deduccion> findAllDeducciones() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM DEDUCCION";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Deduccion> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deduccion(rs.getString("IDDEDUCCION"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("DEUDA"), rs.getFloat("VALOR"), rs.getFloat("SALDO"),
                    rs.getInt("CONTADOR"), rs.getString("IDCUENTA")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }

    public Deduccion findByIdPase(String idPase) {
        try {
            String query = "SELECT * FROM DEDUCCION WHERE IDDEUDA = " + "'" + idPase + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Deduccion(rs.getString("IDDEDUCCION"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("DEUDA"), rs.getFloat("VALOR"), rs.getFloat("SALDO"),
                    rs.getInt("CONTADOR"), rs.getString("IDDEUDA")));
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Deduccion> obtenerDeduccionesByIdPase(String idPase) {
        try {
            String query = "SELECT * FROM DEDUCCION WHERE IDDEUDA = " + "'" + idPase + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Deduccion> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deduccion(rs.getString("IDDEDUCCION"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("DEUDA"), rs.getFloat("VALOR"), rs.getFloat("SALDO"),
                    rs.getInt("CONTADOR"), rs.getString("IDDEUDA")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Deduccion> obtenerUltimaDeduccionByIdPase(String idPase) {
        try {
            String query = "SELECT * FROM DEDUCCION WHERE IDDEUDA = " + "'" + idPase + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Deduccion> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deduccion(rs.getString("IDDEDUCCION"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("DEUDA"), rs.getFloat("VALOR"), rs.getFloat("SALDO"),
                    rs.getInt("CONTADOR"), rs.getString("IDDEUDA")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Deduccion> obtenerUltimaDeduccionByIdPaseAcs(String idPase) {
        try {
            String query = "SELECT * FROM DEDUCCION WHERE IDDEUDA = " + "'" + idPase + "'" + " ORDER BY CONTADOR ASC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Deduccion> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deduccion(rs.getString("IDDEDUCCION"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("DEUDA"), rs.getFloat("VALOR"), rs.getFloat("SALDO"),
                    rs.getInt("CONTADOR"), rs.getString("IDDEUDA")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Deduccion findByIdDed(String idDeduccion) {
        try {
            String query = "SELECT * FROM DEDUCCION WHERE IDDEDUCCION = " + "'" + idDeduccion + "'";
            System.out.println(query);
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Deduccion(rs.getString("IDDEDUCCION"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("DEUDA"), rs.getFloat("VALOR"), rs.getFloat("SALDO"),
                    rs.getInt("CONTADOR"), rs.getString("IDDEUDA")));
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public List<Deduccion> obtenerDeduccionesPorMes(String mes, String anio) {
        try {
            String query = "SELECT * FROM DEDUCCION WHERE substring(FECHA, 7, 4) =" + "'" + anio 
                    + "'" + " AND substring(FECHA, 4, 2) =" + "'" + mes + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Deduccion> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deduccion(rs.getString("IDDEDUCCION"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("DEUDA"), rs.getFloat("VALOR"), rs.getFloat("SALDO"),
                    rs.getInt("CONTADOR"), rs.getString("IDDEUDA")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
