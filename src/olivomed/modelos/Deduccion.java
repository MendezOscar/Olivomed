
package olivomed.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Deduccion {
    String idDeduccion;
    String idPase;
    String Nombre;
    String fecha;
    float pase;
    float valor;
    float saldo;
    int contador;
    String Medico;

    public Deduccion(String idDeduccion, String idPase, String Nombre, String fecha, float pase, float valor, float saldo, 
            int contador, String Medico) {
        this.idDeduccion = idDeduccion;
        this.idPase = idPase;
        this.Nombre = Nombre;
        this.fecha = fecha;
        this.pase = pase;
        this.valor = valor;
        this.saldo = saldo;
        this.contador = contador;
        this.Medico = Medico;
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

    public String getFecha() {
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

    public void setFecha(String fecha) {
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

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public String getMedico() {
        return Medico;
    }
    
}
