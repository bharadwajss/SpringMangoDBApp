package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

@SpringBootApplication
public class SpringMongoDbCrudAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbCrudAppApplication.class, args);
	}

}
