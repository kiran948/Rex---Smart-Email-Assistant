package com.email.Rex;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins="*")
public class RexEmailController {

    private final RexEmailService rexEmailService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response=rexEmailService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
