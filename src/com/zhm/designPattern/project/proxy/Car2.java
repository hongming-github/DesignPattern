package com.zhm.designPattern.project.proxy;

/**
 * Created by zhm on 2018/6/30.
 */
//继承w
public class Car2 extends Car {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶...");
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("结束行驶...汽车行驶时间" + (endTime - startTime) + "毫秒");
    }
}
