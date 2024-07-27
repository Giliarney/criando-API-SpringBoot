package com.desafio_dio.padroes_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "API Consulta de CEP's", version = "1.0", description = "API Criada para resolver o desafio DIO, criando API com SpringBoot"))
public class PadroesProjetoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PadroesProjetoSpringApplication.class, args);
    }
}
