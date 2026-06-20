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


        return new ArrayList<>();
    }

    //Create new function to get Product by ID

}
