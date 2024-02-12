package com.bigbasket.bigbasketapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bigbasket.bigbasketapi.model.ProductModel;
import com.bigbasket.bigbasketapi.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository =productRepository;
    }

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<ProductModel> getProductById(int id) {
        return productRepository.findById(id);
    }

    public ProductModel createProduct(ProductModel product){
        return productRepository.save(product);
    }
    public List<ProductModel> createAllProduct(List<ProductModel>  product){
        return productRepository.saveAll(product);
    }

    public List<ProductModel> getAllProductByCategoryId(int id){
        return productRepository.findAllBycategoryId(id);
    }

    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

    public ProductModel updateProduct(int id, ProductModel updatedProduct) {
        ProductModel existingData = productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + id));

                existingData.setProductName(updatedProduct.getProductName());
                existingData.setProductSku(updatedProduct.getProductSku());
                existingData.setProductPrice(updatedProduct.getProductPrice());
                existingData.setProductShortName(updatedProduct.getProductShortName());
                existingData.setProductDescription(updatedProduct.getProductDescription());
                existingData.setDeliveryTimeSpan(updatedProduct.getDeliveryTimeSpan());
                existingData.setCategoryId(updatedProduct.getCategoryId());
                existingData.setProductImageUrl(updatedProduct.getProductImageUrl());

        return productRepository.save(existingData);
    }
}
