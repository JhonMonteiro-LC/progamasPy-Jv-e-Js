package atvspoo;
public  {
    import java.util.Scanner;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado;

        System.out.println("Digite o primeiro número positivo: ");
         int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número positivo: ");
         int numero2 = entrada.nextInt();

        int resultado = numero1 * numero1;
        System.out.println("O primeiro número elevado ao quadrado é: " + resultado);

    }
}

