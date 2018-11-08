package com.zhm.designPattern.project.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhm on 2018/6/30.
 */
public class TimeHandler implements InvocationHandler {
    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     * 被代理的对象
     * 被代理对象的方法
     * 方法的参数
     *
     * @return Object方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶...");
        method.invoke(target);
        long endTime = System.currentTimeMillis();
        System.out.println("结束行驶...汽车行驶时间" + (endTime - startTime) + "毫秒");
        return null;
    }
}
