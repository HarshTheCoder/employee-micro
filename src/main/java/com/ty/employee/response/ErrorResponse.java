package com.ty.employee.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorResponse<T> {

    private  T data;
    private HttpStatus httpStatus;
    private LocalDateTime localDateTime;
    private String uri;
}
