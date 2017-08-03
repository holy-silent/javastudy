package com.mystudy.abstra;

/**
 * Created by vanpersie on 2017/8/1.
 */
public class StoreDB extends AbstractStore{
    @Override
    public void store() {
        System.out.println("我要存储到数据库中");
    }
}
