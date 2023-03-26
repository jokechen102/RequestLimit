package com.xuan;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
* @className Application
* @description TODO
* @author shuaichen
* @date 11:32 2023/3/26
* @version 1.0
* @since 1.0
*/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
