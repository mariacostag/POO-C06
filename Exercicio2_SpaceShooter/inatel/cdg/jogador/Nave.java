package br.inatel.cdg.jogador;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    //Modo construtor
    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast) {
        System.out.println("Atirando no asteroide " + ast.getNome());

        if(this.tipoTiro == "Explosivo") {
            ast.destruir();
        }

        if(this.tipoTiro == "Normal" && ast.getTipoAsteroide() == "Pequeno") {
            ast.destruir();
        }
    }
}
