package fr.alten.products.application.controller;


import fr.alten.products.application.dto.ProductDTO;
import fr.alten.products.application.utils.ProductVerificator;

import fr.alten.products.domain.mapper.IProductDtoMapper;
import fr.alten.products.domain.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductsController {

    @Autowired
    private IProductDtoMapper mapper;

    @Autowired
    private IProductService productService;

    @PostMapping("/products/create")
    public void createProduct( @RequestBody ProductDTO p) {
        if (ProductVerificator.checkProduct(p)){
           productService.create(mapper.applicationToDomain(p));
        }


    }
    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(mapper.domainToApplication(productService.getProduct(id)));


    }

}
