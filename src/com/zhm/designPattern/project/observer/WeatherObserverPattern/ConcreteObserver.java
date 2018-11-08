package com.zhm.designPattern.project.observer.WeatherObserverPattern;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * Created by zhm on 2018/7/4.
 */
public class ConcreteObserver implements Observer {
    //观察者名字
    private String observerName;

    //天气内容
    private String weatherContent;

    //提醒的内容
    private String remindMessage;

    /**
     * 获取目标类的状态，同步到观察者的状态中。
     *
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
        System.out.println(observerName + "收到了" + weatherContent + "," + remindMessage);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindMessage() {
        return remindMessage;
    }

    public void setRemindMessage(String remindMessage) {
        this.remindMessage = remindMessage;
    }
}
