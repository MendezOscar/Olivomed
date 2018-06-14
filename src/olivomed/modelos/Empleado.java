
package olivomed.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Empleado {
    String idEmpleado;
    String nombre;
    int contador;
    String capataz;
    String tipo;
    String estado;

    public Empleado(String idEmpleado, String nombre, int contador, String capataz, String Tipo, String estado) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.contador = contador;
        this.capataz = capataz;
        this.tipo = Tipo;
        this.estado = estado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getContador() {
        return contador;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getCapataz() {
        return capataz;
    }

    public void setCapataz(String capataz) {
        this.capataz = capataz;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
   
}
