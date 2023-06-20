package com.zeecoder.springbootdemo;

import com.zeecoder.springbootdemo.conditional.NotificationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootDemoApplication {

    private final NotificationSender notificationSender;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            conditionalOnPropertyDemo();
        };
    }

    private void conditionalOnPropertyDemo() {
        //check ConditionalOnProperty
        System.out.println("NotificationSender send " + notificationSender.send("Hello"));
    }


}
