package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class TimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeApplication.class, args);
	}

}

@RestController
class HelloController {
	@RequestMapping("/time")
	public String sayHi() {
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  	  
		return formatter.format(date);
	}
}