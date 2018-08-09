package com.java.oop.design;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        //interface
       RandomNumber randomNumber=new RandomNumber();
       System.out.println(randomNumber.generate(new Random()));

    }

}
