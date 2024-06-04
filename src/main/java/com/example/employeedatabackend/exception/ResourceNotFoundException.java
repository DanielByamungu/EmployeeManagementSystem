package com.example.employeedatabackend.exception;

import jakarta.annotation.Resource;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID=1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
