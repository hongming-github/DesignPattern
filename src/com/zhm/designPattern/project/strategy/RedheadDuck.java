package com.zhm.designPattern.project.strategy;

import com.zhm.designPattern.project.strategy.impl.FlyWithWing;

/**
 * Created by zhm on 2018/8/21.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        super();
        super.setFlyingStrategy(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是红色的");
    }


}
