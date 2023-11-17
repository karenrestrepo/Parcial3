package co.edu.uniquindio.parcial3.model;

public class BebidaAzucarada extends Bebida {
    private int impuestoBasico;
    private int contenidoAzucar;
    private int impuestoAdicional;

    /*Constructor*/

    public BebidaAzucarada(String nombre, int valor, int impuestoBasico, int contenidoAzucar, int impuestoAdicional) {
        super(nombre, valor);
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
