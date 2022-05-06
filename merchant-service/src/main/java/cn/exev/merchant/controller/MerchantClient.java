package cn.exev.merchant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantClient {
    @GetMapping("link")
    public void link() {
        System.out.println(this.getClass().getName() + " link test.");
    }
}
