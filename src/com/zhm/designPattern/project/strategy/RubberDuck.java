package com.zhm.designPattern.project.strategy;

import com.zhm.designPattern.project.strategy.impl.FlyNoWay;

/**
 * Created by zhm on 2018/8/21.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }

    public void quack(){
        System.out.println("嘎~嘎~嘎");
    }
}
