package com.tenpo.assessment.domain.dtos.response;

import org.springframework.http.HttpStatus;

public class ApiResponse {
    private String message;

    public ApiResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public ApiResponse setMessage(String message) {
        this.message = message;
        return this;
    }
}
