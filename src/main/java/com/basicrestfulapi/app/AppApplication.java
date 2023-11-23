package com.basicrestfulapi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		/*
		* Controller memanggil Service
		* Service memanggil Repository
		* Repository memanggil Entity
		* */
	}
}
