package com.zhm.designPattern.project.strategy.impl;

import com.zhm.designPattern.project.strategy.FlyingStrategy;

/**
 * Created by zhm on 2018/8/21.
 */
public class FlyNoWay implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("我不会飞");
    }
}
