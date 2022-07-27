import com.zhm.designPattern.project.observer.JavaObserverPattern.ConcreteObserver;
import com.zhm.designPattern.project.observer.JavaObserverPattern.ConcreteWeatherSubject;
import com.zhm.designPattern.project.proxy.Car;
import com.zhm.designPattern.project.proxy.CarLogProxy;
import com.zhm.designPattern.project.proxy.CarTimeProxy;
import com.zhm.designPattern.project.proxy.Movable;
import com.zhm.designPattern.project.proxy.cglibdynamicproxy.CglibProxy;
import com.zhm.designPattern.project.proxy.cglibdynamicproxy.Train;
import com.zhm.designPattern.project.proxy.jdkdynamicproxy.LogHandler;
import com.zhm.designPattern.project.proxy.jdkdynamicproxy.TimeHandler;
import com.zhm.designPattern.project.template.Coffee;
import com.zhm.designPattern.project.template.RefreshBeverage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        /*3
        HairInterface left = new LeftHair();
        left.draw();

        HairFactory factory = new HairFactory();
        LeftHair leftHair = (LeftHair) factory.getHairByClassName("com.zhm.designPattern.project.factory.model.hair.LeftHair");
        leftHair.draw();

        PersonFactory personFactory = new CFactory();
        personFactory.getGirl().drawGirl();

        PersonFactory personFactory1 = new NYFactory();
        personFactory1.getBoy().drawBoy();
        */

        /*
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s2){
            System.out.print("same");
        }else {
            System.out.print("different");
        }*/

        /*
        Car car = new Car();
        car.move();*/
        //继承
//        Movable car2 = new Car2();
//        car2.move();
        //聚合
//        Car car = new Car();
//        Movable car3 = new CarTimeProxy(car);
//        car3.move();
//        Car car = new Car();
//        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
//        CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);
//        carLogProxy.move();
//        //JDK Proxy
//        Car car = new Car();
//        Class clazz = car.getClass();
//
//        InvocationHandler timeHandler = new TimeHandler(car);
//
//        Movable movable = (Movable) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
//                timeHandler);
//
//        InvocationHandler logHandler = new LogHandler(movable);
//
//        Movable movable1 = (Movable) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
//                logHandler);
//
//        movable1.move();
//        //Cglib Proxy
//        CglibProxy cglibProxy = new CglibProxy();
//        Train train = (Train) cglibProxy.getProxy(Train.class);
//        train.move();
//        //自定义
//        //1创建目标
//        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
//        //2创建观察者
//        ConcreteObserver observerGirl = new ConcreteObserver();
//        observerGirl.setObserverName("女朋友");
//        observerGirl.setRemindMessage("是我们的第一次约会，地点街心公园，不见不散");
//
//        ConcreteObserver observerGirlMom = new ConcreteObserver();
//        observerGirlMom.setObserverName("女朋友老妈");
//        observerGirlMom.setRemindMessage("是一个购物的好日子，明天去扫货");
//        //3注册观察者
//        weather.attach(observerGirl);
//        weather.attach(observerGirlMom);
//
//        //4目标发布天气
//        weather.setWeatherContent("明天 天气晴朗，蓝天白云，气温28度");
//
//        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
//
//        ConcreteObserver girl = new ConcreteObserver();
//        girl.setObserverName("女朋友");
//
//        ConcreteObserver girlMom = new ConcreteObserver();
//        girlMom.setObserverName("女朋友的妈妈");
//
//        subject.addObserver(girl);
//        subject.addObserver(girlMom);
//
//        subject.setContent("天气晴，气温28度");

        RefreshBeverage makeCoffee = new Coffee();
        makeCoffee.prepareBeverageTemplate();

    }
}
