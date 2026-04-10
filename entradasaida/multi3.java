package atvspoo;
import java.util.Scanner;
public class multi3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Digite dois em ordem crescente números: ");
    int numero1 = scanner.nextInt();
    int numero2 = scanner.nextInt();
    for ( int i = numero1; i <= numero2; i++) {
        if (i % 3 == 0) {
            System.out.println( "os números múltiplos de 3 são: " + i);
        }
    }
}
}    