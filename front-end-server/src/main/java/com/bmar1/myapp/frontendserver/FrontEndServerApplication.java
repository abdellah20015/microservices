package com.bmar1.myapp.frontendserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FrontEndServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontEndServerApplication.class, args);
	}

}
