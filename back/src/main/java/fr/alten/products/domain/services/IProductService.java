package fr.alten.products.domain.services;
import fr.alten.products.infrastructure.model.Product;

public interface IProductService {

    void create(Product p);

    Product getProduct(Long id) throws Exception;

    void delete(Long id ) throws  Exception;
}
