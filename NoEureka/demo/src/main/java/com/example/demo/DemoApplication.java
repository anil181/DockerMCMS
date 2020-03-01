package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
		
	}
}

@RestController
class HelloController {
//	@Value("${restUrl}")

//	private String restUrl;
	private RestTemplate restTemplate;
	
	@RequestMapping("/india")
	public String sayHi() {
		String url = System.getenv("TIME_SERVICE_URL");
		System.out.println("The URL is url " + url);
		String timenow = restTemplate.getForObject(url, String.class);
		return "Namaste !! " + timenow;
	}
}
