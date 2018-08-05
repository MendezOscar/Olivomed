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
public class Estado {
    String id;
    Date fecha;
    String trasaccion;
    float monto;
    float saldo;
    int contador;
    String idTrans;
    String idcliente;
    String nombre;

    public Estado(String id, Date fecha, String trasaccion, float monto, float saldo, 
            int contador, String idTrans, String idcliente, String nombre) {
        this.id = id;
        this.fecha = fecha;
        this.trasaccion = trasaccion;
        this.monto = monto;
        this.saldo = saldo;
        this.contador = contador;
        this.idTrans = idTrans;
        this.idcliente = idcliente;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTrasaccion() {
        return trasaccion;
    }

    public float getMonto() {
        return monto;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getContador() {
        return contador;
    }

    public String getIdTrans() {
        return idTrans;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTrasaccion(String trasaccion) {
        this.trasaccion = trasaccion;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setIdTrans(String idTrans) {
        this.idTrans = idTrans;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
