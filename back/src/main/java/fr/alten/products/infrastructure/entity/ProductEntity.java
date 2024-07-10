package fr.alten.products.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String code;

    @Column (nullable = false)
    private String description;

    @Column (nullable = false)
    private int price;

    @Column (nullable = false)
    private int quantity;

    @Column (name = "inventory_status", nullable = false)
    private String inventoryStatus;

    @Column
    private String category;

    @Column
    private String image;



}
