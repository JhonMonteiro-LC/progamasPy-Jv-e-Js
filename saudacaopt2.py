import java.util.Scanner;
public class saudacao{
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
Double hora1 = scanner.nextDouble();
   
    if ( hora1>=6 && hora1 < 12) {
        System.out.println("bom dia delicia");
    } else if (12 <= hora1 && hora1 < 18) {
        System.out.println("boa tarde bbzaochapaquente");
    } else if (18 <= hora1 && hora1 < 24) {
        System.out.println("vai dormir seu putooooooooooooooooo");
    } else if (0 <= hora1 && hora1 < 6) {
        System.out.println("boa madrugade goxxxxxxxxxxxxxxtoso");
    
    }
}
}