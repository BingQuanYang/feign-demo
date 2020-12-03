package cloud.alibaba.feign.consumer.vo;

import cloud.alibaba.feign.consumer.entity.User;
import lombok.Data;

@Data
public class ConsumerVo {
    private User user;
    private String port;
}
