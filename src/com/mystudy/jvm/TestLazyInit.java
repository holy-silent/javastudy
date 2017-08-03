package com.mystudy.jvm;

/**
 * 单例模式
 * Created by vanpersie on 2017/8/2.
 */
public class TestLazyInit {
    private TestLazyInit() {}

    private static TestLazyInit inst;

    public static TestLazyInit getInst() {
        if (inst==null) {
            return new TestLazyInit();
        }
        return inst;
    }

    public static void test() {

    }
}
