package com.selfie.demo.pattern.bridge;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redShape = new Circle(100, 100, 10, new RedCircle());
        Shape greenShape = new Circle(100, 100, 10, new GreenCircle());
        redShape.draw();
        greenShape.draw();
    }
}
