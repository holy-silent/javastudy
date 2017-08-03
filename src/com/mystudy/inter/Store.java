package com.mystudy.inter;

/**
 * Created by vanpersie on 2017/8/1.
 */
public class Store {
    public static void main(String[] args) {
        Store s = new Store();

        //起初，我们用数据库存储
//        s.store(new StoreDB());

        //后来，我们改用文件存储
        s.store(new StoreFile());

        //我们只需要增加一个针对新需求的实现类，不需求修改核心业务代码，只需要在客户区修改一行代码便完成了功能
        //替代，这是接口带给我们的可扩展性。
    }

    /**
     * 业务类存储方法
     * @param store
     */
    public void store(IStore store) {
        System.out.println("此处进行相关业务处理，处理完成后进行存储");
        store.store();
    }
}
