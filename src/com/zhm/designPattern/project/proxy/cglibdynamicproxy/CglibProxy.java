package com.zhm.designPattern.project.proxy.cglibdynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhm on 2018/6/30.
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        //设置创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * 目标类的实例
     * 目标方法的反射对象
     * 目标方法的参数
     * 代理类的实例
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("日至开始...");
        //代理类调用父类的方法
        methodProxy.invokeSuper(o,objects);
        System.out.println("日至结束...");
        return null;
    }
}
