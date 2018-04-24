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
		System.out.println("hot fix1");
		System.out.println("hot fix2");
		SpringApplication.run(DemoApplication.class, args);
	}
}
