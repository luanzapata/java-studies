package com.example.generics_avaliacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GenericsAvaliacaoApplication implements CommandLineRunner {

	Avaliacao<String> avaliacao1 = new Avaliacao<>("Prova Matemática", 8.9, "Muito bom!");
	Avaliacao<String> avaliacao2 = new Avaliacao<>("Prova Geografia", 7.5, "Bom!");

	public static void main(String[] args) {
		SpringApplication.run(GenericsAvaliacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(avaliacao1);
		System.out.println(avaliacao2);

		List<Avaliacao<String>> avaliacoes = List.of(avaliacao1, avaliacao2);
		double media = Avaliacao.calcularMediaNotas(avaliacoes);

		System.out.println("Média das notas: " + media);
	}
}