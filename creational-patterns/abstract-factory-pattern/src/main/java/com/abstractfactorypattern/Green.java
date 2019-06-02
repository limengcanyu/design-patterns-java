package com.abstractfactorypattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
