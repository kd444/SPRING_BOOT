package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
//type we work with, and the type of ID 
public interface StudentRepository extends JpaRepository<Student, Long>{

//	SELECT 8 FROM student WHERE email = ?
	@Query("SELECT s FROM Student s WHERE s.email= ?1")

	Optional<Student> findStudentByEmail(String email);
}
