package com.builder.pattern;

/**
 * 步骤 3
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 *
 * @author rock
 * @date 2019/6/2
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
