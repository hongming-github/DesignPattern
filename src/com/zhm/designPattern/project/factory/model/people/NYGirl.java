package com.zhm.designPattern.project.factory.model.people;

import com.zhm.designPattern.project.factory.model.Girl;

/**
 * Created by zhm on 2018/6/26.
 */
public class NYGirl implements Girl {
    @Override
    public void drawGirl() {
        System.out.println("----New Year Girl----");
    }
}
