package br.inatel.poo.turmas;

public class Turma {
    private int quantidadeAlunos;
    private Aluno[] alunos;

    public Turma() {
        this.quantidadeAlunos = 0;
        this.alunos = new Aluno[100]; // capacidade máxima
    }

    public void adicionarAluno(Aluno aluno) {
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    public void listarAlunos() {
        System.out.println("===== Lista de Alunos =====");
        for (int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostraInfo();
        }
    }

    public Aluno buscarMelhorAluno() {
        Aluno melhor = alunos[0];
        for (int i = 1; i < quantidadeAlunos; i++) {
            if (alunos[i].calculaMedia() > melhor.calculaMedia()) {
                melhor = alunos[i];
            }
        }
        return melhor;
    }
}
