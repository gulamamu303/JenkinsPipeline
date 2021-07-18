package com.springboot.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsPipelineApplication {

	@RestController  
	public class HelloWorldController   
	{  
	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello Jenkins Pipeline";  
	}  
	}  
	public static void main(String[] args) {
		System.out.println("GUlam! How are you");
		SpringApplication.run(JenkinsPipelineApplication.class, args);
	}

}
