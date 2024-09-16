package com.ty.employee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

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
    List<Address> listOfAddress;
}
