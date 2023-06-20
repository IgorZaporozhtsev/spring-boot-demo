package com.zeecoder.springbootdemo;

import com.zeecoder.springbootdemo.domain.Order;
import com.zeecoder.springbootdemo.repository.ItemRepository;
import com.zeecoder.springbootdemo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootDemoApplication {

    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            nPlusOneSelect();

        };
    }

    public void nPlusOneSelect() {
        var orders = orderRepository.findAll();
        for (Order order : orders) {
            System.out.println(order.getItems());
        }

    }

}
