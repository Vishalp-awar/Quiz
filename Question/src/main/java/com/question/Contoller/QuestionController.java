package com.question.Contoller;


import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public ResponseEntity<List<Question>> getQuestions() {
        List<Question> questions = questionService.get();
        if (questions.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(questions);
    }
    @PostMapping
    public Question addQuestion(@RequestBody Question questions) {
         return questionService.add(questions);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Question> getOne(@PathVariable Long id) {
        Question question = questionService.get(id);
        return ResponseEntity.ok(question);
    }

}
