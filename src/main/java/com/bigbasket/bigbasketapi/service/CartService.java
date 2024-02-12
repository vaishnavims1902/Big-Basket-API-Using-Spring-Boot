package com.bigbasket.bigbasketapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bigbasket.bigbasketapi.model.CartModel;
import com.bigbasket.bigbasketapi.repository.CartRepository;

@Service
public class CartService {
    private final CartRepository cartRepository;
    public CartService(CartRepository cartRepository){
        this.cartRepository=cartRepository;
    }
    public  CartModel addProductToCart(CartModel cartModel) {
        return cartRepository.save(cartModel);
    }
    public List<CartModel> getCartDetailsByCustomerId(int customerId) {
       
        return cartRepository.findByCustomerCustId(customerId);
    }
    public void removeCart(int id) {
        cartRepository.deleteById(id);
    }
    
}
