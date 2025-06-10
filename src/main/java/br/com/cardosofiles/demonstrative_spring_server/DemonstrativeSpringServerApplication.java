package br.com.cardosofiles.demonstrative_spring_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.cardosofiles")
public class DemonstrativeSpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonstrativeSpringServerApplication.class, args);
	}

}
