package com.example.springboot.controller;

import com.example.springboot.entity.Teacher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongzhang
 * @version 1.0
 * @date: 2019/10/30 20:44
 */

@RestController
public class RegisterTeacher {

    @PostMapping("/addTeacher")
    public String addTeacher(Teacher srcTeacher){
        Teacher desTeacher = new Teacher();
        desTeacher

    }

}
