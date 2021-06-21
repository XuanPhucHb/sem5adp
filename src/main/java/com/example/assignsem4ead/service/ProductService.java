package com.example.assignsem4ead.service;

import com.example.assignsem4ead.controller.AccountController;
import com.example.assignsem4ead.entity.Product;
import com.example.assignsem4ead.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getListProd(String token){
        return productRepository.findAll();
    }

    public Product getInfoProduct(Long id) {
        return  productRepository.getOne(id);
    }
}
