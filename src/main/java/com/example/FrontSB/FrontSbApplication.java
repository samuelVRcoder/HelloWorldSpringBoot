package com.example.FrontSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FrontSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontSbApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		
		return "<h1 style = 'text-align:center;color:cyan;'>Oi mundo</h1>";
		
	}

}
