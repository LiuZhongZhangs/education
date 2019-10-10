package com.example.springboot.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author zhongzhang
 * @version 1.0
 * @date 2019/10/8 12:25
 */

@Data
public class JsonBean {
    private String name;
    @JSONField(format = "yyyy年MM月dd日")
    private Date birthday;
    private List<String> list;
}
