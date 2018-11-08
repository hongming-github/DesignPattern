package com.zhm.designPattern.project.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册和删除观察者的接口
 * Created by zhm on 2018/7/4.
 */
public class Subject {
    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除集合中的指定观察者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers() {
        observers.forEach(observer ->
                observer.update(this)
        );
    }
}
