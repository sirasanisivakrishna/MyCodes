package com.hcl.gl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableDiscoveryClient
@SpringBootApplication
public class CapstoneConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneConsumerApplication.class, args);
		System.out.println("Its Consumer");
	}

}
