package com.okta.mongodb.mongodbouth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MongoDbOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbOAuthApplication.class, args);
	}

	@RequestMapping("/hello")
    public String hello() {
        return "Hello from OpenShift!";
    }

}
