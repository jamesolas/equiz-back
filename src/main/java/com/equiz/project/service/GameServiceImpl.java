package com.equiz.project.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.equiz.project.model.Question;
import com.equiz.project.repository.GameRepository;

@Service
@Transactional
public class GameServiceImpl implements GameService {

	@Autowired
	GameRepository repo;
	
	@Override
	public List<Question> findAllQuestion(String name) throws Exception {
		List<Question> list = repo.findByName(name);
		Collections.shuffle(list);
		return list;
	}

}
