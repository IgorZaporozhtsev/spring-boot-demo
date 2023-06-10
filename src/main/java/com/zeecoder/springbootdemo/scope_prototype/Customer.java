package com.zeecoder.springbootdemo.scope_prototype;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Customer/* implements ApplicationContextAware */{

    // https://apurvsheth.medium.com/spring-boot-bean-scope-is-prototype-really-a-prototype-b7c32e05ce89
    private final Products products;

    //1st approach
    @Lookup
    public Products execute() {
        return products;
    }

 /*
    private final ApplicationContext applicationContext;

    public Products execute() {
        Products products = applicationContext.getBean(Products.class);
        var provide = products.provide();
        return products;
    }
/*
    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }*/
}
