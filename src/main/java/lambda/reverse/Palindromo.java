package lambda.reverse;

public class Palindromo {
    public static void main(String[] args) {
        Verificacao palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("radar"));
        System.out.println(palindromo.verificarPalindromo("java"));
    }
}
