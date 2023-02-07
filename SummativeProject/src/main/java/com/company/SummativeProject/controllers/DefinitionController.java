package com.company.SummativeProject.controllers;


import com.company.SummativeProject.models.Definition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DefinitionController {

    private List<Definition> words;

    public DefinitionController() {
        words = new ArrayList<>();
        words.add(new Definition(1,"Ambiguous", "having more than one possible meaning "));
        words.add(new Definition(2,"Consequence","a result or effect of an action or decision "));
        words.add(new Definition(3,"Effervescence","excitement or liveliness "));
        words.add(new Definition(4,"Ferocious", "extremely violent or brutal "));
        words.add(new Definition(5,"Gratitude", "the quality of being thankful; readiness to show appreciation for and to return kindness "));
        words.add(new Definition(6,"Hysterical", "extremely funny; uncontrollable laughter or emotion "));
        words.add(new Definition(7,"Intricate", "having many interrelated parts or details; complex "));
        words.add(new Definition(8,"Jubilant", "feeling or expressing great happiness or triumph "));
        words.add(new Definition(9,"Kaleidoscope", "an optical toy consisting of a tube with mirrors at one end and bits of colored glass at the other, used to reflect light and produce changing patterns "));
        words.add(new Definition(10,"Luminous", "giving off light; shining brightly; emitting light "));
    }

    @GetMapping("/word")
    @ResponseStatus(HttpStatus.OK)
    public Definition getRandomWord() {
        int randomIndex = (int) (Math.random() * words.size());
        return words.get(randomIndex);
    }
}
