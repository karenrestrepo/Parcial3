package co.edu.uniquindio.parcial3.model;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int numeroFactura;
    private double totalFactura;
    private double totalProducto;
    Cafeteria ownedByCafeteria;
    List<DetalleFactura> listaDetallesFacturas = new ArrayList<>();
    public Cliente clienteAsociado;

    /*Constructor*/

    public Factura() {
    }

    /*Getters and Setters*/

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Cafeteria getOwnedByCafeteria() {
        return ownedByCafeteria;
    }

    public void setOwnedByCafeteria(Cafeteria ownedByCafeteria) {
        this.ownedByCafeteria = ownedByCafeteria;
    }


    public List<DetalleFactura> getListaDetallesFacturas() {
        return listaDetallesFacturas;
    }

    public void setListaDetallesFacturas(List<DetalleFactura> listaDetallesFacturas) {
        this.listaDetallesFacturas = listaDetallesFacturas;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public double getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(double totalProducto) {
        this.totalProducto = totalProducto;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroFactura=" + numeroFactura +
                ", totalFactura=" + totalFactura +
                ", ownedByCafeteria=" + ownedByCafeteria +
                ", listaDetallesFacturas=" + listaDetallesFacturas +
                ", clienteAsociado=" + clienteAsociado +
                '}';
    }

    public void calcularTotal() {
        double acumuladoFactura = 0.0;
        double valorTotalDetalle = 0.0;
        double descuento = clienteAsociado.calcularDescuento();
        double totalFactura = 0.0;
        for(DetalleFactura detalleFactura: getListaDetallesFacturas()){
            valorTotalDetalle = detalleFactura.calularValorDetalle();
            acumuladoFactura = acumuladoFactura + valorTotalDetalle;
            valorTotalDetalle = 0.0;
        }
        totalFactura = acumuladoFactura - (acumuladoFactura * descuento);
        setTotalFactura(totalFactura);
    }

    public void calcularTotalProductos() {
        double acumuladoProductos = 0.0;
        double cantidadProductosDetalle = 0.0;
        for (DetalleFactura detalleFactura : getListaDetallesFacturas()) {
            cantidadProductosDetalle = detalleFactura.getCantidad();
            acumuladoProductos = acumuladoProductos + cantidadProductosDetalle;
            cantidadProductosDetalle = 0.0;

        }
        setTotalProducto(acumuladoProductos);
    }
}
