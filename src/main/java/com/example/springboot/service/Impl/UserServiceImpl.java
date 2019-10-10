package com.example.springboot.service.Impl;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser (user);
    }

    @Override
    public int deleteById(Long id) {
        return userMapper.deleteById (id);
    }

    @Override
    public int updateUser(User user) {
       return  userMapper.updateUser (user);
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById (id);
    }

    @Override
    public long count() {
        return userMapper.count ();
    }

    @Override
    public List<User> findByUserName(String username) {
        return userMapper.findByUserName (username);
    }

    @Override
    public List<User> findByPassword(String password) {
        return userMapper.findByPassword (password);
    }
}
