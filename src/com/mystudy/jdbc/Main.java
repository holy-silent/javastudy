package com.mystudy.jdbc;

/**
 * 模拟客户区
 * 用框架好处在于更好的封装、模块化、易用性、可扩展
 * Created by vanpersie on 2017/8/3.
 */
public class Main {
    public static void main(String[] args) {
        StudentService s = new StudentService();
        Student ss = new Student();
        ss.setId(5);
        ss.setName("dajun");
        ss.setNo("33");
        ss.setAge(12);
        s.save(ss);
    }
}
