import java.util.Scanner;
public class doisnumerosquatriopera{
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("me de um nmero: ");
    int numero1 = scanner.nextInt();
    System.out.print("me de outro nmero: ");
    int numero2 = scanner.nextInt();
    System.out.print("me de mais um nmero: ");
    int numero3 = scanner.nextInt();
    System.out.print("me de o ltimo nmero: ");
    int numero4 = scanner.nextInt();
    int soma = numero1 + numero2 + numero3 + numero4;
    int multi= numero1 * numero2 * numero3 * numero4;
    int divi = numero1 / numero2 / numero3 / numero4;
    int sub = numero1 - numero2 - numero3 - numero4;
    System.out.println("a soma dos nmeros que voc digitou" + soma);
    System.out.println(", a multiplicao dos nmeros que voc digitou  " + multi);
    System.out.println(", a divisao dos nmeros que voc digitou  " + divi);
    System.out.println(", a subtrao dos nmeros que voc digitou  " + sub);
    }
}