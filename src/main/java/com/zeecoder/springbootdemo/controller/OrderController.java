package com.zeecoder.springbootdemo.controller;

import com.zeecoder.springbootdemo.domain.Order;
import com.zeecoder.springbootdemo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @GetMapping
    @Transactional
    public void getAll(){
//        var order = orderRepository.getOne(1L);
//        order.getItems().forEach( item -> System.out.println(item.getName()));

        var orders = orderRepository.findAll();
        for (Order order1 : orders) {
            if (order1.getItems().size() > 1) {
                System.out.println(" -------------  plus Query");
            }
        }
    }
}
