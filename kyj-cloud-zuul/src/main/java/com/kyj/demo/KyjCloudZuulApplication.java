package com.kyj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.kyj.demo.filter.TokenFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@RefreshScope
public class KyjCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyjCloudZuulApplication.class, args);
	}
	
	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}

}
