package com.question.QuestionService.repositories;

import com.question.QuestionService.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Long> {
}
