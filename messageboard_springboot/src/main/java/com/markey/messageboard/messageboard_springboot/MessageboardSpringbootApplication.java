package com.markey.messageboard.messageboard_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@ComponentScan(basePackages={"com.markey.messageboard.controller",
		"com.markey.messageboard.service.impl"})
@EntityScan(basePackages ="com.markey.messageboard.model")
@EnableMongoRepositories(basePackages = "com.markey.messageboard.repository")
public class MessageboardSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageboardSpringbootApplication.class, args);
	}
}
