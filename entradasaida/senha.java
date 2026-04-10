package atvspoo;
import java.util.Scanner;
public class senha {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" cadastre uma senha: ");
    String senha = scanner.nextLine();
     System.out.println("confirme a senha: ");
     String senha2 = scanner.nextLine();
     while ( !senha . equals(senha2)) {
        System.out.println("senha incorreta, tente novamente: ");
        senha2 = scanner.nextLine();
     }
        System.out.println("senha confirmada");
        
     
    }
}

