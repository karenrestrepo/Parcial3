package co.edu.uniquindio.parcial3.model;

import co.edu.uniquindio.parcial3.services.ICafeteria;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria implements ICafeteria {
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


    @Override
    public Factura crearFactura(int numeroFactura, Cliente cliente) {
        Factura factura = new Factura();
        factura.setClienteAsociado(cliente);
        factura.setNumeroFactura(numeroFactura);
        return factura;
    }

    @Override
    public void crearDetalleFactura(Factura factura, Producto producto, int cantidad) {
        DetalleFactura detalleFactura = new DetalleFactura();
        detalleFactura.setProductoAsociado(producto);
        detalleFactura.setCantidad(cantidad);
        factura.getListaDetallesFacturas().add(detalleFactura);
        detalleFactura.setOwnedByFactura(factura);
    }

    @Override
    public Cliente obtenerCliente(String cedula) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : getListaClientes()) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }

    @Override
    public Producto obtenerProducto(String nombre) {
        return getListaProductos().stream()
                .filter(producto -> producto.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void calcularTotalFactura(Factura factura) {
        factura.calcularTotal();
    }
}
