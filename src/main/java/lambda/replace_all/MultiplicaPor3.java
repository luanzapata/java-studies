package lambda.replace_all;

import java.util.ArrayList;
import java.util.List;

public class MultiplicaPor3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numeros.replaceAll(x -> x * 3);

        System.out.println(numeros);
    }
}
