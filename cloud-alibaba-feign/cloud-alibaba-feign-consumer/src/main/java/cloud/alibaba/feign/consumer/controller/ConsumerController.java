package cloud.alibaba.feign.consumer.controller;

import cloud.alibaba.feign.consumer.feign.ProducerService;
import cloud.alibaba.feign.consumer.service.ConsumerService;
import com.smart.commons.result.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/con")
public class ConsumerController {
    @Resource
    ProducerService producerService;
    @Resource
    ConsumerService consumerService;

    @GetMapping("/")
    public String test() {
        return producerService.test();
    }

    @GetMapping("/get")
    public BaseResult get() {
        return BaseResult.success(consumerService.getData());
    }
}
