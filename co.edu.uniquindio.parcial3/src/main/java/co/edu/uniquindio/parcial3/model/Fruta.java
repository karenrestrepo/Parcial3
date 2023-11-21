package co.edu.uniquindio.parcial3.model;

import co.edu.uniquindio.parcial3.services.IFruta;

public class Fruta extends Producto implements IFruta {
    private int impuestoBase;
    private int impuestoDisminuido;

    private final double PRECIO_BASE = 7.0;

    /*Constructor*/

    public Fruta(String nombre, int valor, int impuestoDisminuido) {
        super(nombre, valor);
        this.impuestoDisminuido = impuestoDisminuido;
    }

    public Fruta() {
    }

    /*Getters and setters*/

    public int getImpuestoBase() {
        return impuestoBase;
    }

    public void setImpuestoBase(int impuestoBase) {
        this.impuestoBase = impuestoBase;
    }

    public int getImpuestoDisminuido() {
        return impuestoDisminuido;
    }

    public void setImpuestoDisminuido(int impuestoDisminuido) {
        this.impuestoDisminuido = impuestoDisminuido;
    }


    @Override
    public double calcularPrecio(int pesoKilo) {
        double impuesto = calcularImpuesto(pesoKilo);
        double precioFinal = 0.0;
        //precioFinal = getValor()





        return 0;
    }

    private  double calcularImpuesto(int pesoKilo) {
        double impuesto = PRECIO_BASE;
        int resultado = 0;
        if (pesoKilo > 3){
            resultado =  pesoKilo - 3;
            if(resultado >= 7){
                impuesto = 0;
            }else{
                impuesto = impuesto - resultado;
            }
        }

        return  impuesto/100;
    }
}
