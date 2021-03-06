package com.crfinder.citiesstorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CitiesStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesStorageApplication.class, args);
	}
}
