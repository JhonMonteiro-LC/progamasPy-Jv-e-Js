import java.util.Scanner;

public class extenso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 1000: ");
        int n = sc.nextInt();

        if (n < 1 || n > 1000) {
            System.out.println("Número inválido");
            return;
        }

        if (n == 1000) {
            System.out.println("mil");
            return;
        }

        String resultado = "";

        int c = n / 100;
        int d = (n % 100) / 10;
        int u = n % 10;
        int resto = n % 100;

        switch (c) {
            case 1:
                if (n == 100) {
                    resultado += "cem";
                } else {
                    resultado += "cento";
                }
                break;
            case 2: resultado += "duzentos"; break;
            case 3: resultado += "trezentos"; break;
            case 4: resultado += "quatrocentos"; break;
            case 5: resultado += "quinhentos"; break;
            case 6: resultado += "seiscentos"; break;
            case 7: resultado += "setecentos"; break;
            case 8: resultado += "oitocentos"; break;
            case 9: resultado += "novecentos"; break;
        }

        if (c != 0 && resto != 0) {
            resultado += " e ";
        }

        // 10 até 19
        if (resto >= 10 && resto <= 19) {
            switch (resto) {
                case 10: resultado += "dez"; break;
                case 11: resultado += "onze"; break;
                case 12: resultado += "doze"; break;
                case 13: resultado += "treze"; break;
                case 14: resultado += "quatorze"; break;
                case 15: resultado += "quinze"; break;
                case 16: resultado += "dezesseis"; break;
                case 17: resultado += "dezessete"; break;
                case 18: resultado += "dezoito"; break;
                case 19: resultado += "dezenove"; break;
            }
        } else {

            // DEZENAS
            switch (d) {
                case 2: resultado += "vinte"; break;
                case 3: resultado += "trinta"; break;
                case 4: resultado += "quarenta"; break;
                case 5: resultado += "cinquenta"; break;
                case 6: resultado += "sessenta"; break;
                case 7: resultado += "setenta"; break;
                case 8: resultado += "oitenta"; break;
                case 9: resultado += "noventa"; break;
            }

            if (d != 0 && u != 0) {
                resultado += " e ";
            }

            // UNIDADES
            switch (u) {
                case 1: resultado += "um"; break;
                case 2: resultado += "dois"; break;
                case 3: resultado += "três"; break;
                case 4: resultado += "quatro"; break;
                case 5: resultado += "cinco"; break;
                case 6: resultado += "seis"; break;
                case 7: resultado += "sete"; break;
                case 8: resultado += "oito"; break;
                case 9: resultado += "nove"; break;
            }
        }

        System.out.println(resultado);
        sc.close();
    }
}

