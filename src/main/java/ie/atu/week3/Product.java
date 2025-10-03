package ie.atu.week3;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank
    @Size(min = 2, max = 50)
    private String productName;
    @Positive
    @DecimalMin("0.01")
    private double price;
}
