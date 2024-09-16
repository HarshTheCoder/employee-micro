package com.ty.employee.service;

import com.ty.employee.entities.Employee;
import com.ty.employee.repository.EmployeeRepository;
import com.ty.employee.request.EmployeeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(EmployeeRequest employeeRequest) {

        Employee employee = Employee.builder()
                .empId(UUID.randomUUID().toString())
                .empName(employeeRequest.getEmpName())
                .empType(employeeRequest.getEmpType())
                .jobDes(employeeRequest.getJobDes())
                .build();

       return employeeRepository.save(employee);

    }

    public Employee findEmployee(String empId) {
        Employee employee = employeeRepository.findById(empId).orElseThrow(RuntimeException::new);
        return employee;
    }
}
