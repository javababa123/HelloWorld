package com.info;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.info.model.*; 

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
     
 
}