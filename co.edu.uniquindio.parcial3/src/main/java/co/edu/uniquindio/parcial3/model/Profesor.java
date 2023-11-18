package co.edu.uniquindio.parcial3.model;

import co.edu.uniquindio.parcial3.model.Enum.TipoProfesor;

public class Profesor extends Cliente{
    private TipoProfesor tipoProfesor;


    /*constructor*/

    public Profesor(String cedula, String nombre, String apellido, String correoElectronico, int descuento, TipoProfesor tipoProfesor) {
        super(cedula, nombre, apellido, correoElectronico);
        this.tipoProfesor = tipoProfesor;
    }

    public Profesor() {
    }

    /*Getters and setters*/

    public TipoProfesor getTipoProfesor() {
        return tipoProfesor;
    }

    public void setTipoProfesor(TipoProfesor tipoProfesor) {
        this.tipoProfesor = tipoProfesor;
    }

    @Override
    public double calcularDescuento() {
        double descuento = 0.0;
        if (tipoProfesor == TipoProfesor.AUXILIAR){
            descuento = 0.03;
        }
        if (tipoProfesor == TipoProfesor.ASISTENTE){
            descuento = 0.05;
        }
        if (tipoProfesor == TipoProfesor.ASOCIADO){
            descuento = 0.1;
        }
        if (tipoProfesor == TipoProfesor.TITULAR){
            descuento = 0.16;
        }
        return descuento;
    }
}
