package com.bigbasket.bigbasketapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bigbasket.bigbasketapi.model.OrderModel;
import com.bigbasket.bigbasketapi.repository.OrderRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }

    public List<OrderModel> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<OrderModel> getOrderById(int id) {
        return orderRepository.findById(id);
    }

    public OrderModel createOrder(OrderModel order){
        return orderRepository.save(order);
    }
    public List<OrderModel> createOrders(List<OrderModel> orderModels) {
        return orderRepository.saveAll(orderModels);
    }
    public OrderModel updateOrder(int id, OrderModel updatedOrder) {
        OrderModel existingData = orderRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found with id: " + id));

                existingData.setSaleId(updatedOrder.getSaleId());
                //existingData.setOrderStatus(updatedOrder.getOrderStatus());
        return orderRepository.save(existingData);
 }

    public void deleteOrderById(int id) {
        orderRepository.deleteById(id);
    }
}
