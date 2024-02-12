package com.bigbasket.bigbasketapi.controller;

import com.bigbasket.bigbasketapi.model.CartModel;
import com.bigbasket.bigbasketapi.model.ProductModel;

public class CartAndProductDetails {
    private int cartId;
    private int quantity;
    private int custId;
    private int productId;
    private String productName;
    private String productShortName;
    private String deliveryTimeSpan;
    private String productImageUrl;
    private double productPrice;
    private int categoryId;

    public CartAndProductDetails(CartModel cart, ProductModel product) {
        this.cartId = cart.getCartId();
        this.quantity = cart.getQuantity();
        this.custId = cart.getCustomer().getCustId();
        this.productId = product.getProductId();
        this.productName = product.getProductName();
        this.productShortName = product.getProductShortName();
        this.deliveryTimeSpan = product.getDeliveryTimeSpan();
        this.productImageUrl = product.getProductImageUrl();
        this.productPrice = product.getProductPrice();
        this.categoryId = product.getCategoryId();
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    public CartAndProductDetails() {
    }

    @Override
    public String toString() {
        return "CartAndProductDetails [cartId=" + cartId + ", quantity=" + quantity + ", custId=" + custId
                + ", productId=" + productId + ", productName=" + productName + ", productShortName=" + productShortName
                + ", deliveryTimeSpan=" + deliveryTimeSpan + ", productImageUrl=" + productImageUrl + ", productPrice="
                + productPrice + ", categoryId=" + categoryId + "]";
    }

    
    

    
}