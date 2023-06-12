package com.zeecoder.springbootdemo.repository;

import com.zeecoder.springbootdemo.domain.Order;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    //With @NamedEntityGraph
    @Override
    @EntityGraph(value = "Order.items")
    List<Order> findAll();


    //Without @NamedEntityGraph
    /*@Override
    @EntityGraph(attributePaths// = {"items"})
    List<Order> findAll();*/


}
