package com.prototype.pattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
