import java.util.Scanner;
public class doisnumbermais{
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("me de um nmero: ");
    int numero1 = scanner.nextInt();
    System.out.print("me de outro nmero: ");
    int numero2 = scanner.nextInt();
    int soma = numero1 + numero2;
    System.out.print("a soma dos nmeros que voc digitou  " + soma);
    }
}