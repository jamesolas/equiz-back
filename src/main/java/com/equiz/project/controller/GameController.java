package com.equiz.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.equiz.project.model.Question;
import com.equiz.project.service.GameService;


@RestController
@CrossOrigin (origins = {"https://equiz-front.vercel.app", "http://localhost:4200"})
public class GameController {
	
	@Autowired
	GameService service;
	
	@GetMapping("getQuestions/{name}")
	public ResponseEntity<List<Question> > getQuestions(@PathVariable String name) throws Exception{
		return ResponseEntity.ok(service.findAllQuestion(name));
	}
	
	@GetMapping("getString/{word}")
	public ResponseEntity<String> getString(@PathVariable String word) throws Exception{
		return ResponseEntity.ok(word);
	}

}
