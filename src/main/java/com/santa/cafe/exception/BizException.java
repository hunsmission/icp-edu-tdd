package com.santa.cafe.exception;

public class BizException extends RuntimeException {
    private String message;

    public BizException() {
    }

    public BizException(String message) {
        super(message);
    }
}
