package com.zhm.designPattern.project.chainofresponsibility.handler;

/**
 * Created by zhm on 2018/8/19.
 */
public class PriceHandlerFactory {
    /**
     * 创建PriceHandler的工厂方法
     *
     * @return
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler lead = new Lead();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(lead);
        lead.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        return sales;
    }
}
