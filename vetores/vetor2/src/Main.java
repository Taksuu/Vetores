import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Insira 10 nomes:");
        for (int i = 0; i < 10; i++) {
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Digite um nome para buscar:");
        String nomeBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                System.out.println("Nome encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nome não encontrado.");
        }
    }
}