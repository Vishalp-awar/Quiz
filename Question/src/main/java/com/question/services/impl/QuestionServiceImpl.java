package com.question.services.impl;

import com.question.entities.Question;
import com.question.repositories.QuestionRepo;
import com.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepo questionRepo;

    @Autowired // Optional if you only have one constructor
    public QuestionServiceImpl(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public List<Question> get() {
        return new ArrayList<>(questionRepo.findAll());
    }

    @Override
    public Question get(Long id) {
        return questionRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Question Not found By ID"));
    }

    @Override
    public Question add(Question question) {
        questionRepo.save(question);
        return question;
    }
}
