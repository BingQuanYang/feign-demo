package cloud.alibaba.feign.producer.service.impl;

import cloud.alibaba.feign.producer.entity.User;
import cloud.alibaba.feign.producer.mapper.UserMapper;
import cloud.alibaba.feign.producer.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User getByUserId(long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
