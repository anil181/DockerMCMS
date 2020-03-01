package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeApplication.class, args);
	}

}

@RestController
class HelloController {
	@RequestMapping("/time")
	public String sayHi() {
		
		DateFormat indianFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    indianFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
	    	    
	    Date date = new Date();  	  
		return indianFormat.format(date);
	}
}
