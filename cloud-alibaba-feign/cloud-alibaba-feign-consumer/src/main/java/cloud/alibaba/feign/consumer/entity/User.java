package cloud.alibaba.feign.consumer.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表
 */
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 0->正常,1->删除
     */
    private Integer deleteStatus;
}