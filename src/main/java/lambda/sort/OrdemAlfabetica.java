package lambda.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdemAlfabetica {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Avião", "Cachorro", "Montanha", "Garrafa", "Brinquedo"));
        lista.sort((a, b) -> a.compareTo(b));
        System.out.println(lista);
    }
}
