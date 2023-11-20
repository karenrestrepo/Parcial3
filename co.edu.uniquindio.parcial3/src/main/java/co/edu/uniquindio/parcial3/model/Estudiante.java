package co.edu.uniquindio.parcial3.model;

public class Estudiante extends Cliente{
    private int semestreCursado;
    private double descuentoBase;

    /*Constructor*/

    public Estudiante(String cedula, String nombre, String apellido, String correoElectronico, int semestreCurso, int descuentoBase) {
        super(cedula, nombre, apellido, correoElectronico);
        this.semestreCursado = semestreCurso;
        this.descuentoBase = descuentoBase;
    }

    public Estudiante() {
    }

    /*Getters and setters*/

    public int getSemestreCursado() {
        return semestreCursado;
    }

    public void setSemestreCursado(int semestreCursado) {
        this.semestreCursado = semestreCursado;
    }

    public double getDescuentoBase() {
        return descuentoBase;
    }

    public void setDescuentoBase(double descuentoBase) {
        this.descuentoBase = descuentoBase;
    }

    @Override
    public double calcularDescuento() {
        return semestreCursado * descuentoBase;
    }
}
