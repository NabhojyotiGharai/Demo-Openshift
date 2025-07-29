package com.okta.mongodb.mongodbouth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class MongoDbOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbOAuthApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public Message displayMessage() {
		return new Message();
	}

	static class Message {
		private String content = "Greetings!";

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

}
