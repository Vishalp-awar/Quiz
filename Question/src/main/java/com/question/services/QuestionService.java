package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

//    get all
    List<Question> get();

//     get one by id
    Question get(Long id);


//      add
    Question add(Question question);



}
