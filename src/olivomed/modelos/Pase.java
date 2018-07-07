package olivomed.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Pase {

    String idPase;
    String idempleado;
    String nombre;
    String fecha;
    float valor;
    int contador;
    int numero;
    String medico;
    String mes;

    public Pase(String idPase, String idempleado, String nombre, String fecha, float valor, int contador,
            int numero, String medico, String mes) {
        this.idPase = idPase;
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.fecha = fecha;
        this.valor = valor;
        this.contador = contador;
        this.numero = numero;
        this.medico = medico;
        this.mes = mes;
    }

    public String getIdPase() {
        return idPase;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public float getValor() {
        return valor;
    }


    public int getContador() {
        return contador;
    }

    public void setIdPase(String idPase) {
        this.idPase = idPase;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getNumero() {
        return numero;
    }

    public String getMedico() {
        return medico;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

}
