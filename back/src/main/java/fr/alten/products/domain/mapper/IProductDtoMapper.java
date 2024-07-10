package fr.alten.products.domain.mapper;


import fr.alten.products.application.dto.ProductDTO;
import fr.alten.products.infrastructure.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface IProductDtoMapper {

    Product applicationToDomain(ProductDTO p);

    ProductDTO domainToApplication(Product p);
}

