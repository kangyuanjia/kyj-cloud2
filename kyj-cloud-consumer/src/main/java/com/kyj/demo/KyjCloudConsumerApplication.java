package com.kyj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrix
public class KyjCloudConsumerApplication {

    @Autowired
    private RestTemplateBuilder builder;

    // ribbon需要配置，负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return builder.build();
    }
    
	public static void main(String[] args) {
		SpringApplication.run(KyjCloudConsumerApplication.class, args);
	}
}
