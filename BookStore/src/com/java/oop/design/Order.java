package com.java.oop.design;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
    // properties
    private double id;
    private double totalPrice;
    private double discountPrice;
    private double netPrice;
    private List<OrderItem> items=new ArrayList<OrderItem>();
    private Date orderdate;

    public void setId(double id) {
        this.id = id;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public double getId() {
        return id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Date getOrderdate() {
        return orderdate;
    }
    
    public double calculateTotalPrice() {
       double totalPrice=0;
        for (OrderItem orderItem : items) {
            totalPrice+=orderItem.getBook().getPrice();
        }
        this.totalPrice=totalPrice;
        return totalPrice;
    }
    
    public double calculateDiscountPrice() {
        for (OrderItem orderItem2 : items) {
            System.out.println(orderItem2);
        }
        
        this.discountPrice=this.totalPrice*0.05;
         return this.discountPrice;
     }
    
    public double calculateNetPrice() {
        this.netPrice=this.totalPrice-this.discountPrice;
        
         return this.netPrice;
     }


    
    

}
