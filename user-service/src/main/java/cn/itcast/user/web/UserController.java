package cn.itcast.user.web;

import cn.itcast.user.service.UserService;
import com.itcast.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id, @RequestHeader(value = "Slogan", required = false) String slogan) {
        System.out.println("slogan = " + slogan);
        return userService.queryById(id);
    }
}
