package com.zhm.designPattern.project.factory;

import com.zhm.designPattern.project.factory.model.Boy;
import com.zhm.designPattern.project.factory.model.Girl;
import com.zhm.designPattern.project.factory.model.people.NYBoy;
import com.zhm.designPattern.project.factory.model.people.NYGirl;

/**
 * Created by zhm on 2018/6/26.
 */
public class NYFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new NYBoy();
    }

    @Override
    public Girl getGirl() {
        return new NYGirl();
    }
}
