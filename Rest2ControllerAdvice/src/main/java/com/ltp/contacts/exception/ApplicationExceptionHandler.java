package com.ltp.contacts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public record ApplicationExceptionHandler() {
    
    @ExceptionHandler(ContactNotFoundExecption.class)
    public ResponseEntity<ErrorResponse> handleContactNotFoundException(ContactNotFoundExecption e){
        ErrorResponse errorResponse =  new ErrorResponse(e.getMessage());
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
