package com.ezequiel_creador.posts_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "com.ezequiel_creador.posts_service.repository")
@OpenAPIDefinition(
		info = @Info(title = "Post Service API", version = "1.0", description = "API para la gestión de posts"),
		servers = {
				@Server(url = "http://localhost:8084", description = "Servidor local para Posts"),
				@Server(url = "http://posts-service", description = "Servidor balanceado para Posts (Eureka)")
		}
)

public class PostsServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PostsServiceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// Imprimir las variables de entorno
		System.out.println("DB_USER: " + System.getenv("DB_USER"));
		System.out.println("DB_PASS: " + System.getenv("DB_PASS"));
	}
}
