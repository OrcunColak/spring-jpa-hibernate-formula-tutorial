package com.colak.springtutorial.repository;


import com.colak.springtutorial.jpa.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AuthorRepositoryTest {

    @Autowired
    private AuthorFormulaRepository authorFormulaRepository;

    @Test
    void testFormula() {
        Author author = new Author();
        author.setAge(40);
        Author savedAuthor = authorFormulaRepository.saveAndFlush(author);

        Optional<Author> optionalAuthorFormula = authorFormulaRepository.findById(savedAuthor.getId());
        assertThat(optionalAuthorFormula).isPresent();

        Author byId = optionalAuthorFormula.get();
        assertThat(byId.getTenAge()).isEqualTo(400);
    }
}

