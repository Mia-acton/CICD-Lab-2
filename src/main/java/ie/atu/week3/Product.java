package ie.atu.week3;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Lombok generates getters, setters, etc.
@AllArgsConstructor // Lombok generates an all-arguments constructor
public class Product {
    // Ensures productName is not null/empty and must have between 2 and 50 characters
    @NotBlank
    @Size(min = 2, max = 50)
    private String productName;
    // Price must be positive, must not be null, and must have a minimum value of 0.01
    @Positive
    @NotNull
    @DecimalMin("0.01")
    private double price;
}
