package olivomed.modelos;

import java.util.Date;

/**
 *
 * @author Oscar Mendez
 */
public class Deduccion {

    String idDeduccion;
    String Nombre;
    Date fecha;
    float pase;
    float valor;
    float saldo;
    int contador;
    String idPase;

    public Deduccion(String idDeduccion, String Nombre, Date fecha, float pase, float valor, float saldo,
            int contador, String idPase) {
        this.idDeduccion = idDeduccion;
        this.Nombre = Nombre;
        this.fecha = fecha;
        this.pase = pase;
        this.valor = valor;
        this.saldo = saldo;
        this.contador = contador;
        this.idPase = idPase;
    }

    public String getIdDeduccion() {
        return idDeduccion;
    }

    public String getIdPase() {
        return idPase;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getPase() {
        return pase;
    }

    public float getValor() {
        return valor;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getContador() {
        return contador;
    }

    public void setIdDeduccion(String idDeduccion) {
        this.idDeduccion = idDeduccion;
    }

    public void setIdPase(String idPase) {
        this.idPase = idPase;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPase(float pase) {
        this.pase = pase;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
