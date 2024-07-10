package fr.alten.products.application.dto;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
public class ProductDTO {
    int id ;

    @NotNull
    String code;

    @NonNull
    String name;

    @NonNull
    String description;

    int price;

    int quantity;

    @NonNull
    String inventoryStatus;

    String category;
    String image;
}
