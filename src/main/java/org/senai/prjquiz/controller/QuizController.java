package org.senai.prjquiz.controller;

import org.senai.prjquiz.entity.Quiz;
import org.senai.prjquiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/quiz")
@CrossOrigin("*")
public class QuizController {

    @Autowired
    QuizRepository qRepository;

    @PostMapping("/")
    public @ResponseBody Integer addQuiz(@RequestBody Quiz objQuiz){
        qRepository.save(objQuiz);
        return objQuiz.getId();
    }
    
}
