package org.example;

public class Main {
    public static void main(String[] args) {
        int x [];
        int y[];
        int [] z; // duas boas práticas
        int []a;

        //Definir o tamanho de um array
        int []z = new int[10];// define o tamanho do vetor
        // Se não colocar o tamanho, da erro de compilação

        //Criar o array e já atribuir os elementos
        int []a = {2, 10, 55, 30};

        double [] versoesWindows = {1,0, 2,0, 3.1, 95, 98, 2000};

        // Não é possível acessar as memórias do array
        int [] vetor = new int[5];

        // Retorna a hash de uma String, utilizado em busca e ordenação
        System.out.println(vetor.toString().getBytes());
    }
}