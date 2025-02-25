package dev.prasadgaikwad.ai.gemini.controller;// SummarizationController.java

import dev.prasadgaikwad.ai.gemini.model.SummarizationRequest;
import dev.prasadgaikwad.ai.gemini.service.SummarizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SummarizationController {

    @Autowired
    private SummarizationService summarizationService;

    @PostMapping("/summarize")
    public ResponseEntity<String> summarize(@RequestBody SummarizationRequest request) {
        String summary = summarizationService.summarize(request.getText());
        return ResponseEntity.ok(summary);
    }
}