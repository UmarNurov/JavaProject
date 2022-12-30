package com.tutorial.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.demo.entity.Student;
import com.tutorial.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Amelie", "Radhard","Amelie@gmail.com");
//		Student student2 = new Student("Boghdan", "Krafft", "Kraft@gmail.com");
//		Student student3 = new Student("Pahahontas", "Seviora", "Seviora@gmail.com");
//		
//		studentRepository.save(student1);
//
//		studentRepository.save(student2);
//
//		studentRepository.save(student3);
		
	}
	
	

}
