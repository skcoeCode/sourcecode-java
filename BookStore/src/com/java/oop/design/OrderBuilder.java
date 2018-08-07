package com.java.oop.design;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private Order order = new Order();

    public OrderBuilder setId(double id) {
        order.setId(id);
        return this;
    }

    public OrderBuilder addItem(OrderItem orderItem) {
        order.getItems().add(orderItem);
        return this;
    }

    public OrderBuilder removeItem(String id) {
        //double price=0;
        List<OrderItem> orderItemNew = new ArrayList<OrderItem>();
        for (OrderItem orderItem : order.getItems()) {
            if (!id.equals(orderItem.getId())) {
                orderItemNew.add(orderItem);
            }
        }
       
        order.setItems(orderItemNew);
        return this;
    }
    public OrderBuilder calDiscount(DiscountCalculator discount) {
       List<OrderItem> orderItem = order.getItems();
       
        for (OrderItem orderItem2 : orderItem) {
            System.out.println(orderItem2);
        }
        return this;
    }

    public Order Build() {
        return order;
    }

}
