package strings;

import java.util.Scanner;

public class StringFormatExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = scanner.nextDouble();
        scanner.close();

        String valorFormatado = String.format("%.2f", valor);
        System.out.println("Valor formatado: "  + valorFormatado);
    }
}
