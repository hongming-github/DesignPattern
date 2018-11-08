package com.zhm.designPattern.project.singleton;

/**
 * Created by zhm on 2018/6/30.
 */
//饿汉模式
public class Singleton {
    //1.将构造方法私有化,不允许外部直接创建对象
    private Singleton(){

    }

    //2.创建类的唯一实例
    private static Singleton instance = new Singleton();

    //3.提供一个访问实例的方法
    public static Singleton getInstance(){
        return instance;
    }
}
