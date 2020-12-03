package cloud.alibaba.feign.producer.service;

import cloud.alibaba.feign.producer.entity.User;

public interface UserService {
    User getByUserId(long userId);
}
