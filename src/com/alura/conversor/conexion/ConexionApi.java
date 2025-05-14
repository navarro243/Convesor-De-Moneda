package com.alura.conversor.conexion;


import com.alura.conversor.Modelo.RespuestaApiMoneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {
    private String apiKeyMonedas = "4051f5796e0579a9310ccc31";;
    private URI direccion;

    public RespuestaApiMoneda ConexionApiMonedas(String moneda){
        try{
            HttpClient client = HttpClient.newHttpClient();



            direccion = URI.create("https://v6.exchangerate-api.com/v6/"+ apiKeyMonedas+"/latest/"+moneda);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), RespuestaApiMoneda.class);



        } catch (Exception e){
            throw new RuntimeException("No Se encontro la Moneda");
        }
    }





}
