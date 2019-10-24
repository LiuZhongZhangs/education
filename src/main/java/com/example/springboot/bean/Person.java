package com.example.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @author zhongzhang
 * date: 2019/10/24 11:37
 * @version 1.0
 */

@Data
@AllArgsConstructor
public class Person {
    private String id;
    private String userName;
    private String password;
    /***
     * 用户对应角色集合
     */
    private Set<Role> roles;
}
