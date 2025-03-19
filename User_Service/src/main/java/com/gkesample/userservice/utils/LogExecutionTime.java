package com.gkesample.userservice.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target (ElementType.METHOD) // Specifies where we can add the annotation
@Retention (RetentionPolicy.RUNTIME)// When we can execute this
public @interface LogExecutionTime
    {
    }
