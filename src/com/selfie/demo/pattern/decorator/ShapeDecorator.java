package com.selfie.demo.pattern.decorator;

/**
 * Created by Trang Truong(sgtt003) on 6/2/2016.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
