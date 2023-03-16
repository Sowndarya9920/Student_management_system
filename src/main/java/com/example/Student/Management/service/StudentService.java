package com.example.Student.Management.service;

import com.example.Student.Management.dao.IStudentRepository;
import com.example.Student.Management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    @Autowired
    IStudentRepository studentRepository;


    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(int id) {
        return studentRepository.findById(id).get();
    }

    public void updateStudent(int id, Student newStudent) {
        Student students = studentRepository.findById(id).get();
        students.setId(newStudent.getId());
        students.setName(newStudent.getName());
        students.setEmail(newStudent.getEmail());
        students.setGrade(newStudent.getGrade());

        studentRepository.save(students);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
