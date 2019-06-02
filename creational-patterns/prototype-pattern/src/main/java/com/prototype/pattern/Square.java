package com.prototype.pattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
