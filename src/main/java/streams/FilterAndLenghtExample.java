package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndLenghtExample {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> funcionariosFormatado = funcionarios.stream()
                .filter(nome -> nome.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(funcionariosFormatado);

    }
}
