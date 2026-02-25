package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int horas = 3; // 3 horas consumindo lanches
        int primeira_hora = 10;
        int segunda_hora = 4;
        int terceira_hora = 2;

        int soma = primeira_hora + segunda_hora + terceira_hora;
        double media = soma / horas;
        System.out.println("Total: "+ soma);
        System.out.println("Média: " + media);
    }
}