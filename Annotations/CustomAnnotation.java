package com.company.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
//interface CustomAnnotation with fields

public @ interface CustomAnnotation {
    String name();
    int duration() default 1;
    double[] version();
}
