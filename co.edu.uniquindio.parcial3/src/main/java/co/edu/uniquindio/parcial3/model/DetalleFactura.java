package co.edu.uniquindio.parcial3.model;

public class DetalleFactura{
    Factura ownedByFactura;

    /*Constructor*/
    public DetalleFactura() {
    }

    /*Getters abd setters*/

    public Factura getOwnedByFactura() {
        return ownedByFactura;
    }

    public void setOwnedByFactura(Factura ownedByFactura) {
        this.ownedByFactura = ownedByFactura;
    }
}
