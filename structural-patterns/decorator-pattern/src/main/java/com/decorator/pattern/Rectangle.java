package com.decorator.pattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/8
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
