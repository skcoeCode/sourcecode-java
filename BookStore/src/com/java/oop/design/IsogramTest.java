package com.java.oop.design;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsogramTest {

    @Test
    public void test() {
        Isogram isogram=new Isogram();
        assertEquals(true,  isogram.isIsogram("lumberjacks"));
    }
    @Test
    public void test1_2() {
        Isogram isogram=new Isogram();
        assertEquals(true,  isogram.isIsogram("lum ber jacks"));
    }
    @Test
    public void test1_3() {
        Isogram isogram=new Isogram();
        assertEquals(true,  isogram.isIsogram("lum-ber-jacks"));
    }
    
    @Test
    public void test2() {
        Isogram isogram=new Isogram();
        assertEquals(false,  isogram.isIsogram("mmmmmmmm"));
    }
    
    @Test
    public void test3() {
        Isogram isogram=new Isogram();
        assertEquals(false,  isogram.isIsogram("mmm-mmm-mm"));
    }
    
    @Test
    public void test4() {
        Isogram isogram=new Isogram();
        assertEquals(false,  isogram.isIsogram("mmm mmm mm"));
    }

}
