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
	
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	public void deleteStudent(Long id) {
	Student student = studentRepository.findById(id).get();
		studentRepository.delete(student);
	}
	
	public Student updateStudent(Long id, Student student) {
		
		Student updatingStudent = studentRepository.findById(id).get();
		updatingStudent.setName(student.getName());
		updatingStudent.setBirthDate(student.getBirthDate());
		updatingStudent.setCpf(student.getCpf());
		updatingStudent.setTeacher(student.getTeacher());
		updatingStudent.setAdress(student.getAdress());
		Student updatedStudent = studentRepository.save(updatingStudent);
		
		return updatedStudent;
	}
	
}
