package com.builder.pattern;

/**
 * 步骤 2
 * 创建实现 Packing 接口的实体类。
 *
 * @author rock
 * @date 2019/6/2
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
