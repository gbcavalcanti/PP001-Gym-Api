package com.gym.core.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.core.api.entities.Teacher;
import com.gym.core.api.services.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@GetMapping
	public ResponseEntity<List<Teacher>> getAllTeachers(){
		List<Teacher> teachers = teacherService.getAllTeachers();
		
		return ResponseEntity.ok(teachers);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable Long id){
		Teacher teacher = teacherService.getTeacher(id);
		
		return ResponseEntity.ok(teacher);
	}
	
	
	
	
	

}
