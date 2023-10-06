package com.example.starwarsquotesapi.repository;

import com.example.starwarsquotesapi.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

List<Quote> findAllByAuthor(String author);

}
