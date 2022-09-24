package com.management.sys;

import com.management.sys.entity.Student;
import com.management.sys.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Diogo", "Santoro", "diogo@hotmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Igor", "Gabriel","igorfilmes@hotmail.com");
		studentRepository.save(student2);*/

	}
}
