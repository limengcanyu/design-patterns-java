package com.builder.pattern;

/**
 * Comment
 *
 * @author rock
 * @date 2019/6/2
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
