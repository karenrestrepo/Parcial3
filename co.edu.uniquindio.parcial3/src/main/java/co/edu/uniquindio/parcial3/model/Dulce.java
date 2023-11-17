package co.edu.uniquindio.parcial3.model;

public class Dulce extends Producto{
    private int impuestoBase;
    private int contenidoAzucar;
    private String impuestoAdicional;

    /*Constructor*/

    public Dulce(String nombre, int valor, int impuestoBase, int contenidoAzucar, String impuestoAdicional) {
        super(nombre, valor);
        this.impuestoBase = impuestoBase;
        this.contenidoAzucar = contenidoAzucar;
        this.impuestoAdicional = impuestoAdicional;
    }

    public Dulce() {

    }

    /*Getters and setters*/

    public int getImpuestoBase() {
        return impuestoBase;
    }

    public void setImpuestoBase(int impuestoBase) {
        this.impuestoBase = impuestoBase;
    }

    public int getContenidoAzucar() {
        return contenidoAzucar;
    }

    public void setContenidoAzucar(int contenidoAzucar) {
        this.contenidoAzucar = contenidoAzucar;
    }

    public String getImpuestoAdicional() {
        return impuestoAdicional;
    }

    public void setImpuestoAdicional(String impuestoAdicional) {
        this.impuestoAdicional = impuestoAdicional;
    }

    @Override
    public int calcularPrecio() {
        return super.calcularPrecio();
    }
}
