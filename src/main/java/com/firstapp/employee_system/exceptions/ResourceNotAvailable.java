package com.firstapp.employee_system.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotAvailable extends RuntimeException{
    public ResourceNotAvailable(String message){
        super(message);
    }
}
