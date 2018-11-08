package com.zhm.designPattern.project.observer.JavaObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhm on 2018/7/8.
 */
public class ConcreteObserver implements Observer {
    private String observerName;

    @Override
    public void update(Observable observable, Object arg) {
        //推
        System.out.println(observerName + "收到了消息，目标推送过来的是" + arg);
        //拉
        System.out.println(observerName + "收到了消息，主动到目标对象中去拉，内容是" + ((ConcreteWeatherSubject) observable)
                .getContent());
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
