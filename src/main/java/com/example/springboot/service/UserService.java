package com.example.springboot.service;

import com.example.springboot.entity.User;

import java.util.List;

/**
 * @author zhongzhang
 * @version 1.0
 * @date 2019/10/1 21:57
 */
public interface UserService {

    /***
     * 插入用户
     * @param user
     */
    int  addUser(User user);

    /***
     * 根据id删除用户
     * @param id
     */
    int deleteById(Long id);

    /***
     * 更新用户
     * @param user
     */
    int updateUser(User user);

    /***
     * 根据id查询用户
     * @param id
     * @return User
     */
    User findById(Long id);

    /***
     *  统计用户数量
     * @return long
     */
    long count();

    /***
     * 根据用户名模糊查询
     * @param username
     * @return user
     */
    List<User> findByUserName(String username );

    /***
     * 根据密码模糊查询
     * @param password
     * @return
     */
    List<User> findByPassword( String password );

}
