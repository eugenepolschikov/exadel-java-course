package com.exadel.chat;

/**
 * Created by alex on 2014-12-09.
 */
public abstract class Shape {

    final public void getShapeName () {
        System.out.println("Shape");
    }

    abstract void additionalMethod();
}
