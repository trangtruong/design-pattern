package com.selfie.demo.pattern.facade;

/**
 * Created by Trang Truong(sgtt003) on 6/2/2016.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMarker marker = new ShapeMarker();
        marker.drawCircle();
        marker.drawSquare();
        marker.drawRectangle();
    }
}
