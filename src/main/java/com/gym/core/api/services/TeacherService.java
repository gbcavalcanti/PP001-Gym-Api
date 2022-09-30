package com.gym.core.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.core.api.entities.Teacher;
import com.gym.core.api.repositories.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepository teacherRepository;

	public List<Teacher> getAllTeachers(){
		return teacherRepository.findAll();
	}
	
	public Teacher getTeacher(Long id) {
		
		return teacherRepository.findById(id).get();
		
	}
	
	
}
