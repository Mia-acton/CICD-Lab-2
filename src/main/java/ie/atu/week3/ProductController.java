package ie.atu.week3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product") // Base path for all endpoints in this controller
@RestController // Used for JSON responses
public class ProductController {
    // In-memory list to store products (acts like a temporary database)
    List<Product> myList = new ArrayList<>();

    // Test endpoint
    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    // Returns all stored products
    @GetMapping("/getproducts")
    // Create a Product here
    public List<Product>  getProducts()
    {
        Product myProduct= new Product("Tv", 499); // Test code
        return myList; // Returns whatever is in myList (initially empty)
    }
    // Adds a product from request body (validated by @Valid)
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct)
    {
        myList.add(myProduct); // Stores the product in memory
        return myProduct; // Returns the same product in the response
    }
    // Returns the total number of stored products
    @GetMapping("/count")
    public int getProductCount()
    {
        return myList.size();
    }
}
