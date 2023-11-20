package co.edu.uniquindio.parcial3.model;

public class DetalleFactura{
    Factura ownedByFactura;
    public Producto productoAsociado;

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

    public Producto getProductoAsociado() {
        return productoAsociado;
    }

    public void setProductoAsociado(Producto productoAsociado) {
        this.productoAsociado = productoAsociado;
    }
}
