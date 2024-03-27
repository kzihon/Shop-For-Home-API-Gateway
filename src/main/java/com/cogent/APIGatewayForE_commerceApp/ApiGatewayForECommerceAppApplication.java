package com.cogent.APIGatewayForE_commerceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayForECommerceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayForECommerceAppApplication.class, args);
	}

}
