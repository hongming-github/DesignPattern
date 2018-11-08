package com.zhm.designPattern.project.observer.WeatherObserverPattern;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * Created by zhm on 2018/7/4.
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    //获取天气的内容信息
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //内容有了，说明天气更新，则通知所有订阅人
        this.notifyObservers();
    }
}
