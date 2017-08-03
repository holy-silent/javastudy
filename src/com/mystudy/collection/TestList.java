package com.mystudy.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanpersie on 2017/8/1.
 */
public class TestList {
    public static void main(String[] args) {

        //父类引用指向子类对象
        List list = new ArrayList();
        //添加数据
        list.add(new String("a"));
        list.add(new String("b"));
        list.add(new String("c"));
        list.add(new String("d"));
        list.add(new String("e"));
        //遍历一
        for (Object o : list) {
            String s = (String)o;
            System.out.println(s);
        }
        //遍历二
        for (int i = 0; i < list.size(); i++) {
            String s = (String)list.get(i);
            System.out.println(s);
        }

        //从java1.5后，开始支持泛型
        List<String> list1 = new ArrayList<String>();
//        list1.add(new Integer(1)); 你会发现这样是不行的，因为这里规定，这个List只能装String
        list1.add(new String("a1"));
        list1.add(new String("b1"));
        list1.add(new String("c1"));
        list1.add(new String("d1"));
        list1.add(new String("e1"));

        //这里我们不需要再用Object对象进行转化，要知道Java里面类的老祖宗是Object，也可以说任何类都是默认
        //继承自Object
        //遍历一
        for (String o : list1) {
            System.out.println(o);
        }
        //遍历二
        for (int i = 0; i < list1.size(); i++) {
            String ss = list1.get(i);
            System.out.println(ss);
        }
    }
}
