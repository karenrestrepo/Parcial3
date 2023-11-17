package co.edu.uniquindio.parcial3.model;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    Cafeteria ownedByCafeteria;
    List<DetalleFactura> listaDetallesFacturas = new ArrayList<>();

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
}
