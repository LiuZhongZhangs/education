package com.example.springboot.service.Impl;

import com.example.springboot.bean.Permissions;
import com.example.springboot.bean.Person;
import com.example.springboot.bean.Role;
import com.example.springboot.service.LoginService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zhongzhang
 * date: 2019/10/24 11:46
 * @version 1.0
 */
public class LoginServiceImp implements LoginService {
    @Override
    public Person getPersonByName(String getMapByName) {
        return getMapByName(getMapByName);
    }

    private Person getMapByName(String userName){
        //  用户zhongzhang 分配角色admin 角色admin拥有 query 和 add 权限
        Permissions queryPermission = new Permissions("1","query");
        Permissions addPermission = new Permissions("2","add");
        Set<Permissions> adminPermissionSet = new HashSet<>();
        adminPermissionSet.add(queryPermission);
        adminPermissionSet.add(addPermission);
        Role admin = new Role("1","admin",adminPermissionSet);
        Set<Role> adminRoleSet = new HashSet<>();
        adminRoleSet.add(admin);
        Person zhongzhang = new Person("1","zhongzhang","123456",adminRoleSet);
        Map<String, Person> map = new HashMap<>();
        map.put(zhongzhang.getUserName(),zhongzhang);

        // 用户yaoyi 分配用户角色 用户角色只有query权限
        Set<Permissions> userPermissionSet = new HashSet<>();
        userPermissionSet.add(queryPermission);
        Role user = new Role("2","user",userPermissionSet);
        Set<Role> userRoleSet = new HashSet<>();
        Person yaoyi = new Person("2","yaoyi","123456",userRoleSet);
        map.put(yaoyi.getUserName(),yaoyi);
        return map.get(userName);
    }
}
