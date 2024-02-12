package com.bigbasket.bigbasketapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Cart")
public class CartModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

   // private int custId;
    //private int productId;
    private int quantity;
    private String addedDate;

    @ManyToOne
   @JoinColumn(name = "custId")
   private UserModel customer;
   @ManyToOne
   @JoinColumn(name = "productId")
   private ProductModel product;

    public ProductModel getProduct() {
    return product;
}

public void setProduct(ProductModel product) {
    this.product = product;
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

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public UserModel getCustomer() {
        return customer;
    }

    public void setCustomer(UserModel customer) {
        this.customer = customer;
    }

    

    public CartModel(int cartId, int quantity, String addedDate, UserModel customer, ProductModel product) {
        this.cartId = cartId;
        this.quantity = quantity;
        this.addedDate = addedDate;
        this.customer = customer;
        this.product = product;
    }

    public CartModel() {
    }

    @Override
    public String toString() {
        return "CartModel [cartId=" + cartId + ", quantity=" + quantity + ", addedDate=" + addedDate + ", customer="
                + customer + ", product=" + product + "]";
    }

    
    
}
