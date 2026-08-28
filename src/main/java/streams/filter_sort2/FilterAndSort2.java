package streams.filter_sort2;

import java.util.*;
import java.util.stream.Collectors;

public class FilterAndSort2 {
        static void main(String[] args) {
            List<Produto> produtos = Arrays.asList(
                    new Produto("Smartphone", 800.0, "Eletrônicos"),
                    new Produto("Notebook", 1500.0, "Eletrônicos"),
                    new Produto("Teclado", 200.0, "Eletrônicos"),
                    new Produto("Cadeira", 300.0, "Móveis"),
                    new Produto("Monitor", 900.0, "Eletrônicos"),
                    new Produto("Mesa", 700.0, "Móveis")
            );
//            List<Produto> produtosFiltrados = produtos.stream()
//                    .filter(prod -> prod.getCategoria()=="Eletrônicos")
//                    .filter(prod -> prod.getPreco() < 1000)
//                    .sorted(Comparator.comparing(Produto::getPreco))
//                    .collect(Collectors.toList());
//
//            System.out.println("Produtos filtrados: " + produtosFiltrados);
//
//            List<Produto> eletronicosPromo = produtosFiltrados.stream()
//                    .limit(3)
//                    .collect(Collectors.toList());
//
//            System.out.println("Top 3 eletrônicos mais baratos: " + eletronicosPromo);
//
            Map<String, List<Produto>> produtosCategoria = produtos.stream()
                    .collect(Collectors.groupingBy(Produto::getCategoria));

            produtosCategoria.forEach((nomeCategoria, nomeProdutos) ->
                    System.out.println(nomeCategoria + ": " + nomeProdutos));
//
//            Map<String, Long> quantidadePorCategoria = produtos.stream()
//                    .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
//
//            System.out.println("Quantidade de produtos: " + quantidadePorCategoria);
//
//            Map<String, Optional<Produto>> produtosMaisCaros = produtos.stream()
//                    .collect(Collectors.groupingBy(
//                            Produto::getCategoria,
//                            Collectors.maxBy(
//                                    Comparator.comparingDouble(Produto::getPreco)
//                            )
//                    ));
//            System.out.println(produtosMaisCaros);

            Map<String, Double> precosCategoria = produtos.stream()
                    .collect(Collectors.groupingBy(
                            Produto::getCategoria,
                                    Collectors.summingDouble(Produto::getPreco)));


            System.out.println(precosCategoria);



        }
    }
