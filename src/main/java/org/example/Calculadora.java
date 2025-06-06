package org.example;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;

        System.out.println("Digite o valor um: ");
        valorUm = scanner.nextDouble();

        System.out.println("Digite a operação (+, -, /, *): ");
        operacao = scanner.next();

        System.out.println("Digite o valor dois: ");
        valorDois = scanner.nextDouble();

        Double resultado = realizarCalculo(valorUm, valorDois, operacao);

        if (resultado != null) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        switch (operacao) {
            case "+":
                return valorUm + valorDois;
            case "-":
                return valorUm - valorDois;
            case "*":
                return valorUm * valorDois;
            case "/":
                if (valorDois == 0) {
                    System.out.println("Erro: Divisão por zero!");
                    return null;
                }
                return valorUm / valorDois;
            default:
                System.out.println("A operação é inválida =(");
                return null;
        }
    }
}
