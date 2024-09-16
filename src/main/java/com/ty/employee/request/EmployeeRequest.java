package com.ty.employee.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class EmployeeRequest {

    private String empName;
    private String jobDes;
    private String empType;

}