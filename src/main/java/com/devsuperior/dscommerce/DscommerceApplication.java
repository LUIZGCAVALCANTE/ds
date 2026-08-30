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
		System.out.println("1 Endpoints públicos GET /produts e GET /products/{id} funcionam sem necessidade de login");
		System.out.println("2 Endpoint de login funcionando e retornando o token de acesso");
		System.out.println("3 Endpoints privados de produto (POST/PUT/DELETE) funcionam somente para usuário ADMIN");
		System.out.println("4 login endpoint get/users/me retorna o usuario loggado");
		System.out.println("5 Endpoints GET /orders/{id} e POST /orders funcionando");
		System.out.println("6 Usuário que não é ADMIN não consegue acessar pedido que não é dele em GET /orders/{id}");
		System.out.println("7 Rota all categories ok");
		System.out.println(" 8 Maria só acessa o que um usuario comum pode acessar ");








	}
}
