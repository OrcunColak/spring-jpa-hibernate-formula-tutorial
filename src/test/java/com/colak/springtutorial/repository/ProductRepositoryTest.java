package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    void testFormula() {
        Product product = new Product();
        product.setName("product-1");
        product.setPrice(10);
        product.setDiscount(10);

        Product savedProduct = repository.saveAndFlush(product);

        Optional<Product> optionalProduct = repository.findById(savedProduct.getId());
        assertThat(optionalProduct).isPresent();

        Product byId = optionalProduct.get();
        assertThat(byId.getDiscountedPrice()).isEqualTo(9);
    }

}