package com.email.Rex;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
