package com.zhm.designPattern.project.proxy;

/**
 * Created by zhm on 2018/6/30.
 */
//聚合
public class CarLogProxy implements Movable {
    private Movable movable;

    public CarLogProxy(Movable movable) {
        super();
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("日至开始...");
        movable.move();
        System.out.println("日志结束");
    }
}
