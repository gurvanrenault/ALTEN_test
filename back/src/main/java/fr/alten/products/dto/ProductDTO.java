package fr.alten.products.dto;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
@Getter
@Setter
public class ProductDTO {
    int id ;
    String code;
    String name;
    String description;
    int price;
    int quantity;
    String inventoryStatus;
    String category;
    String image;
}
