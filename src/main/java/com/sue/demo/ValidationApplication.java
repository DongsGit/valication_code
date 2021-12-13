package com.sue.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidationApplication.class, args);
	}

}
