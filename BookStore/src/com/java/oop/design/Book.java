package com.java.oop.design;

public class Book {
    private String name;
    private double price;
    
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book createNewBookWithName(String name) {
        Book book =new Book(name,8);
        return book;
    }
    
    public Book createNewBookWithNameAndPrice(String name,double price) {
        Book book =new Book(name,price);
        return book;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    
    
    
    
}
