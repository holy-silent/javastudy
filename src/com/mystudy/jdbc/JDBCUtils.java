package com.mystudy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 模拟数据库连接提供者
 * 在框架中，我们会将数据库连接交给Druid数据源
 * Created by vanpersie on 2017/8/3.
 */
public class JDBCUtils {
    public static Connection conn;
    static {
        try {
            Class.forName(Constant.name);//指定连接类型
            conn = DriverManager.getConnection(Constant.url, Constant.user, Constant.password);//获取连接
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
