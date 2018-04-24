package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("master");
		System.out.println("dev");
		System.out.println("feature");
		System.out.println("hot fix");
		System.out.println("dev1");
		SpringApplication.run(DemoApplication.class, args);
	}
}
