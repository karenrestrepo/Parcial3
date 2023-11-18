package co.edu.uniquindio.parcial3.model;

public class Dulce extends Producto{
    private double impuestoBase;
    private int contenidoAzucar;
    private double impuestoAdicional;

    /*Constructor*/

    public Dulce(String nombre, int valor, double impuestoBase, int contenidoAzucar, double impuestoAdicional) {
        super(nombre, valor);
        this.impuestoBase = impuestoBase;
        this.contenidoAzucar = contenidoAzucar;
        this.impuestoAdicional = impuestoAdicional;
    }

    public Dulce() {

    }

    /*Getters and setters*/

    public double getImpuestoBase() {
        return impuestoBase;
    }

    public void setImpuestoBase(double impuestoBase) {
        this.impuestoBase = impuestoBase;
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
        if (contenidoAzucar > 50) {
            impuestoFinal = impuestoBase + impuestoAdicional;
        }
        else {
            impuestoFinal = impuestoBase;
        }
        return precioBase * (1 + impuestoFinal);
    }
}
