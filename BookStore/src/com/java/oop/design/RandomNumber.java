package com.java.oop.design;

import java.util.Random;

public class RandomNumber {
    public int generate(Random random ) {
      //  Random random = new Random();
        return random.nextInt(10);
    }
}
