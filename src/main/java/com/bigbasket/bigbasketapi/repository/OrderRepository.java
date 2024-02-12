package com.bigbasket.bigbasketapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigbasket.bigbasketapi.model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel,Integer> {

}