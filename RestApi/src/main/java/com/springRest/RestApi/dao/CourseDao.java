package com.springRest.RestApi.dao;
import com.springRest.RestApi.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
