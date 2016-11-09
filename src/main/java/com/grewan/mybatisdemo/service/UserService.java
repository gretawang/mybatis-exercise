package com.grewan.mybatisdemo.service;

import com.grewan.mybatisdemo.domain.User;
import com.grewan.mybatisdemo.mappers.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author: grewan
 * @date: 2016/11/9
 */
public class UserService
{

    public void insertUser(User user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.insertUser(user);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public User getUserById(Integer userId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.getUserById(userId);
        }finally{
            sqlSession.close();
        }
    }

    public List<User> getAllUsers() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.getAllUsers();
        }finally{
            sqlSession.close();
        }
    }

    public void updateUser(User user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.updateUser(user);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }

    }

    public void deleteUser(Integer userId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteUser(userId);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }

    }

}
