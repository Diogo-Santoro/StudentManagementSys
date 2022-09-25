package com.management.sys.service.impl;

import com.management.sys.entity.Student;
import com.management.sys.repository.StudentRepository;
import com.management.sys.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudent(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student, Long id){
        Student previousStudent = studentRepository.findById(id).orElse(null);
        previousStudent.setFirstName(student.getFirstName());
        previousStudent.setLastName(student.getLastName());
        previousStudent.setEmail(student.getEmail());

        studentRepository.save(previousStudent);
    }
}