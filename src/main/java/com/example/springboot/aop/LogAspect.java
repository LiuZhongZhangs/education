package com.example.springboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author zhongzhang
 * date: 2019/10/21 20:26
 * @version 1.0
 */

@Aspect
@Component
@Slf4j
public class LogAspect {

//    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // 设置切入点 直接拦截被@RestController注解的类
    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void pointcut() {

    }

//    public Object doAround (ProceedingJoinPoint proceedingJoinPoint ){
//        long beginTime = System.currentTimeMillis();
//
//    }

}
