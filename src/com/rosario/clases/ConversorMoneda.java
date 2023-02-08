package com.rosario.clases;

public class ConversorMoneda {
    float cantidad;
    String moneda1, moneda2, moneda3, moneda4, moneda5;
  double conversion;

    public ConversorMoneda() {
    }

    public ConversorMoneda(float cantidad, String moneda1, String moneda2, String moneda3, String moneda4, String moneda5, double conversion) {
        this.cantidad = cantidad;
        this.moneda1 = moneda1;
        this.moneda2 = moneda2;
        this.moneda3 = moneda3;
        this.moneda4 = moneda4;
        this.moneda5 = moneda5;
        this.conversion = conversion;
    }

    @Override
    public String toString() {
        return "\n" +
                "+----------+--------------+--------------------+---------------+\n" +
                "| CANTIDAD |MONEDA ORIGEN |CANTIDAD CONVERTIDA |MONEDA DESTINO |\n" +
                "+----------+--------------+--------------------+---------------+\n" +
                "| "+getCantidad()+" |"+getMoneda1().toString() +" | "+getConversion()+" |  "+getMoneda2().toString()+"|\n " +
                "+----------+--------------+--------------------+---------------+\n" +
                "|       10 |         DLLS |            0.00043 |           BTC |\n" +
                "+----------+--------------+--------------------+---------------+";
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getMoneda1() {
        return moneda1;
    }

    public void setMoneda1(String moneda1) {
        this.moneda1 = moneda1;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public void setMoneda2(String moneda2) {
        this.moneda2 = moneda2;
    }

    public String getMoneda3() {
        return moneda3;
    }

    public void setMoneda3(String moneda3) {
        this.moneda3 = moneda3;
    }

    public String getMoneda4() {
        return moneda4;
    }

    public void setMoneda4(String moneda4) {
        this.moneda4 = moneda4;
    }

    public String getMoneda5() {
        return moneda5;
    }

    public void setMoneda5(String moneda5) {
        this.moneda5 = moneda5;
    }

    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }
}
