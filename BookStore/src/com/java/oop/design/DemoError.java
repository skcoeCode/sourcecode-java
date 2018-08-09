package com.java.oop.design;

public class DemoError {
    
    public static void main(String[] args) {
        DemoError demoError=new DemoError();
        demoError.processProactive(0);
        demoError.processReactive(0);
    }
    private double processReactive(int input) {
        try {
            return 10/input;
        }catch (Exception e) {
           System.out.println("Error");
        }
        return -1;
        
    }
    public void process1() {
        try {
            Class.forName("xxxx");
        } catch (ClassNotFoundException e) {
           // e.printStackTrace();
        }
    }
    public double process2() {
        return 10/0;
    }
    //proactive
    public double processProactive(int input) {
        
        //Fail fast
        if(input==0) {
            return -1;
        }
        
        return 10/input;
    }


}
