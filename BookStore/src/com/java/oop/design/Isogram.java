package com.java.oop.design;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

    public boolean  isIsogram(String word) {
        
        //word.indexOf(str);
        boolean isIsogram=true;
        String wordNew=word.replaceAll("-", "")
                .replaceAll(" ", "")
                .toLowerCase();
        
        //int size=wordNew.length();
        Set<Character> str=new HashSet<>();
        for (int i = 0; i < wordNew.length(); i++) {
            //str.put(String.valueOf(wordNew.charAt(i)), i);
            if(!str.add(wordNew.charAt(i))) {
                isIsogram=false;
            }
        }
        /*if(size == str.size()) {
            isIsogram=true;
        }*/
        
        return isIsogram;
    }
}
