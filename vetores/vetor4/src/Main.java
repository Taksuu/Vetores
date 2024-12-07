import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Insira 5 notas de alunos:");
        for (int i = 0; i < 5; i++) {
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 5.0;
        int acimaMedia = 0, abaixoMedia = 0, naMedia = 0;

        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            } else {
                naMedia++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Alunos acima da média: " + acimaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoMedia);
        System.out.println("Alunos na média: " + naMedia);
    }
}