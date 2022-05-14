package com.gastos.gastos22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gastos.gastos22.bo", "com.gastos.gastos22"})
@EnableMongoRepositories(basePackages = "com.gastos.gastos22.repository")
@EnableAutoConfiguration
@EntityScan(basePackages = "com.gastos.gastos22.models")
public class Gastos22Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Gastos22Application.class, args);
	}

}
