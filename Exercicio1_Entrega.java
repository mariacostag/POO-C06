package org.example;

import java.util.Scanner;

public class Main {

    //Conversão de , para .
    public static double converter(String texto) {
        if (texto == null) {
            return 0;
        }
        texto = texto.replace(",", ".");
        return Double.parseDouble(texto);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Entrar com a quantidade e valor de cada ingresso
        System.out.println("Entre com a quantidade de ingressos inteiros:");
        int qtd_int = entrada.nextInt();
        System.out.println("Entre com o valor de cada ingresso:");
        double valor_int = converter(entrada.next());

        System.out.println("Entre com a quantidade de meia-entrada:");
        int qtd_meia = entrada.nextInt();
        System.out.println("Entre com o valor de cada ingresso:");
        double valor_meia = converter(entrada.next());

        //Calcular o valor arrecadado
        double total_int = valor_int * qtd_int;
        System.out.println("Valor total de ingressos inteiros: " + total_int);

        double total_meia = valor_meia * qtd_meia;
        System.out.println("Valor total de meia-entrada " + total_meia);

        double total_sessao = total_int + total_meia;
        System.out.println("Valor arrecadado na sessão: " + total_sessao);

        //Calcular a média do valor pago por ingresso
        int qtd_total = qtd_int + qtd_meia;
        double media = total_sessao / qtd_total;
        System.out.printf("Valor médio de cada ingresso: %.2f", media);
    }
}