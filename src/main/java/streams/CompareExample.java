package streams;

import java.util.List;

public class CompareExample {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somasNota = notas.stream()
                .reduce(0.0D, Double::sum);

        double media = somasNota / notas.size();

        double maiorNota = notas.stream()
                .max(Double::compareTo).get();

        double menorNota = notas.stream()
                .min(Double::compareTo).get();

        System.out.println("A média das notas é: " + media);
        System.out.println("A maior nota foi: " +  maiorNota);
        System.out.println("A menor nota foi: " +  menorNota);

    }
}
