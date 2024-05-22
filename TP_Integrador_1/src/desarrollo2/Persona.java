package desarrollo2;

public class Persona {

    private String genero;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private int dni;

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Persona(String generoParam, String fechaNacimientoParam, String nombreParam, String apellidoParam, int dniParam) {
        this.nombre = nombreParam;
        this.apellido = apellidoParam;
        this.fechaNacimiento = fechaNacimientoParam;
        this.dni = dniParam;
        this.genero = generoParam;
    }
}
