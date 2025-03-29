package com.jsbcrud.www;

import com.jsbcrud.www.model.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Config.class) // Adicione esta linha
public class JavaSpringBootCrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootCrudApplication.class, args);
	}
}