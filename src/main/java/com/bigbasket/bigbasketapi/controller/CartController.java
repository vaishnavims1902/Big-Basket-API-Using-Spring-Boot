package com.bigbasket.bigbasketapi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.bigbasket.bigbasketapi.model.CartModel;

import com.bigbasket.bigbasketapi.service.CartService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {
    @Autowired
    private CartService  cartService;

    @GetMapping("/cart")
    public CartModel cart() {
        return new CartModel();
    }
    
    
    @PostMapping("/AddToCart")
    public ApiResponse<CartModel> addToCart(@RequestBody CartModel cart) {
        CartModel addedCart= cartService.addProductToCart(cart);
        if (addedCart != null){
            ApiResponse<CartModel> response = new ApiResponse<>(true, "Added successfully", addedCart);
            return response;
        }
        else{
            ApiResponse<CartModel> response = new ApiResponse<>(false, "Not Added", null);
            return response;
        }
    }
     @GetMapping("/GetCartByCustomerId/{custId}")
     public List<CartAndProductDetails> getCartByCustomerId(@PathVariable int custId) {
        
          List<CartModel> cartDetails = cartService.getCartDetailsByCustomerId(custId);

        // You may need to map the CartModel and ProductModel to a DTO to avoid serialization issues
        List<CartAndProductDetails> result = cartDetails.stream()
                .map(cart -> new CartAndProductDetails(cart, cart.getProduct()))
                .collect(Collectors.toList());

        return result;
     }
     @DeleteMapping("/RemoveFromCart/{id}")
     public boolean removeCart(@PathVariable int id){
        cartService.removeCart(id);
        return true;
     }
    
}
