package com.example.consumingwebservices.consumingwebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class configurationClient {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.example.ws.calculator");
        return marshaller;
    }

    @Bean
    public calculatorClient calculator(Jaxb2Marshaller marshaller) {
        calculatorClient client = new calculatorClient();
        client.setDefaultUri("http://tempuri.org/");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}