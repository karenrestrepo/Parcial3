package co.edu.uniquindio.parcial3.model;

public class Agua extends Bebida{

    /*Constructor*/
    public Agua(String nombre, int valor) {
        super(nombre, valor);
    }

    public Agua() {
    }

    @Override
    public double calcularPrecio() {
        int precio = getValor();
        return precio;
    }
}
