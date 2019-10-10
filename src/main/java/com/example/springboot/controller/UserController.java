package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhongzhang
 * @version 1.0
 * @date 2019/10/1 21:56
 */

@Controller
@ResponseBody
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/addUser")
    public String addUser(@RequestParam String username , @RequestParam String password){
        User user = new User ();
        user.setUsername (username);
        user.setPassword (password);
        userServiceImpl.addUser (user);
        return "success";
    }

    @PostMapping("/updateUser")
    public int updateUser( User user){
       return userServiceImpl.updateUser (user);
    }

    @PostMapping("/deleteUser")
    public int deleteUser(@RequestParam long id){
        return userServiceImpl.deleteById (id);
    }

    @PostMapping("/count")
    public Long count(){
        return userServiceImpl.count ();
    }

    @PostMapping("/findById")
    public User findById(@RequestParam Long id){
        return userServiceImpl.findById (id);
    }

    @PostMapping("/findByUserName")
    public List<User> findByUserName(@RequestParam String username){
        return userServiceImpl.findByUserName (username);
    }

    @PostMapping("/findByPassword")
    public List<User> findByPassword(@RequestParam String password){
        return userServiceImpl.findByPassword (password);
    }



}
