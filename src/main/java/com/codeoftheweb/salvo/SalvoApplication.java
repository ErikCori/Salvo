package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SalvoApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(PlayerRepository repository){
		return (args) -> {
			//save  a couple of players
			repository.save(new Player("Jack"));
			repository.save(new Player("Juan"));
			repository.save(new Player("Matias"));
			repository.save(new Player("Micaela"));
			repository.save(new Player("Erik"));
		};
	}

}
