package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int quantidade = 100000;

        List<Integer> lista = new ArrayList<>();
        Set<Integer> conjunto = new HashSet<>();
        Map<Integer, Integer> mapa = new HashMap<>();

        long inicio; // tempo de início
        long fim; // tempo de fim
        long total;
        double individual;

        //Para a lista
        inicio = System.currentTimeMillis();
        for(int i = 0; i < quantidade; i++){
            lista.add(i);
        }
        fim = System.currentTimeMillis();

        //Tempo que gastou na operaçao do for
        total = fim - inicio;
        individual = (double) total / (double) quantidade;
        System.out.println("Lista: Tempo total: " + total + "ms, Tempo por incersão: " + individual + "ms");
        System.out.println("----------------------------------------------------");

        //Para o conjunto
        inicio = System.currentTimeMillis();
        for(int i = 0; i < quantidade; i++){
            conjunto.add(i);
        }
        fim = System.currentTimeMillis();

        //Tempo que gastou na operaçao do for
        total = fim - inicio;
        individual = (double) total / (double) quantidade;
        System.out.println("Conjunto: Tempo total: " + total + "ms, Tempo por incersão: " + individual + "ms");
        System.out.println("----------------------------------------------------");


        //Para o mapa
        inicio = System.currentTimeMillis();
        for(int i = 0; i < quantidade; i++){
            mapa.put(i, i); // a chave e o valor são iguais
        }
        fim = System.currentTimeMillis();

        //Tempo que gastou na operaçao do for
        total = fim - inicio;
        individual = (double) total / (double) quantidade;
        System.out.println("Mapa: Tempo total: " + total + "ms, Tempo por incersão: " + individual + "ms");
        System.out.println("----------------------------------------------------");


        //Utilizando o método de busca
        System.out.println("----------------------Busca-------------------------");
        //Para a lista
        inicio = System.currentTimeMillis();
        for(int i = 0; i < quantidade; i++){
            lista.contains(i);
        }
        fim = System.currentTimeMillis();

        //Tempo que gastou na operaçao do for
        total = fim - inicio;
        System.out.println("Lista: Tempo total: " + total + "ms");
        System.out.println("----------------------------------------------------");

        //Para o conjunto
        inicio = System.currentTimeMillis();
        for(int i = 0; i < quantidade; i++){
            conjunto.contains(i);
        }
        fim = System.currentTimeMillis();

        //Tempo que gastou na operaçao do for
        total = fim - inicio;
        System.out.println("Conjunto: Tempo total: " + total + "ms");
        System.out.println("----------------------------------------------------");


        //Para o mapa
        inicio = System.currentTimeMillis();
        for(int i = 0; i < quantidade; i++){
            mapa.get(i);
        }
        fim = System.currentTimeMillis();

        //Tempo que gastou na operaçao do for
        total = fim - inicio;
        System.out.println("Mapa: Tempo total: " + total + "ms");
        System.out.println("----------------------------------------------------");
    }
}