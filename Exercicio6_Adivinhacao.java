package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        //Gere um número aleatório entre 1 a 10 e salve em x
        int x = rand.nextInt(10) + 1;
        System.out.println(x);

        //Confirmar com o usuário o número gerado
        System.out.println("Qual número foi gerado?");
        int numero = entrada.nextInt();


        //Indicar se está correto ou não
        if(numero == x)
            System.out.println("O número está correto");

        else
            System.out.println("O número está incorreto");
    }
}