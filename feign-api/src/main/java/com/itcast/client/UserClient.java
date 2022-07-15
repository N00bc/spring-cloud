package com.itcast.client;

import com.itcast.config.DefaultFeignConfiguration;
import com.itcast.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author G0dc
 * @description:
 * @date 2022/7/12 0:19
 */
@FeignClient(value = "user-service", configuration = DefaultFeignConfiguration.class)
public interface UserClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
