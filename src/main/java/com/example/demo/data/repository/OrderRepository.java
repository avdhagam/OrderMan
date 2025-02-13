package com.example.demo.data.repository;


import com.example.demo.data.entities.orderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<orderEntity, Long> {
}

