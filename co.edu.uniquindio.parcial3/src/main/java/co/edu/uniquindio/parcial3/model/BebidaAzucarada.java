package co.edu.uniquindio.parcial3.model;

public class BebidaAzucarada extends Bebida {
    private double impuestoBasico;
    private int contenidoAzucar;
    private double impuestoAdicional;

    /*Constructor*/

    public BebidaAzucarada(String nombre, int valor, double impuestoBasico, int contenidoAzucar, double impuestoAdicional) {
        super(nombre, valor);
        this.impuestoBasico = impuestoBasico;
        this.contenidoAzucar = contenidoAzucar;
        this.impuestoAdicional = impuestoAdicional;
    }
    public BebidaAzucarada() {
    }


    /*Getters and Setters*/
    public double getImpuestoBasico() {
        return impuestoBasico;
    }

    public void setImpuestoBasico(double impuestoBasico) {
        this.impuestoBasico = impuestoBasico;
    }

    public int getContenidoAzucar() {
        return contenidoAzucar;
    }

    public void setContenidoAzucar(int contenidoAzucar) {
        this.contenidoAzucar = contenidoAzucar;
    }

    public double getImpuestoAdicional() {
        return impuestoAdicional;
    }

    public void setImpuestoAdicional(double impuestoAdicional) {
        this.impuestoAdicional = impuestoAdicional;
    }


    @Override
    public double calcularPrecio() {
        int precioBase = getValor();
        double impuestoFinal = 0.0;
        if (contenidoAzucar > 35) {
            impuestoFinal = impuestoBasico + impuestoAdicional;
        }
        else {
            impuestoFinal = impuestoBasico;
        }
        return precioBase * (1 + impuestoFinal);
    }
}
