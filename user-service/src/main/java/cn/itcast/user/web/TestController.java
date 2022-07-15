package cn.itcast.user.web;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author G0dc
 * @description:
 * @date 2022/7/11 22:03
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String test() {
        return "this is test controller";
    }

}
