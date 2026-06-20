package com.dilshan.java.service;

import com.dilshan.java.modal.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts() {
        // In a real application, this method would interact with a database to retrieve products.
        // For demonstration purposes, we will return a hardcoded list of products.
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Product A");
        product1.setPrice(10.99);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Product B");
        product2.setPrice(19.99);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        return products;
    }

    //Create new function to get Product by ID
    public Product getProductById(Integer id) {
        if (id == null || id <= 0) {
            System.out.println("Invalid product ID: " + id);
            throw new IllegalArgumentException("Product ID must be a positive integer.");
        }
        System.out.println("ProductService: Getting product with ID: " + id);
        Product product = new Product();
        product.setId(id);
        product.setName("Product " + id);
        product.setPrice(9.99 + id); // Just a dummy price based on ID
        return product;
    }

}
