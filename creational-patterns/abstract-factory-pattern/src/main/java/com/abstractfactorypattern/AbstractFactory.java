package com.abstractfactorypattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/2
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
