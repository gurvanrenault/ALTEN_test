package fr.alten.products.domain.repository.interfaces;

import fr.alten.products.domain.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductRepository extends CrudRepository<ProductEntity, Integer> {
}
