package com.question;

import com.question.QuestionService.QuestionServiceApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {QuestionServiceApplication.class})  // Wrapping in an array
class QuestionApplicationTests {

	@Test
	void contextLoads() {
	}
}
