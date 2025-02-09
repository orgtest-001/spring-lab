package com.rojojun.springadvanced.app.proxy.v1;

import org.springframework.core.annotation.Order;

public class OrderServiceV1Impl implements OrderServiceV1{
    private final OrderRepositoryV1 orderRepositoryV1;

    public OrderServiceV1Impl(OrderRepositoryV1 orderRepositoryV1) {
        this.orderRepositoryV1 = orderRepositoryV1;
    }

    @Override
    public void orderItem(String itemId) {
        orderRepositoryV1.save(itemId);
    }
}
