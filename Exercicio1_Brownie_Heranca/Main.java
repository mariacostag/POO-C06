package org.example;

public class Main {
    public static void main(String[] args) {
        BrownieNutella bwNutella = new BrownieNutella("Nutella",10, "Nutella");
        BrownieCafe bwCafe = new BrownieCafe("Cafe",11, "Cafe");

        bwNutella.addCarrinhoDeCompras();
        bwCafe.addCarrinhoDeCompras();
        bwCafe.adicionaCafe();
    }
}