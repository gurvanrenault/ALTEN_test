package fr.alten.products.domain.services;
import fr.alten.products.infrastructure.model.Product;
import java.util.List;

public interface IProductService {
    /**
     * Create a product
     * @param p product to create
     * @return product created
     */
    Product create(Product p);

    /**
     * Get product
     * @param id identificator of the product
     * @return product with an id
     * @throws Exception
     */
    Product getProduct(Long id) throws Exception;

    /**
     * Delete product
     * @param id identificator of the product
     * @throws Exception
     */
    void delete(Long id ) throws  Exception;

    /**
     * Update product
     * @param id identificator of the product
     * @param product product to update
     * @return
     * @throws Exception
     */
    Product update(Long id, Product product)throws  Exception;

    /**
     *  Get list of all products
     * @return list of all products
     */
    List<Product> getProducts();
}
