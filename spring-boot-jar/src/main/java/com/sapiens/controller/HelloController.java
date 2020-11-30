package com.sapiens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private Environment env;

	@GetMapping("/helloDocker")
	public String sayHello() {
		String developer = env.getProperty("app_dev");
		if (!StringUtils.hasText(developer)) {
			developer = "Default Dev";
		}
		return "Hello, Docker. This is developed by " + developer;
	}
}
