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
//		Optional<GameQuestion[]> optional = repo.findByGame(game);
//		GameQuestion[] gameQuestions = optional.orElseThrow( () -> new Exception("Game questions not found") );
//		List<GameQuestion> questionsList = new ArrayList<>();
//		for(GameQuestion gameQuestion : gameQuestions) {
//			GameQuestion gq = new GameQuestion();
//			gq.setQuestion(gameQuestion.getQuestion());
//			gq.setAnswer(gameQuestion.getAnswer());
//			gq.setGame(gameQuestion.getGame());
//			gq.setLink(gameQuestion.getLink());
//			gq.setFile(gameQuestion.getFile());
			
//			questionsList.add(gameQuestion);
//		}
//		System.out.println("Hi " + questionsList);
//		return questionsList;
		List<Question> list = repo.findByName(name);
		Collections.shuffle(list);
		return list;
	}

}
