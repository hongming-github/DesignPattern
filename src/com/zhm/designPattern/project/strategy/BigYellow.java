package com.zhm.designPattern.project.strategy;

import com.zhm.designPattern.project.strategy.impl.FlyNoWay;

/**
 * Created by zhm on 2018/8/21.
 */
public class BigYellow extends Duck {
    public BigYellow() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }

    public void quack(){
        System.out.println("嘎~嘎~嘎");
    }
}
