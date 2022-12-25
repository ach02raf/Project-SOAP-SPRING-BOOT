package com.example.consumingwebservices.consumingwebservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ws.calculator.*;

@SpringBootApplication
public class ConsumingwebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingwebservicesApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(calculatorClient client) {
		return args -> {

			AddResponse Response = client.getAddResult(5, 8);
			MultiplyResponse Response2 = client.getMultiplyResult(5, 5);
			int information2 = Response2.getMultiplyResult();
			int information = Response.getAddResult();
			System.err.println("resultat add : " + information + " ,resultat Multiply : " + information2);

		};
	}
}
