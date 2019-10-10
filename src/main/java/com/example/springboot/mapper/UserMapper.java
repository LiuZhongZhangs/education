package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhongzhang
 * @version 1.0
 * @date 2019/10/1 16:28
 */

@Mapper
@Repository
public interface UserMapper {

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
     * @return List
     */
     List<User> findByUserName(String username);

    /***
     * 根据密码模糊查询
     * @param password
     * @return user
     */
    List<User> findByPassword(String password);






}
