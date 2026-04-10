package atvspoo;

import java.util.Scanner;


public class calcula { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
    
            for(int i = 1; i <= 10; i++) {
            double resultado = (numero * i);
            System.out.println(numero + " x " + i + " = " + resultado);
            System.out.println (numero + " + " + i + " = " + (numero + i));
            System.out.println (numero + " - " + i + " = " + (numero - i));
            System.out.println (numero + " / " + i + " = " + (numero / i));
        }
    }
}


        



