package com.mystudy.jdbc;

/**
 * 学生实体类
 * Created by vanpersie on 2017/8/3.
 */
public class Student {
    private int id;
    private String name;
    private String no;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + no + "\t" + age;
    }
}
