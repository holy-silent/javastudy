package com.mystudy.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 数据访问层
 * dao层只是获取连接后提交sql语句，事务控制放在业务层
 * Created by vanpersie on 2017/8/3.
 */
public class StudentDao {
    public void save(Student s) {
        try {
            String sql = "insert into students (id, name, no, age) values (?, ?, ?, ?)";
            PreparedStatement ps = JDBCUtils.conn.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getNo());
            ps.setInt(4, s.getAge());
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
