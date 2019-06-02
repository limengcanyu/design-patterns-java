package com.builder.pattern;

/**
 * Comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
