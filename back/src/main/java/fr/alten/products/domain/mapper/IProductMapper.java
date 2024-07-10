package fr.alten.products.domain.mapper;



import fr.alten.products.domain.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import fr.alten.products.domain.entity.ProductEntity;
@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface IProductMapper {

    ProductEntity domainToEntity(Product p);
}

