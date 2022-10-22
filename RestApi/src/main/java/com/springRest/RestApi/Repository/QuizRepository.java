package com.springRest.RestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springRest.RestApi.models.Admin;
import com.springRest.RestApi.models.Question;

public interface QuizRepository extends CrudRepository<Admin, String>{

	

}
