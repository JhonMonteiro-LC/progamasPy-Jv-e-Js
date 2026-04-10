import java.util.Scanner;
public class saudacaopt2{
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("me de a hora: ");
Double hora1 = scanner.nextDouble();
   
    if ( hora1>=6.59 && hora1 < 12.59) {
        System.out.println("bom dia ");
    } else if (12.59 <= hora1 && hora1 < 18.59){
        System.out.println("boa tarde ");
    } else if (18.59 <= hora1 && hora1 < 24.59) {
        System.out.println("boa noite");
    } else if (0.59 <= hora1 && hora1 < 6.59)  {
        
        System.out.println("boa madrugade goxxxxxxxxxxxxxxtoso");
    
    }
}
}