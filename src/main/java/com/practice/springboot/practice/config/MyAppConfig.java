package com.practice.springboot.practice.config;

import com.practice.springboot.practice.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuaration:类似Spring中的XML配置,可以让我们直接使用java编码的方式去配置Spring的组件。
 * @Bean:
 *   1. 类似于Spring中xml配置文件的bean标签；作用是把方法返回的对象添加到Spring容器中；
 *   2. 添加到容器中的对象的默认id值是方法名称。
 *
 */
@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloSer() {
        System.out.println("helloSer 对象创建");
        return new HelloService();
    }
}
