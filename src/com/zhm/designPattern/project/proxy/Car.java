package com.zhm.designPattern.project.proxy;

import java.util.Random;

/**
 * Created by zhm on 2018/6/30.
 */
public class Car implements Movable {

    @Override
    public void move() {

        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("行驶中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
