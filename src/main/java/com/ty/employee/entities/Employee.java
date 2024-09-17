package com.ty.employee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Employee {
    @Id
    private String empId;
    private String empName;
    private String jobDes;
    private String empType;

    @Transient
    Address address;
}
