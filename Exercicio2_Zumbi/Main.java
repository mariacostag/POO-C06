package org.example;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        var zumbi2 = new Zumbi();

        zumbi.resmungar();
        zumbi.atacar();

        zumbi.vida = 9;
        zumbi2.vida = 12;

        double vidaZumbi = zumbi.mostraVida();
        System.out.println("Vida do Zumbi: " + vidaZumbi);

        double vidaZumbi2 = zumbi2.mostraVida();
        System.out.println("Vida do Zumbi2: " + vidaZumbi2);

        System.out.println("----------------");
        zumbi.transfereVida(zumbi2,5);

        System.out.println("Vida do Zumbi: " + zumbi.mostraVida());
        System.out.println("Vida do Zumbi2: " + zumbi2.mostraVida());
    }
}