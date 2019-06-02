package com.builder.pattern;

/**
 * Comment
 *
 * @author rock
 * @date 2019/6/2
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
