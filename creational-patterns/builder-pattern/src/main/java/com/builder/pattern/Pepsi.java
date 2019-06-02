package com.builder.pattern;

/**
 * Comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
