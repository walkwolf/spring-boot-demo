package cn.exev.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.exev.order.client.CustomerClient;
import cn.exev.order.client.MerchantClient;
import cn.exev.order.client.ProductClient;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final CustomerClient customerClient;
    private final MerchantClient merchantClient;
    private final ProductClient productClient;

    @GetMapping("link")
    String link() {
        // invoke product service
        productClient.link();
        // invoke merchant service
        merchantClient.link();
        // invoke customer service
        customerClient.link();
        return "success";
    }
}
