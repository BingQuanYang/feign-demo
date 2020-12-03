package cloud.alibaba.feign.consumer.feign;

import com.smart.commons.result.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "cloud-alibaba-feign-producer", path = "/api/user")
public interface UserService {
//    @GetMapping("/get")
//    BaseResult get(@RequestParam long userId);
}
