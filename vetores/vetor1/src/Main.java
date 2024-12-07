import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        
        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        
        double media = soma / 10.0;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}