package com.example.springboot.controller;

import com.example.springboot.entity.JsonBean;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author zhongzhang
 * @version 1.0
 * @date 2019/10/8 12:22
 */

@RestController
@RequestMapping("/")
public class TestController {
    private Logger logger = Logger.getLogger (TestController.class);

    @RequestMapping("/hello")
    public @ResponseBody String HelloWorld(){
        for (int i = 0; i < 1000 ; i++) {
            logger.debug ("debug"+i);
            logger.info ("info"+i);
            logger.warn ("warn"+i);
            logger.error ("error"+i);
            logger.fatal ("fatal"+i);
        }
        return "HelloWorld";
    }

    @GetMapping("/json")
    public JsonBean testJson(){
        JsonBean jsonBean = new JsonBean ();
        jsonBean.setBirthday (new Date ());
        jsonBean.setName ("json");
        jsonBean.setList (new ArrayList<> ());
        return  jsonBean;
    }
}
