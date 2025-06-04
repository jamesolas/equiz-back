package com.equiz.project;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.equiz.project.model.Question;
import com.equiz.project.repository.GameRepository;
import com.equiz.project.service.GameServiceImpl;

@SpringBootTest
class GameServiceTest {
	
	@Mock
	private GameRepository repo;
	
	@InjectMocks
	private GameServiceImpl service;

	@Test
	void testFindAllGameQuestion() throws Exception{
		List<Question> list = new ArrayList<>();
//		list.add(new GameQuestion(1, "Who is this character?","Cyan","finalfantasy6","https://www.giantbomb.com/a/uploads/scale_small/0/30/11431-cyan.jpg",new File("test")) );
		
	}

}
