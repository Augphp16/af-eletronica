package br.com.api.af_eletronica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "AF-Eletronica",
		version = "1.0",
		description = "API para gerenciamento de dados de uma assistência técnica de dispositivos eletrônicos.",
		contact = @Contact(name = "Augusto", email = "ferreiraaugusto62@gmail.com", url = "https://github.com/Augphp16")
	)
)

public class AfEletronicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfEletronicaApplication.class, args);
	}

}
