package br.com.alura.serializacao_jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class SerializacaoJacksonApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		// Serialização
		Tarefa tarefa = new Tarefa("Assistir à aula 1", false, "João");

		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.writeValue(new File("tarefa.json"), tarefa);

		System.out.println("Dados salvos no arquivo tarefa.json");
		System.out.println(tarefa);

		// Desserialização
		Tarefa tarefaLida = objectMapper.readValue(
				new File("tarefa.json"),
				Tarefa.class
		);

		System.out.println("Tarefa lida do JSON:");
		System.out.println(tarefaLida);
	}


	public static void main(String[] args) {
		SpringApplication.run(SerializacaoJacksonApplication.class, args);
	}

}
