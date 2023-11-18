package co.edu.uniquindio.parcial3.model;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    private String nombre;
    List<Cliente> listaClientes = new ArrayList<>();
    List<Factura> listaFactura = new ArrayList<>();
    List<Producto> listaProductos = new ArrayList<>();

    /*Constructor*/

    public Cafeteria() {
    }

    /*Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
