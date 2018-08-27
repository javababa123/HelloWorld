package com.info.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.info.model.Student;

public interface StudentDao extends CrudRepository<Student, Long> { 

	 public  Iterable<Student> getAllStudent();	
}
