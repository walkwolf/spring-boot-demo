package cn.exev.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product-service")
public interface ProductClient {
    @GetMapping("link")
    void link();
}
