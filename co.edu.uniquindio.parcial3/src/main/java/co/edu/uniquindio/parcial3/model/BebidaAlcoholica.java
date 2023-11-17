package co.edu.uniquindio.parcial3.model;

import co.edu.uniquindio.parcial3.model.Enum.TipoBebidaAlcoholica;

public class BebidaAlcoholica extends Bebida{
    private int gradoAlcohol;
    private TipoBebidaAlcoholica tipoBebidaAlcoholica;

    /*Constructor*/
    public BebidaAlcoholica(int gradoAlcohol, TipoBebidaAlcoholica tipoBebidaAlcoholica) {
        this.gradoAlcohol = gradoAlcohol;
        this.tipoBebidaAlcoholica = tipoBebidaAlcoholica;
    }

    public BebidaAlcoholica() {
    }

    /*Getters and setters*/

    public int getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(int gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public TipoBebidaAlcoholica getTipoBebidaAlcoholica() {
        return tipoBebidaAlcoholica;
    }

    public void setTipoBebidaAlcoholica(TipoBebidaAlcoholica tipoBebidaAlcoholica) {
        this.tipoBebidaAlcoholica = tipoBebidaAlcoholica;
    }
}
