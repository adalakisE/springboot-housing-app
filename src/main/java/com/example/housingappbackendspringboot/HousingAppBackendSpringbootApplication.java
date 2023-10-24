package com.example.housingappbackendspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HousingAppBackendSpringbootApplication {

	public static void  main(String[] args) {
		SpringApplication.run(HousingAppBackendSpringbootApplication.class, args);}
		@GetMapping("/root")
		public String apiRoot() {
			return "hello world";
		}
}
