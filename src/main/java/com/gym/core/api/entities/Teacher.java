package com.gym.core.api.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_teacher")
public class Teacher extends User {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cnpj;
	
	@OneToMany(mappedBy = "teacher")
	private Set<Student> students = new HashSet<>();

	
	public Teacher() {
		super();
	}

	public Teacher(Long id, String name, Date birthDate, String cpf, String cnpj) {
		super(name, birthDate, cpf);
		this.id = id;
		this.cnpj = cnpj;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Set<Student> getStudents() {
		return students;
	}
	
}
