package cn.exev.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("customer-service")
public interface CustomerClient {
    @GetMapping("link")
    void link();
}
