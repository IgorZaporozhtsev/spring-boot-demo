package com.zeecoder.springbootdemo.repository;

import com.zeecoder.springbootdemo.domain.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class CustomOrderRepositoryImpl implements CustomOrderRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Order> findAllCustom() {
        var query = entityManager.createQuery("from Order");
        var entityGraph = entityManager.createEntityGraph(Order.class);
        entityGraph.addAttributeNodes("items");
        query.setHint("javax.persistence.fetchgraph", entityGraph);
        return query.getResultList();
    }
}
