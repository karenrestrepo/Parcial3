package co.edu.uniquindio.parcial3;

import co.edu.uniquindio.parcial3.model.*;

public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria = inicilaizarDatosPrueba();
        Producto producto = crearProducto();
    }

    private static Cafeteria inicilaizarDatosPrueba() {
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.setNombre("Caffe");
        return cafeteria;
    }

    private static Cafeteria crearProducto() {
        Dulce dulce = new Dulce();
        dulce.setNombre("Bombon");
        dulce.setValor(600);
        dulce.setImpuestoBase(0.1);
        dulce.setContenidoAzucar(60);
        dulce.setImpuestoAdicional(0.1);

        Agua agua = new Agua();
        agua.setNombre("Cristal");
        agua.setValor(2000);

        getL

        return
    }
}