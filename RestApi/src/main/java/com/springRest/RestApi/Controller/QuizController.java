package com.springRest.RestApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springRest.RestApi.Repository.QuizRepository;
import com.springRest.RestApi.dao.QuestionDao;
import com.springRest.RestApi.models.Admin;
import com.springRest.RestApi.models.Question;
import com.springRest.RestApi.sources.QuestionService;

@RestController
public class QuizController {
	
	
	@Autowired
	QuizRepository quizRepository;
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/AllUser")
	public List<Admin> getAllUser(){
		List<Admin> list=(List<Admin>) quizRepository.findAll();
		return list;
	}
	@PostMapping("/AddUser")
	public Admin addUser(@RequestBody Admin admin) {
		return quizRepository.save(admin);
	}
	
	@GetMapping("/AllQuestion")
	public List<Question> getAllQuestion(){
		return questionService.getAllQuest();
	}
	
	@PostMapping("/AddQuestion")
	public Question addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
	
	

}
