package com.exadel.chat;

/**
 * Created by alex on 2014-12-09.
 */
final public class Circle extends Shape {

    public int radius;
    public static String color;

    public final String NAME = "";

    public Circle() {

    }

    public void setColor(String colorName) {
        color = colorName;
    }

    public String getColor() {
        return color;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getArea() {
        return radius;
    }

    @Override
    void additionalMethod() {

    }
}
