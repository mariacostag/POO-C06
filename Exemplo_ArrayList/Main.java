package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Permite adicionar um elemento de qualquer tipo
        List listaGenerica = new ArrayList<>();
        listaGenerica.add(1);
        listaGenerica.add("Inatel");
        listaGenerica.add(true);

        System.out.println(listaGenerica);

        // Recuperando elemento exclusivo do ArrayLista
        int elemento = (int) listaGenerica.get(0);
        int elemento1 = (int) listaGenerica.getFirst();

        System.out.println(elemento1);
        System.out.println(elemento);

        //Lista de um tipo específico
        List<String> listaString = new ArrayList<>();
        listaString.add("String");
        listaString.add("Inatel");
        listaGenerica.add("POO");
        //listaGenerica.add(1); // não compila

        /*
        String elementoString = listaString.get(2);
        System.out.println(elementoString);

         */

        //Percorrer a nossa lista de String
        for(String texto: listaString) {
            System.out.println(texto);
        }

        for(int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i));
        }

        listaString.forEach((texto) -> {
            System.out.println(texto);
        });

        List<Doce> doces = new ArrayList<Doce>();

        Bolo bolo = new Bolo("Bolo de chocolate", 35);
        Pudim pudim = new Pudim("Pudim de leite condensado", 10);
        Cocada cocada = new Cocada("Cocada", 15);

        doces.add(bolo);
        doces.add(pudim);
        doces.add(cocada);

        // Ordenação
        System.out.println(listaString);
        Collections.sort(listaString);
        System.out.println(listaString);

        List<Integer> inteiros = new ArrayList<>();

        inteiros.add(1);
        inteiros.add(10);
        inteiros.add(20);
        inteiros.add(5);

        System.out.println(inteiros);
        Collections.sort(inteiros);
        System.out.println(inteiros);

        System.out.println("--------------------------------");
        for(Doce doce : doces)
            System.out.println(doce.nome + " : " + doce.preco);
        Collections.sort(doces);
        System.out.println("+++++++++++++++++++++++++++++++++");
        for(Doce doce : doces)
            System.out.println(doce.nome + " : " + doce.preco);
    }
}