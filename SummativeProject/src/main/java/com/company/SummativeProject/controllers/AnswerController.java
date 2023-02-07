package com.company.SummativeProject.controllers;


import com.company.SummativeProject.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnswerController {

    private List<Answer> answers;

    public AnswerController() {
        answers = new ArrayList<>();
        answers.add(new Answer(1, "", "It is certain."));
        answers.add(new Answer(2, "", "Without a doubt."));
        answers.add(new Answer(3, "", "You may rely on it."));
        answers.add(new Answer(4, "", "Better not tell you now."));
        answers.add(new Answer(5, "", "Ask again later."));
        answers.add(new Answer(6, "", "Don't count on it."));
    }

    @RequestMapping (value = "/magic", method = RequestMethod.POST )
    @ResponseStatus(HttpStatus.OK)
    public Answer getRandomAnswer() {
        int randomIndex = (int) (Math.random() * answers.size());
        return answers.get(randomIndex);
    }
}
