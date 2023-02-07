package com.company.SummativeProject.controllers;

import com.company.SummativeProject.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuoteController {
    private List<com.company.SummativeProject.models.Quote> quotes;

    public QuoteController() {
        quotes = new ArrayList<Quote>();
        quotes.add(new Quote(1, "Marcus Aurelius", "You have power over your mind, not outside events. Realize this, and you will find strength. "));
        quotes.add(new Quote(2, "Christian D. Larson", "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle."));
        quotes.add(new Quote(3, "Osamu Dazai", "Life is a tragedy for those who feel, and a comedy for those who think. "));
        quotes.add(new Quote(4, "James Baldwin", "Not everything that is faced can be changed, but nothing can be changed until it is faced. "));
        quotes.add(new Quote(5, "Steve Jobs", "The only way to do great work is to love what you do. "));
        quotes.add(new Quote(6, "Nelson Mandela", "The greatest glory in living lies not in never falling, but in rising every time we fall. "));
        quotes.add(new Quote(7, "Eleanor Roosevelt", "The future belongs to those who believe in the beauty of their dreams. "));
        quotes.add(new Quote(8, "Dalai Lama", "Happiness is not something ready made. It comes from your own actions. "));
        quotes.add(new Quote(9, "Theodore Roosevelt", "Believe you can and you're halfway there. "));
        quotes.add(new Quote(10, "Franklin D. Roosevelt", "The only limit to our realization of tomorrow will be our doubts of today."));
    }

    @GetMapping("/quote")
    @ResponseStatus(HttpStatus.OK)
    public Quote getRandomQuote() {
        int randomIndex = (int) (Math.random() * quotes.size());
        return quotes.get(randomIndex);
    }
}
