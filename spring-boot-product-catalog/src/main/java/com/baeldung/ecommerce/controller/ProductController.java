package com.baeldung.ecommerce.controller;

import com.baeldung.ecommerce.model.Product;
import com.baeldung.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Get a list of all products
     * @return
     */
    @GetMapping(value = { "", "/get" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
    /**
     * Create a Product
     */
    @PostMapping(value = { "", "/add" })
    public  Product addProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    /**
     * Update a Product
     */
    @PostMapping(value = { "", "/update" })
    public  Product updateProduct(@RequestBody Product product) {
        return productService.save(product);
    }
}
