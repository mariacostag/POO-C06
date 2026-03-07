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

        int numero;

        do
        {
            //Confirmar com o usuário o número gerado
            System.out.println("Qual número foi gerado?");
            numero = entrada.nextInt();

            //Indicar se é maior ou menor
            if(numero > x)
                System.out.println("O número digitado é maior do que o gerado");

            else if (numero < x)
                System.out.println("O número digitado é menor do que o gerado");

            else
                System.out.println("O número digitado é igual ao gerado");
        }while(numero != x);
    }
}