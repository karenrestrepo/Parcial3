package co.edu.uniquindio.parcial3.services;

import co.edu.uniquindio.parcial3.model.*;

public interface ICafeteria {
    Factura crearFactura(int numeroFactura, Cliente cliente, Cafeteria cafeteria);
    void crearDetalleFactura(Factura factura, Producto producto, int cantidad);
    Cliente obtenerCliente(String cedula);
    Producto obtenerProducto(String nombre);
    void calcularTotalFactura(Factura factura);

    void calcularTotalProductos(Factura factura);
}
