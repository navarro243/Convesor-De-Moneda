package com.alura.conversor.Procedimiento;

import com.alura.conversor.Modelo.Moneda;

public class Calculos {
    public double ConvercionTotal( Moneda monedaAConvertir, double cantidadAConvertir){

        return monedaAConvertir.getValorMoneda() * cantidadAConvertir;
    }
}
