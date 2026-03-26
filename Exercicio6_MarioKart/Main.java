package org.example;

public class Main {
    public static void main(String[] args) {

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.piloto = p1; // kart 1 tem piloto 1
        k2.piloto = p2; // kart 2 tem piloto 2

    }
}