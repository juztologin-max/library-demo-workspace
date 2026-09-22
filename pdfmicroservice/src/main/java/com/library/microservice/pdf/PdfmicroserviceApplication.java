package com.library.microservice.pdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class PdfmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfmicroserviceApplication.class, args);
	}

}
