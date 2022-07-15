package com.itcast.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author G0dc
 * @description:
 * @date 2022/7/12 14:23
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.FULL; // 日志级别为FULL
    }
}
