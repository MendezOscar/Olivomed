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
import olivomed.modelos.Pase;
import olivomed.modelos.paseNDeducible;

/**
 *
 * @author admin
 */
public class transaccionPaseNDeducible {

    ServiciosDB service = new ServiciosDB();

    public void createPase(paseNDeducible p) {
        String query = "INSERT INTO PASENODEDUCIBLE "
                + "(IDPASENODEDUCIBLE ,NOMBRE, FECHA, VALOR, MEDICO, CONTADOR, NUMERO, CODIGO, MES) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, p.getIdPase());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getFecha());
            stmt.setFloat(4, p.getValor());
            stmt.setString(5, p.getMedico());
            stmt.setInt(6, p.getContador());
            stmt.setInt(7, p.getNumero());
            stmt.setString(8, p.getCodigo());
            stmt.setString(9, p.getMes());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " El pase: " + p.getIdPase() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El pase: " + p.getIdPase() + " no se ha guardado Exitosamente.");
        }
    }

    public void updatePase(String id, paseNDeducible p) throws SQLException {
        String query = "UPDATE PASENODEDUCIBLE "
                + "SET NOMBRE=?, FECHA=?, VALOR=?, MEDICO=?, NUMERO=?, CODIGO=?, MES=?"
                + "WHERE IDPASENODEDUCIBLE=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getFecha());
            stmt.setFloat(3, p.getValor());
            stmt.setString(4, p.getMedico());
            stmt.setInt(5, p.getNumero());
            stmt.setString(6, p.getCodigo());
            stmt.setString(7, p.getMes());
            stmt.setString(8, p.getIdPase());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El pase: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El pase: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deletePase(String id) throws SQLException {
        paseNDeducible p = findByIdPase(id);
        if (p == null) {
            JOptionPane.showMessageDialog(null, "Codigo de pase: " + id + " no existe.");
        }
        String query = "DELETE FROM PASENODEDUCIBLE WHERE IDPASENODEDUCIBLE = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de pase: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de pase: " + id + "no se ha borrado.");
        }
    }

    public paseNDeducible findByIdPase(String id) throws SQLException {
        String query = "SELECT * FROM PASENODEDUCIBLE WHERE IDPASENODEDUCIBLE = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new paseNDeducible(rs.getString("IDPASENODEDUCIBLE"), rs.getString("NOMBRE"),
                    rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getString("MEDICO"), rs.getInt("CONTADOR"),
                    rs.getInt("NUMERO"), rs.getString("CODIGO"), rs.getString("MES")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<paseNDeducible> findAllPases() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM PASENODEDUCIBLE";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<paseNDeducible> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new paseNDeducible(rs.getString("IDPASENODEDUCIBLE"), rs.getString("NOMBRE"),
                        rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getString("MEDICO"), rs.getInt("CONTADOR"),
                        rs.getInt("NUMERO"), rs.getString("CODIGO"), rs.getString("MES")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }

    public List<paseNDeducible> obtenerPaseByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM PASE WHERE IDEMPLEADO = " + "'" + idCliente + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<paseNDeducible> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new paseNDeducible(rs.getString("IDPASENODEDUCIBLE"), rs.getString("NOMBRE"),
                        rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getString("MEDICO"), rs.getInt("CONTADOR"),
                        rs.getInt("NUMERO"), rs.getString("CODIGO"), rs.getString("MES")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<paseNDeducible> obtenerUltimoPaseByIdCliente(String idCliente, String medico) {
        try {
            String query = "SELECT * FROM PASE WHERE IDEMPLEADO = " + "'" + idCliente + "'" + " AND MEDICO = " + "'" + medico + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<paseNDeducible> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new paseNDeducible(rs.getString("IDPASENODEDUCIBLE"), rs.getString("NOMBRE"),
                        rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getString("MEDICO"), rs.getInt("CONTADOR"),
                        rs.getInt("NUMERO"), rs.getString("CODIGO"), rs.getString("MES")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<paseNDeducible> obtenerUltimoPaseByMesMedico(String mes, String medico) {
        try {
            String query = "SELECT * FROM PASENODEDUCIBLE WHERE MES = " + "'" + mes + "'" + " AND MEDICO = " + "'" + medico + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<paseNDeducible> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new paseNDeducible(rs.getString("IDPASENODEDUCIBLE"), rs.getString("NOMBRE"),
                        rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getString("MEDICO"), rs.getInt("CONTADOR"),
                        rs.getInt("NUMERO"), rs.getString("CODIGO"), rs.getString("MES")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<paseNDeducible> obtenerUltimoPaseByMes(String mes) {
        try {
            String query = "SELECT * FROM PASENODEDUCIBLE WHERE MES = " + "'" + mes + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<paseNDeducible> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new paseNDeducible(rs.getString("IDPASENODEDUCIBLE"), rs.getString("NOMBRE"),
                        rs.getString("FECHA"), rs.getFloat("VALOR"), rs.getString("MEDICO"), rs.getInt("CONTADOR"),
                        rs.getInt("NUMERO"), rs.getString("CODIGO"), rs.getString("MES")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
