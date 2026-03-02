package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int np3 = 0;
        double nfa;

        //Entrada da nota NPA
        System.out.println("Entre com a nota NPA:");
        int npa = teclado.nextInt();

        // Verificação sobre estar ou não aprovado
        if(npa >= 60)
            System.out.println("O aluno está aprovado e NFA = NPA");

        else if(npa < 30)
            System.out.println("O aluno está reprovado e NFA = NPA");

        else
        {
            System.out.println("O aluno deve fazer a NP3");

            //Informar a nota da NP3
            System.out.println("Entre com a nota NP3");
            np3 = teclado.nextInt();

            nfa= (npa + np3) / 2;

            // Verificar se o aluno for aprovado ou não
            if(nfa >= 50)
                System.out.println("O aluno está aprovado");

            else
                System.out.println("O aluno está reprovado");
        }
    }
}