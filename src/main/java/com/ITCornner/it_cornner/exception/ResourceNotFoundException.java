package com.ITCornner.it_cornner.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException
{
    String resourceName;
    String fieldName;
    long fieldValue;

    //customized resource not found exception
    public ResourceNotFoundException(String resourceName, String fieldName, long string) {
        super(String.format( "%s not found with %s : %s " , resourceName,fieldName,string));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = string;
    }
}
