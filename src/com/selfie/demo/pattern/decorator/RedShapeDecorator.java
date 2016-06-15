package com.selfie.demo.pattern.decorator;

/**
 * Created by Trang Truong(sgtt003) on 6/2/2016.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShaoe) {
        System.out.println("Border color: RED");
    }
}
