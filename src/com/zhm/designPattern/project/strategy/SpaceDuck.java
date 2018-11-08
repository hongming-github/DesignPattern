package com.zhm.designPattern.project.strategy;

import com.zhm.designPattern.project.strategy.impl.FlyWithRocket;

/**
 * Created by zhm on 2018/8/21.
 */
public class SpaceDuck extends Duck {
    public SpaceDuck() {
        super();
        super.setFlyingStrategy(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我在空中");
    }
}
