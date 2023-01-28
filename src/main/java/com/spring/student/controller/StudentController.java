package com.spring.student.controller;

import com.spring.student.bean.StudentRequest;
import com.spring.student.model.Student;
import com.spring.student.repository.StudentRepository;
import com.spring.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository repository;
    //Adding Student
    @PostMapping
    public String addStudent(@RequestBody StudentRequest studentDetails){
        return studentService.addStudent(studentDetails);
    }
    //Get all students as list
    @GetMapping
    public List<Student> getAllStudents(){
            return studentService.getProducts();
    }
    //Get student by their id
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }
    // Delete Student data using the id
    @DeleteMapping("{id}")
    public String deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }
    @PutMapping
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
}
