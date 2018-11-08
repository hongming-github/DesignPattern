package com.zhm.designPattern.project.singleton;

/**
 * Created by zhm on 2018/6/30.
 */
//懒汉模式
public class Singleton2 {
    //1.将构造方法私有化,不允许外部直接创建对象
    private Singleton2() {

    }

    //2.创建类的唯一实例
    private static Singleton2 instance;

    //3.提供一个访问实例的方法
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
