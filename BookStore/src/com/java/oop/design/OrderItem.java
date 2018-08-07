package com.java.oop.design;

public class OrderItem {
    private int id;
    private Book book;
    private int quantity;

    
    public OrderItem(int id, Book book) {
       this(id,book,0);
    }
    

    public OrderItem(int id, Book book, int quantity) {
        super();
        this.id = id;
        this.book = book;
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void addItem(int quantity) {
        this.quantity++;
    }
    public void removeItem(int quantity) {
        this.quantity--;
    }

    @Override
    public String toString() {
        return String.format("OrderItem [id=%s, book=%s, quantity=%s]", id, book, quantity);
    }
    
    

}
