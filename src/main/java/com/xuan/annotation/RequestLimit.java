package com.xuan.annotation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RequestLimit {
    /**
     * 在 second 秒内，最大请求 maxCount 次
     */
    int second() default 1;
    int maxCount() default 1;
}
