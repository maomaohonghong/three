package com.java.test;

import com.java.domain.Dept;
import com.java.mapper.DeptMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws Exception {
        InputStream asStream = Resources.getResourceAsStream("com/java/mapper/DeptMapper.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(asStream);
        SqlSession session = factory.openSession();
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        List<Dept> deptList = deptMapper.selectByExample(null);
        for (Dept dept : deptList) {
            System.out.println(dept);
        }
    }
}
