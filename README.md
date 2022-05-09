# spring-boot-demo
Demo for springboot or spring cloud.

spring-cloud-eureka
1. start eureka-server, open the web console http://localhost:8761/
2. start customer,merchant,product,order service
3. `curl http://localhost:8102/link` for test

## service overview
- order service invoke customer,merchant,product service
- every service has same test url: http://localhost:{port}/link

## spring-cloud-alibaba-skywalking
https://github.com/walkwolf/spring-boot-demo/tree/spring-cloud-alibaba-skywalking

## spring-cloud-alibaba-sleuth-zipkin
https://github.com/walkwolf/spring-boot-demo/tree/spring-cloud-alibaba-sleuth-zipkin

## spring-cloud-eureka-feign
https://github.com/walkwolf/spring-boot-demo/tree/spring-cloud-eureka-feign

## spring-cloud-gateway-eureka
https://github.com/walkwolf/spring-boot-demo/tree/spring-cloud-gateway-eureka
