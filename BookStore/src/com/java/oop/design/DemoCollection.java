package com.java.oop.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCollection {
    public static void main(String[] args) {
        
        Map<String ,Integer> employyee = new HashMap<>();
        employyee.put("j", 1);
        if(employyee.containsKey("j")) {
            System.out.println("Key not Found");
        }
        
        Set<String> keys = employyee.keySet();
        
        for (String k : keys) {
            System.out.printf("%s --> %d\n",k,employyee.get(k));
        }
        
        //array fix length
        int [] number= {1,2,3};
        for (int i : number) {
            System.out.println(i);
        }
       
        //array dynamic length
        
        //JDK > 1.7
        List<Integer>  numberList=new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        
        

    }
}
