/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olivomed.logica;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import olivomed.modelos.Estado;

/**
 *
 * @author admin
 */
public class transaccionEstado {

    ServiciosDB service = new ServiciosDB();

    public void createEstado(Estado estado) {
        String query = "INSERT INTO ESTADO "
                + "(IDESTADOCUENTA, FECHA ,TRANSACCION, MONTO, SALDO, CONTADOR, "
                + "IDTRANSACCION, IDCLIENTE, NOMBRE) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, estado.getId());
            stmt.setDate(2, (Date) estado.getFecha());
            stmt.setString(3, estado.getTrasaccion());
            stmt.setFloat(4, estado.getMonto());
            stmt.setFloat(5, estado.getSaldo());
            stmt.setInt(6, estado.getContador());
            stmt.setString(7, estado.getIdTrans());
            stmt.setString(8, estado.getIdcliente());
            stmt.setString(9, estado.getNombre());
            stmt.executeUpdate();
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error el estado de cuenta no se ha guardado Exitosamente.");
        }
    }

    public Estado findByIdPase(String id) throws SQLException {
        String query = "SELECT * FROM ESTADO WHERE IDESTADOCUENTA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Estado(rs.getString("IDESTADOCUENTA"), rs.getDate("FECHA"), rs.getString("TRANSACCION"),
                    rs.getFloat("MONTO"), rs.getFloat("SALDO"), rs.getInt("CONTADOR"),
                    rs.getString("IDTRANSACCION"), rs.getString("IDCLIENTE"), rs.getString("NOMBRE")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha encontrado.");
        }
        return null;
    }


    public List<Estado> obtenerEstadoByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM ESTADO WHERE IDCLIENTE = " + "'" + idCliente + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Estado> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Estado(rs.getString("IDESTADOCUENTA"), rs.getDate("FECHA"), rs.getString("TRANSACCION"),
                    rs.getFloat("MONTO"), rs.getFloat("SALDO"), rs.getInt("CONTADOR"),
                    rs.getString("IDTRANSACCION"), rs.getString("IDCLIENTE"), rs.getString("NOMBRE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public List<Estado> obtenerUltimaEstadoByIdPase(String isCliente) {
        try {
            String query = "SELECT * FROM ESTADO WHERE IDCLIENTE = " + "'" + isCliente + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Estado> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Estado(rs.getString("IDESTADOCUENTA"), rs.getDate("FECHA"), rs.getString("TRANSACCION"),
                    rs.getFloat("MONTO"), rs.getFloat("SALDO"), rs.getInt("CONTADOR"),
                    rs.getString("IDTRANSACCION"), rs.getString("IDCLIENTE"), rs.getString("NOMBRE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Estado> obtenerUltimaEstadoByIdPaseAcs(String isCliente) {
        try {
            String query = "SELECT * FROM ESTADO WHERE IDCLIENTE = " + "'" + isCliente + "'" + " ORDER BY CONTADOR ASC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Estado> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Estado(rs.getString("IDESTADOCUENTA"), rs.getDate("FECHA"), rs.getString("TRANSACCION"),
                    rs.getFloat("MONTO"), rs.getFloat("SALDO"), rs.getInt("CONTADOR"),
                    rs.getString("IDTRANSACCION"), rs.getString("IDCLIENTE"), rs.getString("NOMBRE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Estado> obtenerUltimaEstadoByFechas(Date finicio, Date ffin, String idcliente) {
        try {
            String query = "SELECT * FROM ESTADO WHERE FECHA BETWEEN " + "'" + finicio + "'" + " AND " 
                    + "'" + ffin + "'" + " AND IDCLIENTE =" + "'" + idcliente + "'" + " ORDER BY CONTADOR ASC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Estado> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Estado(rs.getString("IDESTADOCUENTA"), rs.getDate("FECHA"), rs.getString("TRANSACCION"),
                    rs.getFloat("MONTO"), rs.getFloat("SALDO"), rs.getInt("CONTADOR"),
                    rs.getString("IDTRANSACCION"), rs.getString("IDCLIENTE"), rs.getString("NOMBRE")));
            }
            return depts;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
