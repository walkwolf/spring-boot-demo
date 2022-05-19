# spring-boot-demo

Spring boot with spring cloud gateway and nacos discovery.

tech list
1. spring boot
2. spring cloud gateway
3. nacos discovery
4. nacos config
5. openfeign

step
1. install and start Nacos
2. start gateway-server
3. start customer-service, merchant-service,order-service,product-service
4. add gateway config through nacos web console
5. `curl http://localhost:8080/order/link` for test

## Nacos(1.4.2)
1. download: https://github.com/alibaba/nacos/releases
2. run: `startup.cmd -m standalone`
3. web access: http://localhost:8848/nacos  user/password:nacos/nacos

### add gateway config through nacos web console
1. open http://localhost:8848/nacos
2. ConfigManagement -> Configurations add

```
Data ID: gateway-server
Format: YAML
```
Configuration Content:
```yaml
spring:
  cloud:
    gateway:
      discovery:
        locator:
          enabled: true
        lower-case-service-id: true
      routes:
        - id: order_route
          uri: lb://order-service
          predicates:
            - Path=/order/**
          filters:
            - StripPrefix=1
```

TODO
1. do not register gateway service on nacos

