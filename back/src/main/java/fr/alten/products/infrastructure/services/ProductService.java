package fr.alten.products.infrastructure.services;

import fr.alten.products.domain.entity.ProductEntity;
import fr.alten.products.domain.mapper.IProductMapper;
import fr.alten.products.domain.repository.interfaces.IProductRepository;
import fr.alten.products.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private IProductMapper productMapper;

    @Override
    public void creer(Product p) {
        ProductEntity entity = productMapper.domainToEntity(p);
        System.out.println("*********" +entity.getInventoryStatus());
        productRepository.save(entity);
    }
}
