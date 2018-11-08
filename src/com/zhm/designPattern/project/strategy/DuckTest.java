package com.zhm.designPattern.project.strategy;

/**
 * Created by zhm on 2018/8/21.
 */
public class DuckTest {
    public static void main(String[] args){
        System.out.println("测试鸭子程序");

        Duck duck = null;
//        duck = new MallardDuck();
//        duck = new RedheadDuck();

        duck = new RubberDuck();
        duck.display();
        duck.quack();
        duck.fly();

        System.out.println("测试完毕");
    }
}
