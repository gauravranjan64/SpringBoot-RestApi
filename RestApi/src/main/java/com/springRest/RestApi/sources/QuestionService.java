package com.springRest.RestApi.sources;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springRest.RestApi.models.Question;


public interface QuestionService {

	List<Question> getAllQuest();

	Question addQuestion(Question question);

}
