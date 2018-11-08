package com.zhm.designPattern.project.observer.JavaObserverPattern;

import java.util.Observable;

/**
 * Created by zhm on 2018/7/8.
 */
public class ConcreteWeatherSubject extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //内容有了，说明天气更新，则通知所有订阅人
        //通知前先调用方法
        this.setChanged();
        //然后主动调用通知方法，推方法
        this.notifyObservers(content);
        //拉方法
//        this.notifyObservers();
    }
}
