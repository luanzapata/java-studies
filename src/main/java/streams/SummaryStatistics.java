package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatistics {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        IntSummaryStatistics numeroStatistics = numeros.stream()
                .mapToInt(Integer::intValue)
                        .summaryStatistics();


        System.out.println("Maior número da lista é: " +  numeroStatistics.getMax());

    }
}
