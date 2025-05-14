import com.alura.conversor.Procedimiento.Consultar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        double cantidadAConvertir;
        ArrayList<String> monedas = new ArrayList<>();
        monedas.add("COP");
        monedas.add("USD");
        monedas.add("BRL");
        monedas.add("ARS");
        monedas.add("CLP");
        Consultar realizarConsulta = new Consultar();


        while (opcion < 9){
            System.out.println("""
                    ************************************************************

                    Por Favor escoja que convercion desea hacer
                    1)COP a USD
                    2)USD a COP
                    3)BRL a USD
                    4)USD a BRL
                    5)ARS a USD
                    6)USD a ARS
                    7)CLP a USD
                    8)USD a CLP
                    9)Salir
                    
                    ************************************************************
                    
                    """);
            try {
                opcion = teclado.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Por Favor ingrese un numero valido");
                break;
            }

            System.out.println("Cantidad a convertir");
            try {
                cantidadAConvertir = teclado.nextDouble();
            }catch (NumberFormatException e){
                System.out.println("Por Favor ingrese un numero valido ");
                break;
            }


            switch (opcion){
                case 1:

                    realizarConsulta.ConsultarMonedas(monedas.get(0) , monedas.get(1), cantidadAConvertir);
                    break;

                case 2:

                    realizarConsulta.ConsultarMonedas(monedas.get(1) , monedas.get(0), cantidadAConvertir);
                    break;


                case 3:

                    realizarConsulta.ConsultarMonedas(monedas.get(2) , monedas.get(1), cantidadAConvertir);
                    break;


                case 4:

                    realizarConsulta.ConsultarMonedas(monedas.get(1) , monedas.get(2), cantidadAConvertir);
                    break;


                case 5:

                    realizarConsulta.ConsultarMonedas(monedas.get(3) , monedas.get(1), cantidadAConvertir);
                    break;


                case 6:

                    realizarConsulta.ConsultarMonedas(monedas.get(1) , monedas.get(3), cantidadAConvertir);
                    break;


                case 7:

                    realizarConsulta.ConsultarMonedas(monedas.get(4) , monedas.get(1), cantidadAConvertir);
                    break;


                case 8:

                    realizarConsulta.ConsultarMonedas(monedas.get(1) , monedas.get(4), cantidadAConvertir);
                    break;


                default:
                    System.out.println("Opcion no valida");



            }



        }







    }
}
