package atvspoo;

import java.util.Scanner;

public class MediaMaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        int soma = 0;
        int maior, menor;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        maior = menor = numeros[0];

        for (int i = 0; i < 5; i++) {
            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double media = soma / 5.0;

        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}