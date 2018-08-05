/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olivomed.modelos;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Cuenta_dtl {
    String idCorr;
    String idCuenta;
    String idPase;
    float valor;
    int contador;
    Date fecha;

    public Cuenta_dtl(String idCorr, String idCuenta, String idPase, float valor, int contador, Date fecha) {
        this.idCorr = idCorr;
        this.idCuenta = idCuenta;
        this.idPase = idPase;
        this.valor = valor;
        this.contador = contador;
        this.fecha = fecha;
        
    }
    
    

    public String getIdCorr() {
        return idCorr;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public String getIdPase() {
        return idPase;
    }

    public float getValor() {
        return valor;
    }

    public int getContador() {
        return contador;
    }

    public void setIdCorr(String idCorr) {
        this.idCorr = idCorr;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setIdPase(String idPase) {
        this.idPase = idPase;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
