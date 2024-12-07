import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int contPares = 0;
        int contImpares = 0;

        System.out.println("Insira 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contPares);
        System.out.println("Quantidade de números ímpares: " + contImpares);
    }
}