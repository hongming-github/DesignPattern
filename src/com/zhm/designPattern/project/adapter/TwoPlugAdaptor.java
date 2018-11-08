package com.zhm.designPattern.project.adapter;

/**
 * Created by zhm on 2018/8/21.
 */
public class TwoPlugAdaptor implements ThreePlugInterface {
    private GBTwoPlug gbTwoPlug;

    public TwoPlugAdaptor(GBTwoPlug gbTwoPlug) {
        this.gbTwoPlug = gbTwoPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转化");
        gbTwoPlug.powerWithTwo();
    }
}
