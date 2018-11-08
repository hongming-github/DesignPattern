package com.zhm.designPattern.project.adapter;

/**
 * Created by zhm on 2018/8/21.
 */
public class TwoPlugExtends extends GBTwoPlug implements ThreePlugInterface {
    @Override
    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();
    }
}
