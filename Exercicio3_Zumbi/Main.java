package org.example;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi.resmungar();
        zumbi.atacar();

        zumbi.vida = 9;
        zumbi2.vida = 12;

        double vidaZumbi = zumbi.mostrarVida();
        System.out.println("Vida do Zumbi: " + vidaZumbi);

        double vidaZumbi2 = zumbi2.mostrarVida();
        System.out.println("Vida do Zumbi2: " + vidaZumbi2);

        System.out.println("--------------------");
        zumbi = zumbi2;
        zumbi.transfereVida(zumbi2, 5);
        zumbi2.transfereVida(zumbi, 3);

        System.out.println("Vida do Zumbi: " + zumbi.mostrarVida());
        System.out.println("Vida do Zumbi2: " + zumbi2.mostrarVida());
    }
}