package fr.alten.products.application.application;

import fr.alten.products.application.controller.ProductsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Application des produits
 */
@SpringBootApplication
@ComponentScan({"fr.alten.products.*"})
@EnableJpaRepositories(basePackages="fr.alten.products.infrastructure")
@EntityScan("fr.alten.products.infrastructure.entity")
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }



}