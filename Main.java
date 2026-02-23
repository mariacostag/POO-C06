package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var valor_inteira = 30;
        var valor_meia = 15;

        var total_inteiros = 8 * 30;
        System.out.println("Total arrecadado com ingressos inteiros: " + total_inteiros);

        var total_meias = 5 * 15;
        System.out.println("Total arrecadado com meia-entrada: " + total_meias);

        var total_valor = total_inteiros + total_meias;
        System.out.println("Total arrecadado na sessão: " + total_valor);

        var ingressos_quant = 8 + 5;
        var media_ingresso = total_valor / ingressos_quant;
        System.out.println("Valor médio pago por ingresso: " + media_ingresso);
    }
}