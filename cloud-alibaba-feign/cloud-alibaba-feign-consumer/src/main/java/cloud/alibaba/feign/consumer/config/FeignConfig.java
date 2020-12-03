package cloud.alibaba.feign.consumer.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    //设置负载均衡策略 如果我们调用生产者是集群 采用那种负载均衡策略
    @Bean
    public IRule rule() {
        //轮询权重
//        return new WeightedResponseTimeRule();
        //最少并发数
//        return new BestAvailableRule();
        //随机
        return new RandomRule();
    }
}
