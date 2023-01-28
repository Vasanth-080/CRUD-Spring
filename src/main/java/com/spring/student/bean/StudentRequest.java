package com.spring.student.bean;

import com.spring.student.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    private List<Student> studentDetails;
}
