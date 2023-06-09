package com.testeSiteWare.ecommerce.controller;


import com.testeSiteWare.ecommerce.model.Product;
import com.testeSiteWare.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

    /*@GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) throws NotFoundException {
        Optional<Product> productOptional = Optional.ofNullable(productService.getProduct(id));
        if (productOptional.isPresent()) {
            return productOptional.get();
        } else {
            throw new NotFoundException("Product not found with ID: " + id);
        }
    }*/


   /* @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }*/
}