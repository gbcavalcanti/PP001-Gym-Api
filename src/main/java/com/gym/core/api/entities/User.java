package com.gym.core.api.entities;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private Date birthDate;
	private String cpf;
	
	
	
	public User() {
		super();
	}
	

	public User(String name, Date birthDate, String cpf) {
		this.name = name;
		this.birthDate = birthDate;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
}
