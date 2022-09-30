package com.gym.core.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.core.api.entities.Student;
import com.gym.core.api.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student getStudent(Long id) {
		
		return studentRepository.findById(id).get();
		
	}
	
	
}
