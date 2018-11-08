package com.zhm.designPattern.project.template;

/**
 * 抽象基类
 */
public abstract class RefreshBeverage {

    /**
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate() {
        boilWater();
        brew();
        pourInCup();

        if (isCustomerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * Hook，钩子函数，提供一个默认或空的实现
     * 具体的子类可以自行决定是否挂钩以及如何挂钩
     * 询问用户是否加入调料
     *
     * @return
     */
    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    private void boilWater() {
        System.out.println("Boil water");
    }

    protected abstract void brew();


    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    protected abstract void addCondiments();
}
