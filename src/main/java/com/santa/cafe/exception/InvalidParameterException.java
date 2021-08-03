package com.santa.cafe.exception;

import org.springframework.http.HttpStatus;

public class InvalidParameterException extends RuntimeException {
    private HttpStatus status = HttpStatus.BAD_REQUEST;
    private String message;

    public InvalidParameterException() {

    }

    public InvalidParameterException(String message) {
        super(message);
    }
}
