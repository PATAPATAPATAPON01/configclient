package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class ConfigclientApplication {
	@Value("${lvjian}")
	private String string;
	@PostConstruct
	public void init(){
		System.out.println("===================");
		System.out.println(string);
	}

	public static void main(String[] args) {
		System.setProperty("spring.cloud.bootstrap.enabled","false");
		ConfigurableApplicationContext context = SpringApplication.run(ConfigclientApplication.class, args);
		ConfigurableEnvironment environment = context.getEnvironment();

	}
}
