package com.mystudy.inter;

/**
 * Created by vanpersie on 2017/8/1.
 */
public class StoreFile implements IStore {
    @Override
    public boolean store() {
        System.out.println("已存储到文件");
        return true;
    }
}
