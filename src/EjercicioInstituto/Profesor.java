package EjercicioInstituto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Profesor extends Miembro{
    private String tipoJornada;
    private double sueldo;
    private String especialidadImpartida;

    public Profesor() {
        this.tipoJornada = "";
        this.sueldo = 0;
        this.especialidadImpartida = "";
    }

    public Profesor(String dni, String nombre, int edad, String direccion, LocalDate fechaIncorporacion, String tipoJornada, double sueldo, String especialidadImpartida) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.tipoJornada = tipoJornada;
        this.sueldo = sueldo;
        this.especialidadImpartida = especialidadImpartida;
    }


    @Override
    public void aplicarBonificacion() {

        if (ChronoUnit.YEARS.between(getFechaIncorporacion(), LocalDate.now()) > 3)   setSueldo(sueldo * 1.15);
    }


    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEspecialidadImpartida() {
        return especialidadImpartida;
    }

    public void setEspecialidadImpartida(String especialidadImpartida) {
        this.especialidadImpartida = especialidadImpartida;
    }
}
