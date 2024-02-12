package com.bigbasket.bigbasketapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bigbasket.bigbasketapi.model.ProductModel;
import com.bigbasket.bigbasketapi.service.ProductService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ProductModel getpProductModel() {
        return new ProductModel();
    }

    @GetMapping("/getAllProducts")
    public List<ProductModel> getMethodName() {
        return productService.getAllProducts();
    }

    @PostMapping("/CreateProduct")
    public boolean createProduct(@RequestBody ProductModel productModel) {
        productService.createProduct(productModel);
        return true;
    }
    @PostMapping("/CreateAllProduct")
    public boolean createAllProduct(@RequestBody List<ProductModel> productModel) {
        productService.createAllProduct(productModel);
        return true;
    }
    
    @GetMapping("/GetAllProductsByCategoryId/{categoryId}")
    public List<ProductModel> getAllProductsByCategoryId(@PathVariable int categoryId) {
        return productService.getAllProductByCategoryId(categoryId);
    }

    @DeleteMapping("/DeleteProductById/{id}")
    public  boolean deleteProductById(@PathVariable int id){
        productService.deleteProductById(id);
        return true;
    }
    @PutMapping("/UpdateProduct/{id}")
    public boolean updateProduct(@PathVariable int id, @RequestBody ProductModel updatedProduct) {
        productService.updateProduct(id,updatedProduct);
        return true;
    }
    
    
}
