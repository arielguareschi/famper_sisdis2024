package br.edu.famper.nobank;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class NobankApplication {

	public static void main(String[] args) {
		SpringApplication.run(NobankApplication.class, args);
	}

}
