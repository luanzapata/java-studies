package strings;

import java.util.Scanner;

public class ReplaceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.println("Digite a palavra a ser substituída: ");
        String palavraAntiga = scanner.nextLine();

        if (!texto.contains(palavraAntiga)) {
            System.out.println("Palavra não encontrada.");
            scanner.close();
            return;
        }
        System.out.println("Digite a nova palavra: ");
        String palavraNova = scanner.nextLine();

        String textoModificado = texto.replace(palavraAntiga, palavraNova);
        System.out.println("Texto modificado: " + textoModificado);

        scanner.close();

    }
}
