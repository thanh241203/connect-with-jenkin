package com.example.demo.exception;

public class SignatureVerifyException extends RuntimeException {
    public SignatureVerifyException(String message, Throwable cause) {
        super(message, cause);
    }
}
