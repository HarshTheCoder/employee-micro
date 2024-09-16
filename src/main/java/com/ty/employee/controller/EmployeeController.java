package com.ty.employee.controller;

import com.ty.employee.entities.Address;
import com.ty.employee.entities.Employee;
import com.ty.employee.feignclient.IFeignClient;
import com.ty.employee.request.EmployeeRequest;
import com.ty.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final IFeignClient iFeignClient;

    @PostMapping(path = "/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeRequest employeeRequest){
        Employee savedEmployee = employeeService.saveEmployee(employeeRequest);
        return  ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }

    @GetMapping(path = "/find")
    public ResponseEntity<Employee> findEmployee(@RequestParam String empId){
        Employee employee = employeeService.findEmployee(empId);
        Address address = iFeignClient.findAddress(empId);
        employee.getListOfAddress().add(address);
       return ResponseEntity
                .status(HttpStatus.OK)
                .body(employee);
    }
}

