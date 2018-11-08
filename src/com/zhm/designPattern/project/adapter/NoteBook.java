package com.zhm.designPattern.project.adapter;

import com.sun.tools.corba.se.idl.constExpr.Not;

/**
 * Created by zhm on 2018/8/21.
 */
public class NoteBook {

    private ThreePlugInterface plug;

    public NoteBook(ThreePlugInterface plug) {
        this.plug = plug;

    }

    public void charge() {
        plug.powerWithThree();
    }

    public static void main(String[] args) {
        GBTwoPlug gbTwoPlug = new GBTwoPlug();

        ThreePlugInterface threePlugInterface = new TwoPlugAdaptor(gbTwoPlug);

        NoteBook noteBook = new NoteBook(threePlugInterface);

        noteBook.charge();

        threePlugInterface = new TwoPlugExtends();
        noteBook = new NoteBook(threePlugInterface);
        noteBook.charge();

    }
}
