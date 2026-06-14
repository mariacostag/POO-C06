package org.example;

public class Cliente { // classe Cliente, acessível para qualquer outra classe
    //Atributos da classe (encapsulamento)
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    //Construtor recebe e armazena os dados após criar o objeto Cliente
    public Cliente(String nome, String cpf, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    //Getters permitem que outras classes acessem os dados privados
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    //Setters para permitir que outras classes alterem os valores dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Método para exibir os dados do cliente
    public void mostraInfo() {
        System.out.println("========== INFORMAÇÕES DO CLIENTE ==========");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " +telefone);
        System.out.println("Endereço: " + endereco);
    }
}
