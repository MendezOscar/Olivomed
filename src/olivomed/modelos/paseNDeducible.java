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
public class paseNDeducible {

    String idPase;
    String nombre;
    Date fecha;
    float valor;
    String medico;
    int contador;
    int numero;
    String codigo;
    String mes;

    public paseNDeducible(String idPase, String nombre, Date fecha, float valor, String medico, 
            int contador, int numero, String codigo, String mes) {
        this.idPase = idPase;
        this.nombre = nombre;
        this.fecha = fecha;
        this.valor = valor;
        this.medico = medico;
        this.contador = contador;
        this.numero = numero;
        this.codigo = codigo;
        this.mes = mes;
    }

    public String getIdPase() {
        return idPase;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getValor() {
        return valor;
    }

    public int getNumero() {
        return numero;
    }

    public String getMedico() {
        return medico;
    }

    public int getContador() {
        return contador;
    }

    public void setIdPase(String idPase) {
        this.idPase = idPase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

   
}
