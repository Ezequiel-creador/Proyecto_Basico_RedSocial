package com.ezequiel_creador.users_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@OpenAPIDefinition(
		info = @Info(title = "User Service API", version = "1.0", description = "API para la gestión de usuarios"),
		servers = {
				@Server(url = "http://localhost:8083", description = "Servidor local para Users"),
				@Server(url = "http://users-services", description = "Servidor balanceado para Users (Eureka)")
		}
)
public class UsersServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UsersServiceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// Imprimir las variables de entorno
		System.out.println("DB_USER: " + System.getenv("DB_USER"));
		System.out.println("DB_PASS: " + System.getenv("DB_PASS"));
	}
}
