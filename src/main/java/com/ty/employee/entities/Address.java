package com.ty.employee.entities;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Address {

    private String addrId;
    private String buildingName;
    private String empId;
    private int buildingNumber;
    private String city;
    private int pincode;

}
