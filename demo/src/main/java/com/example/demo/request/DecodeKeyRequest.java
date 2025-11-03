package com.example.demo.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DecodeKeyRequest {
    private String signature;
    private String base64Data;

}
