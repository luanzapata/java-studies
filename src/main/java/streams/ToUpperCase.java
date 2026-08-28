package streams;

import java.util.Arrays;
import java.util.List;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(palavra -> palavra.toUpperCase())
                .forEach(System.out::println);
    }
}
