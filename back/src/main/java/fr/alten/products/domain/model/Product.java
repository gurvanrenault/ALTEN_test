package fr.alten.products.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
public class Product {
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
