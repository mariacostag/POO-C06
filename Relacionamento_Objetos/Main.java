package org.example;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        //Guardam referência para o mesmo lugar de memória
        conta.titular = cliente;

        //Dados
        cliente.nome = "Flavio";
        cliente.cpf = "123.456.789-10";

        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("Nome do cliente: " + conta.titular.nome);
        System.out.println("CPF do cliente: " + cliente.cpf);
        System.out.println("CPF do cliente: " + conta.titular.cpf);
    }
}