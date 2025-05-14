package com.alura.conversor.Modelo;

public class Moneda {
    private String nombreMoneda;
    private double valorMoneda;

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public double getValorMoneda() {
        return valorMoneda;
    }

    public Moneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    public void AsignarValor(double valorMoneda){
        this.valorMoneda = valorMoneda;

    }
}
