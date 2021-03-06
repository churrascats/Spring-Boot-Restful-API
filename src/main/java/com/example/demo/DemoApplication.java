package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication /* This annotation is responsible for main configuration of Spring boot project*/

public class DemoApplication {

	public static void main(String[] args) { //This class is application's entry point.
		SpringApplication.run(DemoApplication.class, args);
	}
}
