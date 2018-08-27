package com.info.app;

import java.util.List;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.info.StudentRepository;
import com.info.dao.StudentDao;
import com.info.model.Student;

@Controller
class StudentService{

	  @Autowired
	  StudentRepository noteRepository;

	
	 @GetMapping("/notes")
	 public Iterable<Student> getAllStudent() {
	     return noteRepository.findAll();
	 }
	
}