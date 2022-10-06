package com.gym.core.api.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gym.core.api.entities.Student;
import com.gym.core.api.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students = studentService.getAllStudents();
		
		return ResponseEntity.ok(students);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id){
		Student student = studentService.getStudent(id);
		
		return ResponseEntity.ok(student);
	}
	
	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		Student savedStudent = studentService.saveStudent(student);
		
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudent.getId())
				.toUri();
		
		
		return ResponseEntity.created(uri).body(savedStudent);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student){
		
		Student updatedStudent =  studentService.updateStudent(id, student);
		
		
		return ResponseEntity.ok(updatedStudent);
	}
	

}
