package EjercicioInstituto;


import java.time.LocalDate;

public abstract class Miembro extends Persona{
    protected LocalDate fechaIncorporacion;


    public Miembro() {
        this.fechaIncorporacion = LocalDate.now();
    }

    public Miembro(String dni, String nombre, int edad, String direccion, LocalDate fechaIncorporacion) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
    }


    public abstract void aplicarBonificacion();


    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
}
