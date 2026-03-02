import java.util.Scanner;
public class maiordois{
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
 
    System.out.print("me de um nmero: ");
    double numero1 = scanner.nextDouble();
    System.out.print("me de outro nmero: ");
    double numero2 = scanner.nextDouble();
    if (numero1 > numero2) {
        System.out.println("o maior nmero que voc digitou foi " + numero1);
    } else {
        System.out.println("o maior nmero que voc digitou foi " + numero2);
    }
}
}