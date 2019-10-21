package com.example.springboot.annotation;

import org.apache.ibatis.type.Alias;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @author zhongzhang
 * date: 2019/10/21 20:37
 * @version 1.0
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {

    /***
     * 日志描述，这里使用了@AliasFor别名
     * @return
     */
    @AliasFor("desc")
    String value() default  "";

    /***
     * 日志描述
     * @return
     */
    @AliasFor("value")
    String desc() default "";

    /***
     * 是否不记录日志
     * @return
     */
    boolean ignore() default false;


}
