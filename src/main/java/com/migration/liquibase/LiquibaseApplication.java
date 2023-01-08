package com.migration.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LiquibaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseApplication.class, args);
	}

}
