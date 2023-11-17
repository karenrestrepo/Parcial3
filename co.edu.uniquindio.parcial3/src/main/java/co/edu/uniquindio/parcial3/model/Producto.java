package co.edu.uniquindio.parcial3.model;

public class Producto {
    private String nombre;
    private int valor;
    Cafeteria ownedByCafeteria;

    public int calcularPrecio();

    /*Constructor*/

    public Producto(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Producto() {
    }

    /*Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Cafeteria getOwnedByCafeteria() {
        return ownedByCafeteria;
    }

    public void setOwnedByCafeteria(Cafeteria ownedByCafeteria) {
        this.ownedByCafeteria = ownedByCafeteria;
    }

}
