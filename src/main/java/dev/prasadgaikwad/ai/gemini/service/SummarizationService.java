package dev.prasadgaikwad.ai.gemini.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class SummarizationService {
    private static final String PROMPT = "You are a helpful assistant. Summarize the provided content of the link in less than 100 words.";
    private final ChatClient chatClient;

    public SummarizationService(ChatClient.Builder builder) {
        chatClient = builder.defaultSystem(PROMPT).build();
    }

    public String summarize(String text) {
        return chatClient.prompt()
                .user(text)
                .call()
                .content();
    }
}