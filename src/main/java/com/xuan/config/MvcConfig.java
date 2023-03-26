package com.xuan.config;

import com.xuan.intercept.RequestLimitIntercept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* @className MvcConfig
* @description TODO
* @author shuaichen
* @date 12:31 2023/3/26
* @version 1.0
* @since 1.0
*/
@Configuration
@Slf4j
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    private RequestLimitIntercept requestLimitIntercept;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("添加拦截");
        registry.addInterceptor(requestLimitIntercept);
    }
}
