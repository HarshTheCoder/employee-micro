package com.ty.employee.feignclient;

import com.ty.employee.entities.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "address",path = "/api/v1/address")
public interface IFeignClient {

    @GetMapping(path = "/fetch")
    public abstract Address findAddress(@RequestParam String empId);

}
