package com.java.oop.design;

import java.util.ArrayList;
import java.util.List;

public class LambdasDemo {
    public static void main(String[] args) {
        LambdasDemo LambdasDemo=new LambdasDemo();
        
        LambdasDemo.isForEach();
        
    }

    private void isForEach() {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
       // number.forEach(System.out::println);
        number.stream().filter(i -> i%2==0).map(i-> i*2).forEach(System.out::println);
        
    }
}
