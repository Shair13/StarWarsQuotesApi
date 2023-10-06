package com.example.starwarsquotesapi.repository;

import com.example.starwarsquotesapi.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {



}
