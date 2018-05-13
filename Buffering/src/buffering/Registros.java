
package buffering;


public class Registros {
    
    private String Nombre;
    private String Apellido; 
    private String Identidad; 
    private String Direccion; 
    private String Telefono; 
    private String Genero; 
    private String Raza; 
    private boolean Eliminado; 

    public Registros(String Nombre, String Apellido, String Identidad,
            String Direccion, String Telefono, String Genero, String Raza, boolean Eliminado) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Identidad = Identidad;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Genero = Genero;
        this.Raza = Raza;
        this.Eliminado = Eliminado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(String Identidad) {
        this.Identidad = Identidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public boolean isEliminado() {
        return Eliminado;
    }

    public void setEliminado(boolean Eliminado) {
        this.Eliminado = Eliminado;
    }
    
    
}
