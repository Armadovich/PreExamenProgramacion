package EjercicioInstituto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno extends Miembro{
    private String ciclo;
    private double mediaNotas;
    private double importeMatricula;


    public Alumno() {
        this.ciclo = "";
        this.mediaNotas = 0;
        this.importeMatricula = 0;
    }
    public Alumno(String dni, String nombre, int edad, String direccion, LocalDate fechaIncorporacion, String ciclo, double mediaNotas, double importeMatricula) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.ciclo = ciclo;
        this.mediaNotas = mediaNotas;
        this.importeMatricula = importeMatricula;
    }


    @Override
    public void aplicarBonificacion() {
        if (ChronoUnit.YEARS.between(getFechaIncorporacion(), LocalDate.now()) > 2)   setImporteMatricula(importeMatricula * 0.9);
    }


    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public double getImporteMatricula() {
        return importeMatricula;
    }

    public void setImporteMatricula(double importeMatricula) {
        this.importeMatricula = importeMatricula;
    }
}
