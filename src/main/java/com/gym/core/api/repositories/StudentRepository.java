package com.gym.core.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym.core.api.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
