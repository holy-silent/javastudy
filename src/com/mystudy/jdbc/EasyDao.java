package com.mystudy.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 原始的数据库操作
 * Created by vanpersie on 2017/8/3.
 */
public class EasyDao {
    public static final String url = "jdbc:mysql://127.0.0.1/student";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "root";

    public Connection conn = null;
    public PreparedStatement pst = null;

    public EasyDao(String sql) {
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
            pst = conn.prepareStatement(sql);//准备执行语句
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            this.pst.close();
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sql = "select * from students";//SQL语句
        EasyDao db1 = new EasyDao(sql);//创建DBHelper对象

        try {
            ResultSet ret = db1.pst.executeQuery();//执行语句，得到结果集
            List<Student> list = new ArrayList<Student>();//结果集以List线性表的形式提供，方便客户操作
            Student s = new Student();
            while (ret.next()) {
                int uid = ret.getInt(1);
                String ufname = ret.getString(2);
                String no = ret.getString(3);
                int age = ret.getInt(4);

                s.setId(uid);
                s.setName(ufname);
                s.setNo(no);
                s.setAge(age);
                list.add(s);
                System.out.println(s);
            }//显示数据
            ret.close();
            db1.close();//关闭连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
