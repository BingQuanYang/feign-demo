package cloud.alibaba.feign.producer.controller;

import cloud.alibaba.feign.producer.service.UserService;
import com.smart.commons.result.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/get")
    public BaseResult get(long userId) {
        return BaseResult.success(userService.getByUserId(userId));
    }

}
