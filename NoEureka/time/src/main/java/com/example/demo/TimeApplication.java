package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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
	    
        InetAddress ip = null;
        String hostname = null;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }
        
	return indianFormat.format(date) + " << IP >> " + ip + " << Hostname >> " + hostname;

	}
}
