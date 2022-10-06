package com.gym.core.api.DTO;

import java.io.Serializable;
import java.time.LocalDate;

import com.gym.core.api.entities.Adress;
import com.gym.core.api.entities.Student;
import com.gym.core.api.entities.Teacher;

public class StudentDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;	
	private String name;
	private LocalDate birthDate;
	private String cpf;	
	private Teacher teacher;	
	private Adress adress;
	
	
	public StudentDTO(Student student) {
		this.id = student.getId();
		this.name = student.getName();
		this.birthDate = student.getBirthDate();
		this.cpf = student.getCpf();
		this.teacher = student.getTeacher();
		this.adress = student.getAdress();
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
		
	
}
