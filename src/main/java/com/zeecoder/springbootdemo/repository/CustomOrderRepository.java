package com.zeecoder.springbootdemo.repository;

import com.zeecoder.springbootdemo.domain.Order;

import java.util.List;

public interface CustomOrderRepository {
    List<Order> findAllCustom();
}
