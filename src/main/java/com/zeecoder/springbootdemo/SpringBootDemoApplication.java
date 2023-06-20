package com.zeecoder.springbootdemo;

import com.zeecoder.springbootdemo.scope_prototype.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootDemoApplication {

    private final Customer customer;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            prototypeDemo();
        };
    }

    private void prototypeDemo() {
        //check prototype
        for (int i = 0; i < 3; i++) {
            System.out.println(customer.execute());
        }
    }
}
