package com.mystudy.abstra;

/**
 * Created by vanpersie on 2017/8/1.
 */
public class Main {
    public static void main(String[] args) {
        //现在，我想在核心业务逻辑处理完成之后用文件进行存储
        AbstractStore store = new StoreFile();
        Main m = new Main();
        m.process(store);
    }


    /**
     * 场景介绍：
     * 这里，由于我们的核心业务处理流程已固定，唯有存储方式可以随便更改，所以我们可以采用抽象类固定下核心处理
     * ，将存储接口留给子类实现
     * @param store
     */
    public void process(AbstractStore store) {
        store.kenelBusiness();
    }
}
