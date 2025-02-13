package com.example.demo.service.impl;

import com.example.demo.data.dao.OrderDao;
import com.example.demo.data.entities.orderEntity;
import com.example.demo.data.resp.APIresponse;
import com.example.demo.service.OrderService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private  OrderDao orderDao;

    @Override
    public ResponseEntity<APIresponse> createOrder(orderEntity order){
        APIresponse apiResponse = new APIresponse();

        apiResponse.setStatus(HttpStatus.OK.value());
        apiResponse.setSuccess(true);
        apiResponse.setMessage("User signed up successfully");
        apiResponse.setService("ORDER-" + HttpStatus.OK.value());
        apiResponse.setData(null);

        orderDao.createOrder(order);

        return ResponseEntity.ok().body(apiResponse);

    }
}
