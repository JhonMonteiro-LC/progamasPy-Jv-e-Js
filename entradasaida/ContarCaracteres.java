package atvspoo;
public class ContarCaracteres {

    public static int contar(String frase) {
        return frase.length();
    }

    public static void main(String[] args) {
        String texto = "Oi Jhon!";
        int total = contar(texto);

        System.out.println("Quantidade de caracteres: " + total);
    }
}
