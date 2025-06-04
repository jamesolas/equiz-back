package com.equiz.project.service;

import java.util.List;

import com.equiz.project.model.Question;

public interface GameService {
	
	public List<Question> findAllQuestion(String name) throws Exception;

}
