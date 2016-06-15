package com.selfie.demo.pattern.bridge;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
