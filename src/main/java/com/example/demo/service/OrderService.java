package com.example.demo.service;

import com.example.demo.data.entities.orderEntity;
import com.example.demo.data.resp.APIresponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface OrderService {
    public ResponseEntity<APIresponse> createOrder(orderEntity order);
}
