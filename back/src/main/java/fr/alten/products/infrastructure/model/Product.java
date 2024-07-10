package fr.alten.products.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

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
