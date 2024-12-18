package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD)
// 注解会被保留到运行时，并且可以通过反射访问这些注解
// @Retention 决定了被标注的注解在什么阶段可以被保留（编译时、运行时等）
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {

    // 指定数据库操作类型，UPDATE INSERT
    OperationType value();
}
