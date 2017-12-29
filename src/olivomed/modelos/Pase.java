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
    float deduccion;
    int contador;
    int numero;
    String medico;
    String mes;
    int pagos;
    String Estado;

    public Pase(String idPase, String idempleado, String nombre, String fecha, float valor, float deduccion, int contador,
            int numero, String medico, String mes, int pagos, String Estado) {
        this.idPase = idPase;
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.fecha = fecha;
        this.valor = valor;
        this.deduccion = deduccion;
        this.contador = contador;
        this.numero = numero;
        this.medico = medico;
        this.mes = mes;
        this.pagos = pagos;
        this.Estado = Estado;
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

    public float getDeduccion() {
        return deduccion;
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

    public void setDeduccion(float deduccion) {
        this.deduccion = deduccion;
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

    public int getPagos() {
        return pagos;
    }

    public void setPagos(int pagos) {
        this.pagos = pagos;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
