package com.sapiens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/helloDocker")
	public String sayHello() {
		return "Hello, Docker";
	}
}
