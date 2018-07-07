/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import olivomed.modelos.Cuenta_dtl;

/**
 *
 * @author admin
 */
public class transaccionCuenta_dtl {
     ServiciosDB service = new ServiciosDB();

    public void createCuenta_dtl(Cuenta_dtl cue) {
        String query = "INSERT INTO CUENTA_DTL "
                + "(IDCORR, IDCUENTA, IDPASE, VALOR, CONTADOR) "
                + "VALUES (? , ? , ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, cue.getIdCorr());
            stmt.setString(2, cue.getIdCuenta());
            stmt.setString(3, cue.getIdPase());
            stmt.setFloat(4, cue.getValor());
            stmt.setInt(5, cue.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La cuenta: " + cue.getIdCuenta() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error la cuenta: " + cue.getIdCuenta() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateCuenta_dtl(String id, Cuenta_dtl cue) throws SQLException {
        String query = "UPDATE CUENTA_DTL "
                + "SET IDCUENTA=?, IDPASE=?, VALOR=?"
                + "WHERE IDCORR=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, cue.getIdCuenta());
            stmt.setString(2, cue.getIdPase());
            stmt.setFloat(2, cue.getValor());
            stmt.setString(3, cue.getIdCuenta());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La cuenta: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR la cuenta: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteCuenta_dtl(String id) throws SQLException {
        Cuenta_dtl cue = findByIdCuenta_dtl(id);
        if (cue == null) {
            JOptionPane.showMessageDialog(null, "Codigo de empleado: " + id + " no existe.");
        }
        String query = "DELETE FROM CUENTA_DTL WHERE IDCORR = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de empleado: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha borrado.");
        }
    }

    public Cuenta_dtl findByIdCuenta_dtl(String id) throws SQLException {
        String query = "SELECT * FROM CUENTA_DTL WHERE IDCORR = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Cuenta_dtl(rs.getString("IDCORR"),
                    rs.getString("IDCUENTA"), rs.getString("IDPASE"), rs.getFloat("VALOR"),
                    rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Cuenta_dtl> findAllCuenta() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM CUENTA_DTL";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Cuenta_dtl> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Cuenta_dtl(rs.getString("IDCORR"),
                    rs.getString("IDCUENTA"), rs.getString("IDPASE"), rs.getFloat("VALOR"),
                    rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR. ");
        }
        return null;
    }
    
     public List<Cuenta_dtl> obtenerCuentadtlByIdCuenta(String idCuenta) {
        try {
            String query = "SELECT * FROM CUENTA_DTL WHERE IDCUENTA = " + "'" + idCuenta + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Cuenta_dtl> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Cuenta_dtl(rs.getString("IDCORR"),
                    rs.getString("IDCUENTA"), rs.getString("IDPASE"), rs.getFloat("VALOR"),
                    rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
