package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Paçoca", 3));

        Cachorro cachorro = new Cachorro("Tufão", 5);
        animais.add(cachorro);

        animais.add(new Gato("Mingau", 2));
        animais.add(new Gato("Kira", 3));

        animais.add(new Galinha("Cocota", 2));
        animais.add(new Galinha("Chico", 3));

        for (Animal animal : animais) {
            System.out.println(animal.nome + " : " + animal.idade);
        }

        Collections.sort(animais);
        System.out.println("-------------------------");
        for (Animal animal : animais) {
            System.out.println(animal.nome + " : " + animal.idade);
        }

        System.out.println("Animal mais velho: " + Collections.max(animais).idade);
        System.out.println("Animal mais novo: " + Collections.min(animais).idade);
    }
}