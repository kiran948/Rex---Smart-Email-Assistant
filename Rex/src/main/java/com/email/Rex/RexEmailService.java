package com.email.Rex;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class RexEmailService {

    private final WebClient webClient;

    @Value("${gemini.api.url}")
    private String geminiApiUrl;

    @Value("${gemini.api.key}")
    private String geminiApiKey;

    public RexEmailService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public String generateEmailReply(EmailRequest emailRequest) {
        //1. Build the Prompt
        String prompt = buildPrompt(emailRequest);
        //2. Craft a Request
        Map<String, Object> requestBody = Map.of(
                "contents",new Object[]{
                    Map.of("parts", new Object[]{
                        Map.of("text",prompt)
                    })
                }
        );
        //3. Do request and Get response
        String response = webClient.post()
                .uri(geminiApiUrl +"?key="+geminiApiKey)
                .header("Content-Type" ,"application/json")
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        //4. Extract response and return
        return extractResponseContent(response);
    }

    private String extractResponseContent(String response) {
        try{
            ObjectMapper mapper =new ObjectMapper();
            JsonNode rootNode=mapper.readTree(response);

            return rootNode.path("candidates")
                    .get(0)
                    .path("content")
                    .path("parts")
                    .get(0)
                    .path("text")
                    .asText();
        }catch(Exception e){
            return "Error processing request: " + e.getMessage();
        }
    }

    private String buildPrompt(EmailRequest emailRequest){
        StringBuilder prompt=new StringBuilder();
        prompt.append("Generate a professional email reply for the following email content. Please don't generate a subject line");
        if(emailRequest.getTone() != null && !emailRequest.getTone().isEmpty()){
            prompt.append("Use a").append(emailRequest.getTone()).append(" tone ");
        }
        prompt.append("\nOrigin email: \n").append(emailRequest.getEmailContent());
        return prompt.toString();
    }
}
