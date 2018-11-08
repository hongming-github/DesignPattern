package com.zhm.designPattern.project.factory.model.hair;

import com.zhm.designPattern.project.factory.model.HairInterface;

/**
 * Created by zhm on 2018/6/26.
 */
public class LeftHair implements HairInterface {
    @Override
    public void draw() {
        System.out.println("----Left Hair----");
    }
}
