package atvspoo;


import java.util.Arrays;
import java.util.Scanner;

public class VetoresOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[20];
        int[] C = new int[30];

        // leitura A
        System.out.println("Vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }

        // leitura B
        System.out.println("Vetor B:");
        for (int i = 0; i < 20; i++) {
            B[i] = sc.nextInt();
        }

        // juntar
        for (int i = 0; i < 10; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < 20; i++) {
            C[i + 10] = B[i];
        }

        // ordenar
        Arrays.sort(C);

        // mostrar
        System.out.println("Vetor C ordenado:");
        for (int i = 0; i < 30; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
