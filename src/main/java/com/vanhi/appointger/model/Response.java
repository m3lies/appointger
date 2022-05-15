package com.vanhi.appointger.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class Response {
    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String message;
}
