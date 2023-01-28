package com.spring.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table
public class Student {
    @Id
    private Integer studentId;
    private int age;
    private String section;
    private String firstName;
    private String lastName;
    private String preferredFullName;
    private String homeAddress;
    private String region;
    private long contactNumber;
    private LocalDate DOB;
    private String bloodGroup;
}
