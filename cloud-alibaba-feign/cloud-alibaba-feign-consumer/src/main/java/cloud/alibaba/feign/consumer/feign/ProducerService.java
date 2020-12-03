package cloud.alibaba.feign.consumer.feign;

import cloud.alibaba.feign.consumer.entity.User;
import com.smart.commons.result.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-alibaba-feign-producer", path = "/api/pro")
public interface ProducerService {
    @GetMapping("/")
    public String test();

    @GetMapping("/get")
    BaseResult<User> get(@RequestParam long userId);
}
