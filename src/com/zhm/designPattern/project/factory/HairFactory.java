package com.zhm.designPattern.project.factory;

import com.zhm.designPattern.project.factory.model.HairInterface;

/**
 * Created by zhm on 2018/6/26.
 */
public class HairFactory {
    public HairInterface getHairByClassName(String className) {
        try {
            HairInterface hair = (HairInterface) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
