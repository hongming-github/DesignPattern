package com.zhm.designPattern.project.strategy;

/**
 * Created by zhm on 2018/8/21.
 */
public abstract class Duck {
    public void quack(){
        System.out.println("嘎嘎嘎");
    }

    public abstract void display();

    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly(){
        flyingStrategy.performFly();
    }
}
