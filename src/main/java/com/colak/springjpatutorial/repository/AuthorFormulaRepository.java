package com.colak.springjpatutorial.repository;


import com.colak.springjpatutorial.jpa.AuthorFormula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorFormulaRepository extends JpaRepository<AuthorFormula,Long> {
}
