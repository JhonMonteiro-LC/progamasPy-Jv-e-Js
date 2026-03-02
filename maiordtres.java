import java.util.Scanner;
public class maiordtres{
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
 
    System.out.print("me de um nmero: ");
    double numero1 = scanner.nextDouble();
    System.out.print("me de outro nmero: ");
    double numero2 = scanner.nextDouble();
    System.out.print("me de mais um nmero: ");
    double numero3 = scanner.nextDouble();
    if (numero1 > numero2 && numero1 > numero3) {
        System.out.println("o maior nmero que voc digitou foi " + numero1);
    } else if (numero2 > numero3) {
        System.out.println("o maior nmero que voc digitou foi " + numero2);
    } else {
        System.out.println("o maior nmero que voc digitou foi " + numero3);

    }
if (numero1 < numero2 && numero1 < numero3) {
        System.out.println("o menor nmero que voc digitou foi " + numero1);
    } else if (numero2 <numero3) {
        System.out.println("o menor nmero que voc digitou foi " + numero2);
    } else {
        System.out.println("o menor nmero que voc digitou foi " + numero3);
        

}
}
}