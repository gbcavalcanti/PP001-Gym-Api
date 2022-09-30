package com.gym.core.api.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Date birthDate;
	private String cpf;
	
	
	
	public User() {
		super();
	}
	

	public User(Long id, String name, Date birthDate, String cpf) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.cpf = cpf;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
