package com.alura.conversor.Procedimiento;

import com.alura.conversor.Modelo.Moneda;
import com.alura.conversor.Modelo.RespuestaApiMoneda;
import com.alura.conversor.conexion.ConexionApi;



public class Consultar {

    public void ConsultarMonedas(String monedaEscogida, String monedaAConvertir, double cantidadAComnvertir){


        ConexionApi conexion = new ConexionApi();
        RespuestaApiMoneda informacionDeCambio = conexion.ConexionApiMonedas(monedaEscogida);
        Moneda monedaATransformar = new Moneda(monedaAConvertir);
        double asignar;
        double resultado = 0.0;
        String mensajeFinal;

        for(String i : informacionDeCambio.conversion_rates().keySet()){
            if(monedaATransformar.getValorMoneda() == 0.0 ){

                 if (monedaATransformar.getNombreMoneda().equals(i)) {
                    asignar = informacionDeCambio.conversion_rates().get(i);
                    monedaATransformar.AsignarValor(asignar);
                }
            }else{
                break;
            }
        }

        if (monedaATransformar.getValorMoneda() != 0.0){
            Calculos tranformacion = new Calculos();
            resultado = tranformacion.ConvercionTotal(monedaATransformar, cantidadAComnvertir);
            mensajeFinal = """
                    -----------------------------
                    La conversion total de sus %S %.2f a %S es de %.2f
                    -----------------------------
                    
                    """;
        }else {
            mensajeFinal="Hay un Error en el aplicativo";
        }

        System.out.println(String.format(mensajeFinal,monedaAConvertir,cantidadAComnvertir,monedaAConvertir,resultado));


    }
}
