package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Set<String> palavrasSemRepeticao = palavras.stream()
                .collect(Collectors.toSet());
        palavrasSemRepeticao.forEach(System.out::println);
    }
}
