package atvspoo;
import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[10][4];
        double maior = 0, menor = 10;

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();

                if (notas[i][j] > maior) {
                    maior = notas[i][j];
                }

                if (notas[i][j] < menor) {
                    menor = notas[i][j];
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            double soma = 0;

            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }

            double media = soma / 4;
            System.out.println("Média do aluno " + (i + 1) + ": " + media);
        }

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
}
