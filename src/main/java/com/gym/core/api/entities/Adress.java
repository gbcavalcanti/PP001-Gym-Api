package com.gym.core.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "tb_adress")
public class Adress implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String street;
	private String number;
	private String aptNumber;
	private String description;
	
	@JsonIgnore
	@OneToOne
	private Student student;
	
	@JsonIgnore
	@OneToOne
	private Teacher teacher;
	
	public Adress() {
		super();
	}



	public Adress(String street, String number, String aptNumber, String description, Student student) {
		super();
		this.street = street;
		this.number = number;
		this.aptNumber = aptNumber;
		this.description = description;
		this.student = student;
	}
	
	public Adress(String street, String number, String aptNumber, String description, Teacher teacher) {
		super();
		this.street = street;
		this.number = number;
		this.aptNumber = aptNumber;
		this.description = description;
		this.teacher = teacher;
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getAptNumber() {
		return aptNumber;
	}



	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public Teacher getTeacher() {
		return teacher;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
		
}
