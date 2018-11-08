package com.zhm.designPattern.project.template;

/**
 * 具体子类，提供了咖啡制备的具体实现
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    /**
     * 子类通过覆盖的形式选择挂载钩子函数
     *
     * @return
     */
    @Override
    protected boolean isCustomerWantsCondiments() {
        return false;
    }
}
