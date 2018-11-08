package com.zhm.designPattern.project.factory.model.people;

import com.zhm.designPattern.project.factory.model.Boy;

/**
 * Created by zhm on 2018/6/26.
 */
public class CBoy implements Boy {
    @Override
    public void drawBoy() {
        System.out.println("----Christmas Boy----");
    }
}
