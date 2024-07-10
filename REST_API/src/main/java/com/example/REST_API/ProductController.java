package com.example.REST_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    // mapping the getProduct() method to /product
    @GetMapping(value = "/product")
    public List<Product> getProduct() {

        // find all the products
        List<Product> products = productService.findAll();

        // returns product list
        return products;
    }
}