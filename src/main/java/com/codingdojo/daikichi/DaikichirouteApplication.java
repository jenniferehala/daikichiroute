package com.codingdojo.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/daikichi/today", method=RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow you will have good fortune!";
	}
	
	@RequestMapping("/daikichi/travel/{city}")
    public String travel(@PathVariable("city") String city) {
    	return "Congratulations, you will soon travel to " + city + "!";
    	
	}
	
	@RequestMapping("/daikichi/lotto/{number}")
    public String lotto(@PathVariable("number") String number) {
		int test = Integer.parseInt(number);
    		if(test % 2 == 0) {
    		return "'You will take a grand journey in the near future, but be weary of tempting offers";
    		}
    	return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";	
    	
	}
	
}
	
