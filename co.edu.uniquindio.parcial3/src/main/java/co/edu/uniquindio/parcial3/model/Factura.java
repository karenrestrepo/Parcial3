package co.edu.uniquindio.parcial3.model;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int numeroFactura;
    private double totalFactura;
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
        for(DetalleFactura detalleFactura: getListaDetallesFacturas()){
            valorTotalDetalle = detalleFactura.calularValorDetalle();
            acumuladoFactura = acumuladoFactura + valorTotalDetalle;
            valorTotalDetalle = 0.0;
        }
        setTotalFactura(acumuladoFactura);
    }
}
