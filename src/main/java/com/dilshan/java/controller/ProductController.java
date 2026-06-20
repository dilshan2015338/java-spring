package com.dilshan.java.controller;

import com.dilshan.java.modal.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    //Step 1: Use constructor injection to inject the ProductService

    @GetMapping("/products") //API is /products
    public List<Product>  getAllProducts() {
        //Step 2: Call the ProductService to get the list of products and return it
        return null; // Replace with actual implementation
    }

    //Get by path variable
    @GetMapping("/products/{id}") //API is /products/{id}
    public Product getProductById(@PathVariable Integer id) {
        //Step 3: Create a new function to get a product by its ID using the ProductService
        System.out.println("Received request to get product with ID: " + id);
        return null; // Replace with actual implementation
    }

    //Get by query parameter
    @GetMapping("/getProductById") //API is /getProductById?id=1
    public Product getProductById2(@RequestParam Integer id) {
        //Step 3: Create a new function to get a product by its ID using the ProductService
        System.out.println("Received request to get product with ID: " + id);
        return null; // Replace with actual implementation
    }

    //Get by request body (POJO)
    @GetMapping("/getProductByPOJO") //API is /getProductByPOJO with a JSON body containing the product ID
    public Product getProductByPOJO(@RequestBody Product product) {
        //Step 3: Create a new function to get a product by its ID using the ProductService
        System.out.println("Received request to get product with ID: " + product.getId());
        return null; // Replace with actual implementation
    }

}
