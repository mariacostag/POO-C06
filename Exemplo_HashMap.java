package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> mapaPrecoStreaming = new HashMap<>();

        mapaPrecoStreaming.put("Netflix", 25.90);
        mapaPrecoStreaming.put("PrimeVideo", 14.90);
        mapaPrecoStreaming.put("HBO Max", 19.90);
        mapaPrecoStreaming.put("GloboPlay", 22.90);

        /*Buscando valores
        Double valor = mapaPrecoStreaming.get("HBO Max");

        if(valor != null)
            System.out.println(valor);
            
         */

        mapaPrecoStreaming.forEach((chave,valor) -> {
            System.out.println("Chave: " + chave + " Valor: " + valor);
        });
    }
}