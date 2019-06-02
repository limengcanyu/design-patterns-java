package com.abstractfactorypattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
