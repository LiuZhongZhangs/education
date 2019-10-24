package com.example.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @author zhongzhang
 * date: 2019/10/24 11:33
 * @version 1.0
 */

@Data
@AllArgsConstructor
public class Role {
    private String id;
    private String roleName;

    /***
     *用户对象角色集合
     */
    private Set<Permissions> permissions;

}
