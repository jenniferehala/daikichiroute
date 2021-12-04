package com.codingdojo.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DaikichirouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichirouteApplication.class, args);
	}
	
	@RequestMapping("/daikichi")
	public String index() {
		return "Welcome";
	}
	
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow you will have good fortune!";
	}
}
	
