package br.com.joaoquaresma.numeros;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

//Pedir ao usuário 10 números inteiros e armazenar no array(numeros)
        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                System.out.println("Número " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    numeros[i] = scanner.nextInt();
                    break; // Caso o valor seja inteiro sai da estrutura while
                } else {
                    System.out.println("Entrada inválida! Digite um número inteiro: ");
                    scanner.next(); //Caso seja inválida(não inteiro) limpa a entrada e volta a pedir um número
                }

            }

        }

        System.out.println("\n Resultados: ");

        //Exibindo os números digitados
        br.com.joaoquaresma.numeros.NumerosUtilizados.exibirNum(numeros);

        //Buscar metodo para calcular e exibir a média
        double media = br.com.joaoquaresma.numeros.NumerosUtilizados.calcularMedia(numeros);
        System.out.printf("Média dos Números Digitados: %.2f%n", media);

        //Buscar metodo para exibir o maior número
        int maior = br.com.joaoquaresma.numeros.NumerosUtilizados.maiorNum(numeros);
        System.out.println("Maior Número Digitado: " + maior);

        //Buscar metodo para exibir o menor número
        int menor = br.com.joaoquaresma.numeros.NumerosUtilizados.menorNum(numeros);
        System.out.println("Menor Número Digitado: " + menor);

        scanner.close();
    }
}