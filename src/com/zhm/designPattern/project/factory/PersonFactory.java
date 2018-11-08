package com.zhm.designPattern.project.factory;

import com.zhm.designPattern.project.factory.model.Boy;
import com.zhm.designPattern.project.factory.model.Girl;

/**
 * Created by zhm on 2018/6/26.
 */
public interface PersonFactory {
    Boy getBoy();

    Girl getGirl();
}
