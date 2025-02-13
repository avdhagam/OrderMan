package com.example.demo.data.dao;

import com.example.demo.data.entities.orderEntity;
import org.springframework.stereotype.Service;

@Service
public interface OrderDao {
void createOrder(orderEntity order);
}
