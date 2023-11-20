package co.edu.uniquindio.parcial3.model;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    Cafeteria ownedByCafeteria;
    List<DetalleFactura> listaDetallesFacturas = new ArrayList<>();
    public Cliente clienteAsociado;

    /*Constructor*/

    public Factura() {
    }

    /*Getters and Setters*/

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
}
