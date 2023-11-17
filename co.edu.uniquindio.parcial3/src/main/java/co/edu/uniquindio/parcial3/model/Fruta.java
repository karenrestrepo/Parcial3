package co.edu.uniquindio.parcial3.model;

public class Fruta extends Producto{
    private int impuestoBase;
    private int impuestoDisminuido;

    /*Constructor*/

    public Fruta(String nombre, int valor, int impuestoBase, int impuestoDisminuido) {
        super(nombre, valor);
        this.impuestoBase = impuestoBase;
        this.impuestoDisminuido = impuestoDisminuido;
    }

    public Fruta() {
    }

    /*Getters and setters*/

    public int getImpuestoBase() {
        return impuestoBase;
    }

    public void setImpuestoBase(int impuestoBase) {
        this.impuestoBase = impuestoBase;
    }

    public int getImpuestoDisminuido() {
        return impuestoDisminuido;
    }

    public void setImpuestoDisminuido(int impuestoDisminuido) {
        this.impuestoDisminuido = impuestoDisminuido;
    }
}
