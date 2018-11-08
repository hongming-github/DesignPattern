package com.zhm.designPattern.project.proxy;

/**
 * Created by zhm on 2018/6/30.
 */
//聚合
public class CarTimeProxy implements Movable {
    private Movable movable;

    public CarTimeProxy(Movable movable) {
        super();
        this.movable = movable;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶...");
        movable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("结束行驶...汽车行驶时间" + (endTime - startTime) + "毫秒");
    }
}
