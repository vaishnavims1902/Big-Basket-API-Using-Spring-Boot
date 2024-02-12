package com.bigbasket.bigbasketapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigbasket.bigbasketapi.model.CartModel;

@Repository
public interface CartRepository extends JpaRepository <CartModel,Integer> {

    List<CartModel> findByCustomerCustId(int customerId);
    
}
