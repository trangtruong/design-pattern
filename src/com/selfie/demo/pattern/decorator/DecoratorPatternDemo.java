package com.selfie.demo.pattern.decorator;

/**
 * Created by Trang Truong(sgtt003) on 6/2/2016.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redShapeDecorator = new RedShapeDecorator(new Circle());
        Shape recShapeDecorator = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle w normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redShapeDecorator.draw();
        System.out.println("\nRectangle of red border");
        recShapeDecorator.draw();
    }
}
