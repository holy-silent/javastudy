package com.mystudy.abstra;

/**
 * Created by vanpersie on 2017/8/1.
 */
public abstract class AbstractStore {
    protected abstract void store();

    public void kenelBusiness() {
        System.out.println("此处进行核心业务处理");
        //执行数据存储
        this.store();
        System.out.println("此处进行资源释放");
    }

}
