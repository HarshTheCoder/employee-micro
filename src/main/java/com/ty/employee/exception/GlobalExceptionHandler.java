package com.ty.employee.exception;

import com.ty.employee.response.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleAddressNotFoundException(EmployeeNotFoundException exception,
                                                                        HttpServletRequest httpServletRequest){

        log.info("Hey there!!!!");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse.builder()
                .data(exception.getMessage())
                .localDateTime(LocalDateTime.now())
                .uri(httpServletRequest.getRequestURI())
                .build());

    }
}
