package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@PostMapping(value="/api")
	public String HelloWorld() {
		System.out.println("Enter into controller");
		return "Hello World";
		
	}

	
}
