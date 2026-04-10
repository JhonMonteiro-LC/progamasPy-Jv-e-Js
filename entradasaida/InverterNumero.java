package atvspoo;
public class InverterNumero {

    public static int inverter(int numero) {
        int inverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero = numero / 10;
        }

        return inverso;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Inverso: " + inverter(num));
    }
}
