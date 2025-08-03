package br.com.joaoquaresma.numeros;

public class NumerosUtilizados {

    //Metodo para exibir os números digitados pelo usuário, números do array.
    public static void exibirNum(int[] numeros){

        System.out.print("Números digitados: ");
        for(int num: numeros){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    //Metodo para calcular a média.
    public static double calcularMedia(int[] numeros){

        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        return(double) soma/numeros.length;
    }

    //Metodo para percorrer o array e retornar o maior número
    public static int maiorNum(int[] numeros){

        int maior = 0;
        for(int num: numeros){
            if(num > maior){
                maior = num;
            }
        }
        return maior;
    }

    //Metodo para percorrer o array e retornar o menor número
    public static int menorNum(int[] numeros){

        int menor = numeros[0];
        for(int num: numeros){
            if(num < menor){
                menor = num;
            }
        }
        return menor;
    }
}