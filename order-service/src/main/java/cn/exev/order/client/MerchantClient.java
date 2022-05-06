package cn.exev.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("merchant-service")
public interface MerchantClient {
    @GetMapping("link")
    void link();
}
