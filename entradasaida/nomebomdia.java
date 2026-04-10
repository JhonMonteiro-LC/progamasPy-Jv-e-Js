

import java.util.Scanner;
public class nomebomdia {
    public static void main (String[] args){
String nome;
Scanner scanner = new Scanner (System.in);
System.out.print(" me de seu nome, idade e a hora do atendimento: ");

nome = scanner.nextLine();
int idade = scanner.nextInt();
Double hora1   = scanner.nextDouble();

    if ( hora1>=6.59 && hora1 < 12.59) 
        System.out.println("bom dia ");
    } else if (12.59 <= hora1 && hora1 < 18.59){
        System.out.println("boa tarde ");
    } else if (18.59 <= hora1 && hora1 < 24.59) {
            System.out.println("boa noite");

     if (idade < 18) {
            System.out.println (" " + nome + " voce é menor de idade, não pode entrar");
     } else if (idade >= 18 ) {
         System.out.println (" " + nome + " voce é maior de idade, pode entrar");
     }
    }

