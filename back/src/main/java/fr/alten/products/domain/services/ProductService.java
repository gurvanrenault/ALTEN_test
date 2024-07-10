package fr.alten.products.domain.services;

import fr.alten.products.infrastructure.entity.ProductEntity;
import fr.alten.products.infrastructure.mapper.IProductMapper;
import fr.alten.products.infrastructure.repository.interfaces.IProductRepository;
import fr.alten.products.infrastructure.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private IProductMapper productMapper;

    @Override
    public void create(Product p) {
        ProductEntity entity = productMapper.domainToEntity(p);
        productRepository.save(entity);
    }

    @Override
    public Product getProduct(Long id) throws Exception {
        Optional<ProductEntity> opt = productRepository.findById(id);
        if ( ! opt.isPresent()) {
            throw new Exception("Le produit n'existe pas ");
        }
        return productMapper.entityToDomain(opt.get());
    }
}
