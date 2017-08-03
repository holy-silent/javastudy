package com.mystudy.jvm;

/**
 * 单例模式
 * Created by vanpersie on 2017/8/2.
 */
public class TestBeforeInit {
    private TestBeforeInit() {}

    private static TestBeforeInit inst = new TestBeforeInit();

    public static TestBeforeInit getInst() {
        return inst;
    }

    public static void test() {

    }
}
