package com.kyj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KyjCloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyjCloudProviderApplication.class, args);
	}
}
