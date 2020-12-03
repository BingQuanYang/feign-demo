package cloud.alibaba.feign.producer.controller;

import cloud.alibaba.feign.producer.entity.User;
import cloud.alibaba.feign.producer.service.UserService;
import com.smart.commons.result.BaseResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pro")
public class ProducerController {

    @Resource
    UserService userService;
    @Value("${server.port}")
    String port;

    @GetMapping("/")
    public String test() {
        return port;
    }

    @GetMapping("/get")
    public BaseResult<User> get(long userId) {
        return BaseResult.success(userService.getByUserId(userId));
    }
}
