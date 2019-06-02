package com.prototype.pattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
