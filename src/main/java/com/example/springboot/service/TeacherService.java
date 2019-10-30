package com.example.springboot.service;

import com.example.springboot.entity.Teacher;

import java.util.List;

/**
 * @author zhongzhang
 * @version 1.0
 * @date: 2019/10/30 20:55
 */

public interface TeacherService {

    /***
     * 添加老师
     * @param teacher
     * @return
     */
    int addTeacher(Teacher teacher);

    /***
     * 通过id删除老师
     * @param id
     * @return
     */
    int deleteById(long id);

    /***
     * 修改老师信息
     * @param teacher
     * @return
     */
    int updateTeacher(Teacher teacher);

    /***
     * 通过id查找用户
     * @param id
     * @return
     */
    Teacher findById(long id);

    List<Teacher>
}
