package com.MySpringBootApp.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.MySpringBootApp.sms.entity.Student;
import com.MySpringBootApp.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{ 

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Ramesh" ,"Kumar", "ramesh12@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Mohan","sharma","mohansharma@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Sanjay","Jhadav","sanjay@gmail.com");
//		studentRepository.save(student3);
//		
//		Student student4 = new Student("Tony","Stark","tony@gmail.com");
//		studentRepository.save(student4);
		
		
		
	}

}
