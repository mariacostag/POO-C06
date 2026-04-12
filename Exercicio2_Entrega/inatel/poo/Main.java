package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {

        // Instancia a turma
        Turma turma = new Turma();

        // Cria 3 alunos com notas diferentes
        Aluno aluno1 = new Aluno("Maria",    "2026001", new double[]{8.5, 9.0, 7.5});
        Aluno aluno2 = new Aluno("Ana",  "2026002", new double[]{6.0, 7.0, 6.5});
        Aluno aluno3 = new Aluno("João", "2026003", new double[]{9.5, 10.0, 9.0});

        // Adiciona os alunos à turma
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        // Lista todos os alunos
        turma.listarAlunos();

        // Exibe o melhor aluno
        Aluno melhor = turma.buscarMelhorAluno();
        System.out.println("===== Melhor Aluno =====");
        System.out.println("Nome: " + melhor.getNome());
        System.out.printf("Média: %.2f%n", melhor.calculaMedia());
    }
}