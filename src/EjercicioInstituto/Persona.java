package EjercicioInstituto;

public class Persona {
    protected String dni;
    protected String nombre;
    protected int edad;
    protected String direccion;


    public Persona() {
        this.dni = "";
        this.nombre = "";
        this.edad = 0;
        this.direccion = "";
    }

    public Persona(String dni, String nombre, int edad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
