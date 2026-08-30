package com.devsuperior.dscommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DscommerceApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);





	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("login endpoint get/users/me retorna o usuario loggado");
		System.out.println("Endpoint de login funcionando e retornando o token de acesso");
		System.out.println("Endpoints privados de produto (POST/PUT/DELETE) funcionam somente para usuário ADMIN");
		System.out.println("Usuário que não é ADMIN não consegue acessar pedido que não é dele em GET /orders/{id}");
		System.out.println("Usuário que não é ADMIN não consegue acessar pedido que não é dele em GET /orders/{id}");





	}
}
