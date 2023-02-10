package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, valorKw;
        double ValorApagar, ValorComDesconto;
        int qtdKw;
        System.out.println("Informe o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();

        System.out.println("Digite a quantidade de KW consumido:");
        qtdKw = entrada.nextInt();

        // Processamento
        valorKw = salarioMinimo / 500;
        ValorApagar = qtdKw * valorKw;
        ValorComDesconto = ValorApagar * 0.85;

        // Saída
        System.out.println("Um Kw custa: + valorKw");
        System.out.println("o valor a ser pago é: " + ValorApagar);
        System.out.println("o valor a ser pago é: " + ValorComDesconto);

        entrada.close();

    }
}
