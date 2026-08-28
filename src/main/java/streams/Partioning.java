package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partioning {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> numerosDividos = lista.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Pares: " + numerosDividos.get(true));
        System.out.println("Ímpares: " + numerosDividos.get(false));
    }
}
