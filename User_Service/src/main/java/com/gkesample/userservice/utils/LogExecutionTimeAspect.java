package com.gkesample.userservice.utils;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import com.gkesample.userservice.utils.LogExecutionTime;
@Component
@Aspect
@Slf4j
public class LogExecutionTimeAspect
    {
    @Around("@annotation(com.gkesample.userservice.utils.LogExecutionTime)") // Fully qualified annotation path
    public Object LogExecutionTime (ProceedingJoinPoint proceedingJoinPoint) throws Throwable
        {
        long startTime = System.currentTimeMillis ();
        // This code is used when we need to continue method processing
        Object result = proceedingJoinPoint.proceed ();
        long timeConsumed = System.currentTimeMillis () - startTime;
        log.info ("The Total Time consumed to execute the method is ----{}", timeConsumed);
        return result;
        }
    }
