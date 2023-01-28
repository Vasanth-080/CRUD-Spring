package com.spring.student.service;

import com.spring.student.bean.StudentRequest;
import com.spring.student.model.Student;
import com.spring.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public String addStudent(StudentRequest student){
        studentRepository.saveAll(student.getStudentDetails());
        return "Student Added Successfully";
    }
    public List<Student> getProducts(){

       return studentRepository.findAll();
    }
    public Student getStudent(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    public String deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return "Student details got deleted";
    }

    public String updateStudent(Student student) {
        try{
            Student existingStudentDetails=
                    studentRepository.findById(student.getStudentId()).orElseThrow(null);
            existingStudentDetails.setAge(student.getAge());
            existingStudentDetails.setSection(student.getSection());
            existingStudentDetails.setFirstName(student.getFirstName());
            existingStudentDetails.setLastName(student.getLastName());
            existingStudentDetails.setPreferredFullName(student.getPreferredFullName());
            existingStudentDetails.setHomeAddress(student.getHomeAddress());
            existingStudentDetails.setRegion(student.getRegion());
            existingStudentDetails.setContactNumber(student.getContactNumber());
            existingStudentDetails.setDOB(student.getDOB());
            existingStudentDetails.setBloodGroup(student.getBloodGroup());
            studentRepository.save(existingStudentDetails);
            return "Student Updated Successfully";
        }catch(Exception e){
            return "Student is not found with the given id: "+student.getStudentId();
        }
    }
}
