package com.java.oop.design;

public class BookStore {

    public static void main(String[] args) {
        
        Book book1=new Book("First Book", 8);
        Book book2=new Book("Second Book", 8);
        
        OrderItem orderItem1= new OrderItem(1,book1);
        OrderItem orderItem2= new OrderItem(2,book2);
        
        DiscountCalculator discount=new DiscountCalculator();
        OrderBuilder orderBuilder=new OrderBuilder()
                .setId(1)
                .addItem(orderItem1)
                .addItem(orderItem2)
                ;
        
        Order order= orderBuilder.Build();
        order.calculateTotalPrice();
        order.calculateDiscountPrice();
        order.calculateNetPrice();
        
        
        System.out.println("TotalPrice : "+order.getTotalPrice());
        System.out.println("DiscountPrice: "+ order.getDiscountPrice());
        System.out.println("NetPrice: "+ order.getNetPrice());
        

    }

}
