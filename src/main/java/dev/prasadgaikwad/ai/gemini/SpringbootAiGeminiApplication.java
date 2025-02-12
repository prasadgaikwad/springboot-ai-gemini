package dev.prasadgaikwad.ai.gemini;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootAiGeminiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAiGeminiApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ChatClient.Builder builder) {
		return args -> {
			ChatClient client = builder.build();

			String response = client.prompt()
					.user("Tell me a programmer joke!")
					.call()
					.content();

			System.out.println(response);
		};
	}
}
