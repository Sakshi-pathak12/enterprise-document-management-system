package com.edms.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdmsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdmsBackendApplication.class, args);
		System.out.println("EDMS backend is running.");
	}

}
