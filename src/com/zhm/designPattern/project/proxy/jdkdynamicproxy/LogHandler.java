package com.zhm.designPattern.project.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhm on 2018/6/30.
 */
public class LogHandler implements InvocationHandler {
    private Object target;

    public LogHandler(Object target) {
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
        System.out.println("日至开始...");
        method.invoke(target);
        System.out.println("日至结束...");
        return null;
    }
}
