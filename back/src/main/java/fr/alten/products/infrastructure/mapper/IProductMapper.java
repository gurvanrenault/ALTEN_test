package fr.alten.products.infrastructure.mapper;



import fr.alten.products.infrastructure.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import fr.alten.products.infrastructure.entity.ProductEntity;

import java.util.List;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface IProductMapper {

    ProductEntity domainToEntity(Product p);

    Product entityToDomain(ProductEntity p);

    List<Product> listEntityToDomain(List<ProductEntity> productList);
}

