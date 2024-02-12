package com.bigbasket.bigbasketapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigbasket.bigbasketapi.model.OrderModel;
import com.bigbasket.bigbasketapi.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    @GetMapping("/Order")
    public OrderModel order() {
        return new OrderModel();
    }
    @GetMapping("/GetOrders")
    public List<OrderModel> getOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("GetAllSaleByCustomerId/{id}")
    public Optional<OrderModel> searchOrder(@PathVariable int id) {
        return orderService.getOrderById(id);
    }
    
    @PostMapping("/PlaceOrder")
    public  boolean AddOrder(@RequestBody OrderModel order) {
        orderService.createOrder(order);
        return true;
    }
    @PostMapping("/AddOrders")
    public boolean addOrders(@RequestBody List<OrderModel>  orders) {
        orderService.createOrders(orders);
        return true;
    }
    @PutMapping("/UpdateOrder/{id}")
    public boolean updateOrder(@PathVariable int id, @RequestBody OrderModel order) {
        orderService.updateOrder(id, order);
        return true;
    }
    @DeleteMapping("/DeleteOrder/{id}")
    public boolean deleteOrder(@PathVariable int id){
        orderService.deleteOrderById(id);
        return true;
    }
    
    
    
    
}
