package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas = 3; // 3 horas consumindo lanches

        System.out.println("Entre com os lanches da primeira hora:");
        int primeira_hora = teclado.nextInt();

        System.out.println("Entre com os lanches da segunda hora:");
        int segunda_hora = teclado.nextInt();

        System.out.println("Entre com os lanches da terceira hora:");
        int terceira_hora = teclado.nextInt();

        int soma = primeira_hora + segunda_hora + terceira_hora;
        double media = soma / horas;
        System.out.println("Total: "+ soma);
        System.out.println("Média: " + media);
    }
}
