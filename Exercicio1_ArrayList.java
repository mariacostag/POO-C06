package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Double> listaDoubles = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 5; i++)
            listaDoubles.add(random.nextDouble() * 100);

        for(double elemento : listaDoubles) {
            System.out.println(elemento);
        }
    }

     
}