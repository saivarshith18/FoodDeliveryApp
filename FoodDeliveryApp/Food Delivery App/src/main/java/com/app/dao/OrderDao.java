package com.app.dao;

import java.util.List;

import com.app.models.Order;

public interface OrderDao {
    
    void addOrder(Order order);
    Order getOrder(int orderId);
    void updateOrder(Order order);
    void deleteOrder(int orderId);
    List<Order> getAllOrders();
}
