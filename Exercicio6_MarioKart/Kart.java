package org.example;

public class Kart {
    public String nome;
    public Piloto piloto;

    public Kart (){
        Motor motor = new Motor(); // kart possui motor

        motor.cilindradas = "50";
        motor.velocidadeMaxima = 150;

        motor.mostraInfo();
    }

    public void pular()
    {
        System.out.println("Kart pulou");
    }

    public void soltarTurbo()
    {
        System.out.println("Kart soltou turbo");
    }

    public void fazerDrift()
    {
        System.out.println("Kart fez drift");
    }
}
