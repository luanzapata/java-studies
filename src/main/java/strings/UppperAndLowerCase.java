package strings;
import java.util.Scanner;

public class UppperAndLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        String maiusculas = texto.toUpperCase();
        String minusculas = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + maiusculas);
        System.out.println("Texto em minusculas: " + minusculas);

        scanner.close();
    }

}
