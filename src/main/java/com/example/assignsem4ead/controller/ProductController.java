package com.example.assignsem4ead.controller;

import com.example.assignsem4ead.entity.Account;
import com.example.assignsem4ead.entity.Product;
import com.example.assignsem4ead.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/nxp/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/getProducts", method = RequestMethod.POST)
    public List<Product> login(@RequestParam String token) {
        return productService.getListProd(token);
    }

    @RequestMapping(value = "/getInfoProduct/{id}", method = RequestMethod.GET)
    public Product login(@PathVariable Long id) {
        return productService.getInfoProduct(id);
    }
}
