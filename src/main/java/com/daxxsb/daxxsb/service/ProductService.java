package com.daxxsb.daxxsb.service;

import com.daxxsb.daxxsb.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;  

@Service
public class ProductService {
    
    private List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }
    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public Product addProduct(String name, double price) {
        Product newProduct = new Product(name, price);
        products.add(newProduct);
        return newProduct;
    }
}
