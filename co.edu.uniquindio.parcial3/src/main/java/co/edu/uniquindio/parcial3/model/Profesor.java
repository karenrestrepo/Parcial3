package co.edu.uniquindio.parcial3.model;

import co.edu.uniquindio.parcial3.model.Enum.TipoProfesor;

public class Profesor extends Cliente{
    private int descuento;
    private TipoProfesor tipoProfesor;

    public Profesor(int descuento, TipoProfesor tipoProfesor) {
        this.descuento = descuento;
        this.tipoProfesor = tipoProfesor;
    }

    /*constructor*/
    public Profesor(int descuento) {
        this.descuento = descuento;
    }

    public Profesor() {
    }

    /*Getters and setters*/

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public TipoProfesor getTipoProfesor() {
        return tipoProfesor;
    }

    public void setTipoProfesor(TipoProfesor tipoProfesor) {
        this.tipoProfesor = tipoProfesor;
    }
}
