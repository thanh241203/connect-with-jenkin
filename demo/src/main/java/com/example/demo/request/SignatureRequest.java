package com.example.demo.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignatureRequest {
    private String base64Data;
    private String base64PrivateKey;
}
