package com.springRest.RestApi.sources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.RestApi.dao.QuestionDao;
import com.springRest.RestApi.models.Question;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionDao questionDao;
	
	public QuestionServiceImpl() {
		
	}

	@Override
	public List<Question> getAllQuest() {
		
		return questionDao.findAll();
	}

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionDao.save(question);
	}

	

}
