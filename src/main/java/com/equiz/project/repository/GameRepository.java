package com.equiz.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equiz.project.model.Question;

public interface GameRepository extends JpaRepository<Question, Long>{

	List<Question> findByName(String name);
	
}
