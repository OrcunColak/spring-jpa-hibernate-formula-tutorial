package com.colak.springtutorial.repository;


import com.colak.springtutorial.jpa.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorFormulaRepository extends JpaRepository<Author,Long> {
}
