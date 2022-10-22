package com.springRest.RestApi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springRest.RestApi.models.Question;

public interface QuestionDao extends JpaRepository<Question, Integer>{

	

	

}
