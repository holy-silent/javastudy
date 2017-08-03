package com.mystudy.jdbc;

import java.sql.SQLException;

/**
 * 业务服务层
 * Created by vanpersie on 2017/8/3.
 */
public class StudentService {

    //今后类的创建我们会交给Spring，全局只需一份
    //@Autowired
    //private StudentDao studentDao;
    private StudentDao studentDao = new StudentDao();

    public void save(Student s) {
        try {
            JDBCUtils.conn.setAutoCommit(false);//默认自动提交
            this.studentDao.save(s);
//            this.imtateEx();//此处发现异常，会到catch字句进行回退
            JDBCUtils.conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                JDBCUtils.conn.rollback();
            }catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    private void imtateEx() throws Exception{
        throw new Exception("模拟异常机制");
    }
}
