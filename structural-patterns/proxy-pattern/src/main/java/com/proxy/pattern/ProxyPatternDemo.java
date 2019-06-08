package com.proxy.pattern;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/8
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println();
        // 图像不需要从磁盘加载
        image.display();
    }
}
