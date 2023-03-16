package com.example.Student.Management.controller;

import com.example.Student.Management.model.Student;
import com.example.Student.Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student-app")
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("find-all-students")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/find-student/id/{id}")
    public Student findById(@PathVariable int id){
        return studentService.findById(id);
    }

    @PutMapping("/update-student")
    public void updateStudent(@PathVariable int id , @RequestBody Student student){
        studentService.updateStudent(id,student);
    }

    @DeleteMapping("/delete-student")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }


}

