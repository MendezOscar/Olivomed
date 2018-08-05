/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olivomed.modelos;

import java.sql.Date;


/**
 *
 * @author admin
 */
public class Cuenta_hdr {
    String idCuenta;
    String idEmpleado;
    String nombre;
    String estatuFinanciero;
    int contador;
    Date fecha;

    public Cuenta_hdr(String idCuenta, String idEmpleado, String nombre, String estatuFinanciero, 
            int contador, Date fecha) {
        this.idCuenta = idCuenta;
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.estatuFinanciero = estatuFinanciero;
        this.contador = contador;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstatuFinanciero() {
        return estatuFinanciero;
    }

    public int getContador() {
        return contador;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatuFinanciero(String estatuFinanciero) {
        this.estatuFinanciero = estatuFinanciero;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    
}
