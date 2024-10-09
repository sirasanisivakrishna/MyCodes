package com.hcl.gl.cart;

import org.apache.tomcat.jni.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.hcl.gl.cart.pojo.Cart;
import com.hcl.gl.cart.pojo.Users;

@EnableEurekaClient 
@SpringBootApplication 
public class CartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
		System.out.println("It IS Cart");
		

		
	}

}
