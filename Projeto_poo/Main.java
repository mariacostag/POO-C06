package org.example;

import java.util.Scanner; // permite entrar com as informações do cliente
import java.util.ArrayList; // criação da ArrayList para armazenar os clientes

public class Main {
    //Teclado estático compartihlado por todos os métodos da classe
    static Scanner teclado = new Scanner(System.in);

    //Guarda todos os clientes cadastrados durante a execução
    static ArrayList<TipoCliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Seja bem-vindo! Vamos registrar uma compra!");
        registrarCompra(); // método que gerencia o fluxo de registro de compra
    }

    static void registrarCompra() {
        System.out.println("========== REGISTRO DE COMPRA ==========");
        System.out.println("1 - Cliente novo");
        System.out.println("2 - Cliente já cadastrado");
        System.out.println("Escolha: ");
        int tipo = teclado.nextInt();
        teclado.nextLine(); // limpa o buffer após a entrada do inteiro

        TipoCliente cliente = null; // vai receber o cliente

        if(tipo == 1) { // cliene novo
            cliente = cadastrarNovoCliente(); // coleta os dados e cria o objeto
            clientes.add(cliente); // adiciona o cliente na lista
            System.out.println("Cliente cadastrado com sucesso!");
        }
        else { // cliente já cadastrado
            cliente = buscarCliente(); // busca a lista conforme o CPF

            if(cliente == null) { // caso não tenha encontrado o cliente
                System.out.println("Cliente não encontrado");
                System.out.println("Deseja cadastrá-lo agora? (1 - Sim /  2 - Não): ");
                int resposta = teclado.nextInt();

                if(resposta == 1) { // se quiser cadastrar
                    cliente = cadastrarNovoCliente();
                    clientes.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                }
                else { // se não quiser cadastrar
                    System.out.println("Compra não registrada");
                }
            }
        }
        cliente.registrarCompra(); // registra a compra e atualiza o nível do cliente
        System.out.println("Compra registrada com sucesso!");
        cliente.mostraInfo(); // exibe as informações do cliente
    }
    static TipoCliente cadastrarNovoCliente() {
        System.out.println("========== CADASTRO DE CLIENTE ==========");

        System.out.println("Digite o nome do cliente: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o CPF do cliente: ");
        String cpf = teclado.nextLine();

        System.out.println("Digite o telefone do cliente: ");
        String telefone = teclado.nextLine();

        System.out.println("Digite o email do cliente: ");
        String email = teclado.nextLine();

        System.out.println("Digite o endereço do cliente: ");
        String endereco = teclado.nextLine();

        //Cria e retorna o objeto com os dados coletados
        return new TipoCliente(nome, cpf, telefone, email, endereco);
    }

    static TipoCliente buscarCliente() {
        System.out.println("Digite o CPF do cliente: ");
        String busca = teclado.nextLine();

        //Percorre todos os clientes da lista (for:each)
        for(TipoCliente c: clientes) {
            if(c.getCpf().equals(busca)) { // .equals por conta de ser string
                System.out.println("Cliente encontrado: " + c.getNome());
                return c; // retorna o cliente quando encontrar
            }
        }
        return null; // se percorreu mas não encontrou
    }
}