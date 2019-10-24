package com.example.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhongzhang
 * date: 2019/10/24 11:32
 * @version 1.0
 */

@Data
@AllArgsConstructor
public class Permissions {
    private String id;
    private String permissionsName;
}
