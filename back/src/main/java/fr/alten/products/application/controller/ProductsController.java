package fr.alten.products.application.controller;


import fr.alten.products.application.dto.ProductDTO;
import fr.alten.products.application.utils.ProductVerificator;

import fr.alten.products.domain.mapper.IProductDtoMapper;
import fr.alten.products.domain.services.IProductService;
import fr.alten.products.infrastructure.model.Product;
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
    public ResponseEntity<ProductDTO>  createProduct( @RequestBody ProductDTO p)throws Exception {
        if (ProductVerificator.checkProduct(p)){
           Product product = productService.create(mapper.applicationToDomain(p));
           return ResponseEntity.ok(mapper.domainToApplication(product));
        }
        throw new Exception("Le produit n'est pas valide ");


    }
    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(mapper.domainToApplication(productService.getProduct(id)));


    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") Long id) throws Exception {
        productService.delete(id);
    }

    @PatchMapping("/products/{id}")
    public ResponseEntity<ProductDTO>  patchProduct( @PathVariable("id") Long id,@RequestBody ProductDTO p)throws Exception {
        if (ProductVerificator.checkProduct(p)){
            Product product = mapper.applicationToDomain(p);
            return ResponseEntity.ok(mapper.domainToApplication(productService.update(id,product)));
        }
        throw new Exception("Le produit n'est pas valide ");


    }
}
