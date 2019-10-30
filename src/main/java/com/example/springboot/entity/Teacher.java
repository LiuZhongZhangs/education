package com.example.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhongzhang
 * @version 1.0
 * @date: 2019/10/30 20:37
 */

@Data
public class Teacher {
    private long id;
    private String teacherName;
    private String gender;
    private String city_zone;
    private String university;
    private String major;
    private String phone;
    private String statu;

}
