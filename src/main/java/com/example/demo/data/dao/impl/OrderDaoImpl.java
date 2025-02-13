package com.example.demo.data.dao.impl;

import com.example.demo.data.dao.OrderDao;
import com.example.demo.data.entities.orderEntity;
import com.example.demo.data.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
@RequiredArgsConstructor
@Slf4j
public class OrderDaoImpl implements OrderDao {
    private final OrderRepository orderRepository;


    public void createOrder(orderEntity order){
        orderRepository.save(order);
    }
}
