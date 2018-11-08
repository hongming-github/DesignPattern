package com.zhm.designPattern.project.factory;

import com.zhm.designPattern.project.factory.model.Boy;
import com.zhm.designPattern.project.factory.model.Girl;
import com.zhm.designPattern.project.factory.model.people.CBoy;
import com.zhm.designPattern.project.factory.model.people.CGirl;

/**
 * Created by zhm on 2018/6/26.
 */
public class CFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new CBoy();
    }

    @Override
    public Girl getGirl() {
        return new CGirl();
    }
}
