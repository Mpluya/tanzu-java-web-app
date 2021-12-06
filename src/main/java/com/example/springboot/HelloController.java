package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String greeting = "Greetings from Spring Boot + Tanzu + Castle + Mae + TAP!!!";
		return greeting;
	}

}