import java.util.Scanner;

public class vetor5Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        // leitura
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        // mostrar
        System.out.println("Números digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}