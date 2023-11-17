package co.edu.uniquindio.parcial3.model;

public class BebidaAzucarada extends Bebida {
    private int impuestoBasico;
    private int contenidoAzucar;
    private int impuestoAdicional;

    /*Constructor*/

    public BebidaAzucarada(int impuestoBasico, int contenidoAzucar, int impuestoAdicional) {
        this.impuestoBasico = impuestoBasico;
        this.contenidoAzucar = contenidoAzucar;
        this.impuestoAdicional = impuestoAdicional;
    }

    public BebidaAzucarada() {
    }


    /*Getters and Setters*/
    public int getImpuestoBasico() {
        return impuestoBasico;
    }

    public void setImpuestoBasico(int impuestoBasico) {
        this.impuestoBasico = impuestoBasico;
    }

    public int getContenidoAzucar() {
        return contenidoAzucar;
    }

    public void setContenidoAzucar(int contenidoAzucar) {
        this.contenidoAzucar = contenidoAzucar;
    }

    public int getImpuestoAdicional() {
        return impuestoAdicional;
    }

    public void setImpuestoAdicional(int impuestoAdicional) {
        this.impuestoAdicional = impuestoAdicional;
    }
}
