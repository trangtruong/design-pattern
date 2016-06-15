package com.selfie.demo.pattern.bridge;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x = " + x + ", y = " + y);
    }
}
