package co.edu.uniquindio.parcial3.model;

public class DetalleFactura{
    private int cantidad;
    Factura ownedByFactura;
    public Producto productoAsociado;

    /*Constructor*/
    public DetalleFactura() {
    }

    /*Getters abd setters*/

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

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

    public double calularValorDetalle() {
        if(getProductoAsociado() instanceof Dulce){
            return  ((Dulce)getProductoAsociado()).calcularPrecio();
        }

        if(getProductoAsociado() instanceof Fruta){
            return  ((Fruta)getProductoAsociado()).calcularPrecio(getCantidad());
        }

        if(getProductoAsociado() instanceof BebidaAlcoholica){
            return  ((BebidaAlcoholica)getProductoAsociado()).calcularPrecio();
        }

        return 0.0;
    }
}
