package com.myblog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

//    Here ResourceNotFoundException class is calling RuntimeException and further
//    RuntimeException will call Exception class and
//    Exception class will call Throwable
//    And Throwable has the idea that how to take that message and put that
//    message as a Response

    public ResourceNotFoundException(String message) {
       super(message);
    }
}
