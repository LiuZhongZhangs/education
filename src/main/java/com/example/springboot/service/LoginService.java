package com.example.springboot.service;

import com.example.springboot.bean.Person;

/**
 * @author zhongzhang
 * date: 2019/10/24 11:48
 * @version 1.0
 */
public interface LoginService {
    /***
     * 根据名字得到用户
     * @param getMapByName
     * @return
     */
     Person getPersonByName(String getMapByName);
}
