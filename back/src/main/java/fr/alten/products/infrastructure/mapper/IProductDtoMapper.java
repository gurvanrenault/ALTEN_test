package fr.alten.products.infrastructure.mapper;


import fr.alten.products.application.dto.ProductDTO;
import fr.alten.products.infrastructure.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface IProductDtoMapper {

    Product applicationToInfra(ProductDTO p);
}

