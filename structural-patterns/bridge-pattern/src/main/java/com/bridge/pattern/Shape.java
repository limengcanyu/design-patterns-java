package com.bridge.pattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/8
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
