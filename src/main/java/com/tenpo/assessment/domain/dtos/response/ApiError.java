package com.tenpo.assessment.domain.dtos.response;

import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

public class ApiError {
    private HttpStatus status;
    private String message;
    private List<String> errors;

    public ApiError(HttpStatus status, String message, List<String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ApiError(HttpStatus status, String message, String error) {
        this.status = status;
        this.message = message;
        errors = Collections.singletonList(error);
    }

    public HttpStatus getStatus() {
        return status;
    }

    public ApiError setStatus(HttpStatus status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApiError setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public ApiError setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }
}
