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
    private AuthorRepository repository;

    @Test
    void testFormula() {
        Author author = new Author();
        author.setAge(40);
        Author savedAuthor = repository.saveAndFlush(author);

        Optional<Author> optionalAuthor = repository.findById(savedAuthor.getId());
        assertThat(optionalAuthor).isPresent();

        Author byId = optionalAuthor.get();
        assertThat(byId.getTenAge()).isEqualTo(400);
    }
}

