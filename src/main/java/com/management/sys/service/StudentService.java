package com.management.sys.service;

import com.management.sys.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudent(Long id);

    void deleteStudent(Long id);

    void updateStudent(Student student, Long id);
}
