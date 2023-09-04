package com.example;

import java.util.Random;

public class Food {
    private int x;
    private int y;

    public void generate() {
        Random random = new Random();
        x = random.nextInt(10);
        y = random.nextInt(10);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}