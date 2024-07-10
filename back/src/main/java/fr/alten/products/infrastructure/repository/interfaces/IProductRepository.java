package fr.alten.products.infrastructure.repository.interfaces;

import fr.alten.products.infrastructure.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductRepository extends CrudRepository<ProductEntity, Long> {
}
