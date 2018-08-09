package com.java.oop.design;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RandomNumberTest {

    @Test
    public void test() {
        RandomNumber randomNumber=new RandomNumber();
        /*Random random=new Random() {
            public int nextInt(int bound) {
                return 5;
            }
        };*/
        
        Random random= new Random5();
        assertEquals(5, randomNumber.generate(random));
    }

}

//@Override by method
class Random5 extends Random {

    @Override
    public int nextInt(int bound) {
        return 5;
    }
    
}
