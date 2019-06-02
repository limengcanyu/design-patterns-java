package com.builder.pattern;

/**
 * Comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
