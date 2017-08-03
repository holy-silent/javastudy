package com.mystudy.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vanpersie on 2017/8/1.
 */
public class TestMap {
    public static void main(String[] args) {
        //泛型可参考TestList中的介绍
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");

        //遍历一
        for (String key : map.keySet()) {
            System.out.println("key:" + key + "; value:" + map.get(key));
        }

        //遍历二
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println("key:" + m.getKey() + ", value:" + m.getValue());
        }
    }
}
