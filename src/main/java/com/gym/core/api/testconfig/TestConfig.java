package com.gym.core.api.testconfig;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gym.core.api.entities.Student;
import com.gym.core.api.entities.Teacher;
import com.gym.core.api.repositories.StudentRepository;
import com.gym.core.api.repositories.TeacherRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {


		Teacher t1 = new Teacher(null, "jorge", LocalDate.parse("1995-10-08"), "045.136.856-03",  "05.255.085/0001-33");
		Teacher t2 = new Teacher(null, "carlos", LocalDate.parse("1985-05-05"), "045.136.856-03",  "05.255.085/0001-33");
		Teacher t3 = new Teacher(null, "ramon", LocalDate.parse("1979-10-10"), "045.136.856-03",  "05.255.085/0001-33");
		
		teacherRepository.saveAll(Arrays.asList(t1,t2,t3));
		
		
		Student s1 = new Student(null, "jorge", LocalDate.parse("1995-10-08"), "045.136.856-03");
		Student s2 = new Student(null, "carlos", LocalDate.parse("1985-05-05"), "045.136.856-03");
		Student s3 = new Student(null, "ramon", LocalDate.parse("1979-10-10"), "045.136.856-03");
		
		studentRepository.saveAll(Arrays.asList(s1,s2,s3));
		
		s1.setTeacher(t3);
		
		studentRepository.save(s1);
		
	}
	
	
	
	

}
