package com.vw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

	public static void main(String[] args) {
		
		//Added comments
		SpringApplication.run(EurekaServiceApplication.class, args);
		//Adding sysOut
		System.out.println("hello");
	}

}
