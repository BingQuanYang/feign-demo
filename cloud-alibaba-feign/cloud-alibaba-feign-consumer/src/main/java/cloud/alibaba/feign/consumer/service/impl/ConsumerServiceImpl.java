package cloud.alibaba.feign.consumer.service.impl;

import cloud.alibaba.feign.consumer.entity.User;
import cloud.alibaba.feign.consumer.feign.ProducerService;
import cloud.alibaba.feign.consumer.feign.UserService;
import cloud.alibaba.feign.consumer.service.ConsumerService;
import cloud.alibaba.feign.consumer.vo.ConsumerVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.smart.commons.result.BaseResult;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Resource
    ProducerService producerService;
//    @Resource
//    UserService userService;

    @Override
    public ConsumerVo getData() {
        ConsumerVo consumerVo = new ConsumerVo();
        String port = producerService.test();
        consumerVo.setPort(port);
        BaseResult<User> userBaseResult = producerService.get(1);
        User user = userBaseResult.getInfo();
        consumerVo.setUser(user);

        return consumerVo;
    }
}
