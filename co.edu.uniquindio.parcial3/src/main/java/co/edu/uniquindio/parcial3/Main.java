package co.edu.uniquindio.parcial3;

import co.edu.uniquindio.parcial3.model.*;
import co.edu.uniquindio.parcial3.model.Enum.TipoBebidaAlcoholica;
import co.edu.uniquindio.parcial3.model.Enum.TipoProfesor;

public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria = inicilaizarDatosPrueba();
        Cliente cliente = cafeteria.obtenerCliente("113");
        Producto producto = cafeteria.obtenerProducto("Bombon");
        Producto producto2 = cafeteria.obtenerProducto("BBC Macondo");
        Producto producto3 = cafeteria.obtenerProducto("Gaseosa");
        Producto producto4 = cafeteria.obtenerProducto("Pan");
        Producto producto5 = cafeteria.obtenerProducto("Piña");
        Factura factura = cafeteria.crearFactura(155, cliente, cafeteria);
        cafeteria.crearDetalleFactura(factura, producto, 5);
        cafeteria.crearDetalleFactura(factura, producto2, 3);
        cafeteria.crearDetalleFactura(factura, producto3, 1);
        cafeteria.crearDetalleFactura(factura, producto4, 4);
        cafeteria.crearDetalleFactura(factura, producto5, 8);
        cafeteria.calcularTotalFactura(factura);
        System.out.println("Informacion de la factura:"+ factura.toString());
    }

    private static Cafeteria inicilaizarDatosPrueba() {
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.setNombre("Caffe");

        Dulce dulce = new Dulce();
        dulce.setNombre("Bombon");
        dulce.setValor(600);
        dulce.setImpuestoBase(0.1);
        dulce.setContenidoAzucar(60);
        dulce.setImpuestoAdicional(0.1);

        Agua agua = new Agua();
        agua.setNombre("Cristal");
        agua.setValor(2000);

        BebidaAzucarada bebidaAzucarada = new BebidaAzucarada();
        bebidaAzucarada.setNombre("Gaseosa");
        bebidaAzucarada.setValor(2000);
        bebidaAzucarada.setContenidoAzucar(40);
        bebidaAzucarada.setImpuestoBasico(0.05);
        bebidaAzucarada.setImpuestoAdicional(0.2);

        BebidaAlcoholica bebidaAlcoholica = new BebidaAlcoholica();
        bebidaAlcoholica.setNombre("BBC Macondo");
        bebidaAlcoholica.setValor(5000);
        bebidaAlcoholica.setTipoBebidaAlcoholica(TipoBebidaAlcoholica.NACIONAL);
        bebidaAlcoholica.setGradoAlcohol(40);

        Panaderia panaderia = new Panaderia();
        panaderia.setNombre("Pan");
        panaderia.setValor(3000);
        panaderia.setConservantes(true);

        Fruta fruta = new Fruta();
        fruta.setNombre("Piña");
        fruta.setValor(3500);

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Maria");
        estudiante.setApellido("Marin");
        estudiante.setCedula("113");
        estudiante.setCorreoElectronico("maria@gmail.com");
        estudiante.setDescuentoBase(0.012);
        estudiante.setSemestreCursado(2);

        Profesor profesor = new Profesor();
        profesor.setNombre("Mario");
        profesor.setApellido("Mora");
        profesor.setCedula("114");
        profesor.setCorreoElectronico("mario@gmail.com");
        profesor.setTipoProfesor(TipoProfesor.TITULAR);

        dulce.setOwnedByCafeteria(cafeteria);
        agua.setOwnedByCafeteria(cafeteria);
        bebidaAzucarada.setOwnedByCafeteria(cafeteria);
        bebidaAlcoholica.setOwnedByCafeteria(cafeteria);
        panaderia.setOwnedByCafeteria(cafeteria);
        fruta.setOwnedByCafeteria(cafeteria);
        estudiante.setOwnedByCafeteria(cafeteria);
        profesor.setOwnedByCafeteria(cafeteria);

        cafeteria.getListaProductos().add(dulce);
        cafeteria.getListaProductos().add(agua);
        cafeteria.getListaProductos().add(bebidaAzucarada);
        cafeteria.getListaProductos().add(bebidaAlcoholica);
        cafeteria.getListaProductos().add(panaderia);
        cafeteria.getListaProductos().add(fruta);
        cafeteria.getListaClientes().add(estudiante);
        cafeteria.getListaClientes().add(profesor);



        return cafeteria;

    }

}