package com.abstractfactorypattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
