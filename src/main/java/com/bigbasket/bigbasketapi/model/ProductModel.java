package com.bigbasket.bigbasketapi.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<CartModel> carts;
    
    private String productSku, productName, productShortName,productDescription, createdDate,deliveryTimeSpan,productImageUrl;
    private int productPrice,categoryId;
    public ProductModel(int productId, String productSku, String productName, String productShortName,
            String productDescription, String createdDate, String deliveryTimeSpan, String productImageUrl,
            int productPrice, int categoryId) {
        this.productId = productId;
        this.productSku = productSku;
        this.productName = productName;
        this.productShortName = productShortName;
        this.productDescription = productDescription;
        this.createdDate = createdDate;
        this.deliveryTimeSpan = deliveryTimeSpan;
        this.productImageUrl = productImageUrl;
        this.productPrice = productPrice;
        this.categoryId = categoryId;
    }
    public ProductModel() {
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductSku() {
        return productSku;
    }
    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductShortName() {
        return productShortName;
    }
    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public String getDeliveryTimeSpan() {
        return deliveryTimeSpan;
    }
    public void setDeliveryTimeSpan(String deliveryTimeSpan) {
        this.deliveryTimeSpan = deliveryTimeSpan;
    }
    public String getProductImageUrl() {
        return productImageUrl;
    }
    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    @Override
    public String toString() {
        return "ProductModel [productId=" + productId + ", productSku=" + productSku + ", productName=" + productName
                + ", productShortName=" + productShortName + ", productDescription=" + productDescription
                + ", createdDate=" + createdDate + ", deliveryTimeSpan=" + deliveryTimeSpan + ", productImageUrl="
                + productImageUrl + ", productPrice=" + productPrice + ", categoryId=" + categoryId + "]";
    }

    
}
