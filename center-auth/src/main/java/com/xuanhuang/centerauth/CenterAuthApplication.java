package com.xuanhuang.centerauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CenterAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(CenterAuthApplication.class, args);
	}

}
