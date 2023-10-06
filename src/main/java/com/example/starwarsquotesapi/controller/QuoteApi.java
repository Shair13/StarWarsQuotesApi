package com.example.starwarsquotesapi.controller;

import com.example.starwarsquotesapi.model.Quote;
import com.example.starwarsquotesapi.repository.QuoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class QuoteApi {

    private final QuoteRepository quoteRepository;

    public QuoteApi(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }



    @GetMapping("/api/random")
    public Quote getRandomQuote(){
        Random r = new Random();
        List<Quote> quotes = quoteRepository.findAll();
        return quotes.get(r.nextInt(quotes.size()));
    }

    @GetMapping("/api")
    public List<Quote> getAllQuotes(){
        return quoteRepository.findAll();
    }

    @PostMapping("/api")
    public void addQuote(@RequestBody Quote quote){
        quoteRepository.save(quote);
    }

    @DeleteMapping("/api")
    public void deleteQuote(@RequestParam Long id){
        Optional<Quote> optionalQuote = quoteRepository.findById(id);
        optionalQuote.ifPresent(quoteRepository::delete);
    }

    @GetMapping("/api/{character}")
    public List<Quote> getQuotesByCharacter(@PathVariable String character){
        return quoteRepository.findAllByAuthor(character);
    }
}
