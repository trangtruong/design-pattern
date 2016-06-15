package com.selfie.demo.pattern.facade;

/**
 * Created by Trang Truong(sgtt003) on 6/2/2016.
 */
public class ShapeMarker {
    protected Shape circle;
    protected Shape square;
    protected Shape rectangle;

    public ShapeMarker() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
