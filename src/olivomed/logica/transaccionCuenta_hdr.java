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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import olivomed.modelos.Cuenta_hdr;

/**
 *
 * @author admin
 */
public class transaccionCuenta_hdr {

    ServiciosDB service = new ServiciosDB();

    public void createCuenta(Cuenta_hdr cue) {
        String query = "INSERT INTO CUENTA_HDR "
                + "(IDCUENTA, IDEMPLEADO, NOMBRE, ESTATUSFINANCIERO, CONTADOR, FECHA) "
                + "VALUES (? , ? , ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, cue.getIdCuenta());
            stmt.setString(2, cue.getIdEmpleado());
            stmt.setString(3, cue.getNombre());
            stmt.setString(4, cue.getEstatuFinanciero());
            stmt.setInt(5, cue.getContador());
            stmt.setDate(6, (Date) cue.getFecha());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La cuenta: " + cue.getIdCuenta() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El empleado: " + cue.getIdCuenta() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateCuenta(String id, Cuenta_hdr cue) throws SQLException {
        String query = "UPDATE CUENTA_HDR "
                + "SET IDEMPLEADO=?, NOMBRE=?, ESTATUSFINANCIERO=?, FECHA=?, FECHAPAGADA=?"
                + "WHERE IDCUENTA=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, cue.getIdEmpleado());
            stmt.setString(2, cue.getNombre());
            stmt.setString(2, cue.getEstatuFinanciero());
            stmt.setDate(3, (Date) cue.getFecha());
            stmt.setString(4, cue.getIdCuenta());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El empleado: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El empleado: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteCuenta(String id) throws SQLException {
        Cuenta_hdr cue = findByIdCuenta(id);
        if (cue == null) {
            JOptionPane.showMessageDialog(null, "Codigo de empleado: " + id + " no existe.");
        }
        String query = "DELETE FROM CUENTA_HDR WHERE IDCUENTA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de empleado: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha borrado.");
        }
    }

    public Cuenta_hdr findByIdCuenta(String id) throws SQLException {
        String query = "SELECT * FROM CUENTA_HDR WHERE IDCUENTA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Cuenta_hdr(rs.getString("IDCUENTA"),
                    rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"), rs.getString("ESTATUSFINANCIERO"),
                    rs.getInt("CONTADOR"), rs.getDate("FECHA")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Cuenta_hdr> findAllCuenta() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM CUENTA_HDR";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Cuenta_hdr> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Cuenta_hdr(rs.getString("IDCUENTA"),
                        rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"), rs.getString("ESTATUSFINANCIERO"),
                        rs.getInt("CONTADOR"), rs.getDate("FECHA")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR. ");
        }
        return null;
    }

    public List<Cuenta_hdr> obtenerCuentahdrByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM CUENTA_HDR WHERE IDEMPLEADO = " + "'" + idCliente + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Cuenta_hdr> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Cuenta_hdr(rs.getString("IDCUENTA"),
                        rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"), rs.getString("ESTATUSFINANCIERO"),
                        rs.getInt("CONTADOR"), rs.getDate("FECHA")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Cuenta_hdr obtenerCuentahdrAtivaByIdCliente(String idCliente) {
        try {
            Cuenta_hdr cue = null;
            String query = "SELECT * FROM CUENTA_HDR WHERE IDEMPLEADO = " + "'" + idCliente + "'"
                    + " AND ESTATUSFINANCIERO = " + "'" + "A" + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                cue = (new Cuenta_hdr(rs.getString("IDCUENTA"),
                        rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"), rs.getString("ESTATUSFINANCIERO"),
                        rs.getInt("CONTADOR"), rs.getDate("FECHA")));
            }
            return cue;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Cuenta_hdr> listEmpleadosDeduccion(String tipoEmpleado) {
        try {
            String query = "SELECT * FROM CUENTA_HDR INNER JOIN EMPLEADO ON CUENTA_HDR.IDEMPLEADO = EMPLEADO.CODIGO "
                    + "WHERE EMPLEADO.TIPO = " + "'" + tipoEmpleado + "'" + "AND EMPLEADO.ESTADO != 'INACTIVO'"
                    + "AND (SELECT FN_GETSALDO(CUENTA_HDR.IDCUENTA)) > 1";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Cuenta_hdr> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Cuenta_hdr(rs.getString("IDCUENTA"),
                        rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"), rs.getString("ESTATUSFINANCIERO"),
                        rs.getInt("CONTADOR"), rs.getDate("FECHA")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Cuenta_hdr> listEmpleadosInactivos() {
        try {
            String query = "SELECT * FROM CUENTA_HDR LEFT JOIN EMPLEADO ON CUENTA_HDR.IDEMPLEADO = EMPLEADO.CODIGO "
                    + "WHERE EMPLEADO.ESTADO = 'INACTIVO'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Cuenta_hdr> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Cuenta_hdr(rs.getString("IDCUENTA"),
                        rs.getString("IDEMPLEADO"), rs.getString("NOMBRE"), rs.getString("ESTATUSFINANCIERO"),
                        rs.getInt("CONTADOR"), rs.getDate("FECHA")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
