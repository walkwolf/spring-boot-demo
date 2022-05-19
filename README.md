# spring-boot-demo

## main branch
Spring boot with eureka discovery.

## tech list
1. spring boot
2. eureka server
3. openfeign

## step
1. start eureka-server, open the web console http://localhost:8761/
2. start customer,merchant,product,order service
3. `curl http://localhost:8102/link` for test

## service overview
- order service invoke customer,merchant,product service
- every service has same test url: http://localhost:{port}/link

## all service overview in branch
### spring-boot-eureka-discovery
https://github.com/walkwolf/spring-boot-demo/tree/spring-boot-eureka-discovery

### spring-boot-nacos-discovery
https://github.com/walkwolf/spring-boot-demo/tree/spring-boot-nacos-discovery

### spring-boot-gateway-eureka-discovery
https://github.com/walkwolf/spring-boot-demo/tree/spring-boot-gateway-eureka-discovery

### spring-boot-gateway-nacos-discovery
https://github.com/walkwolf/spring-boot-demo/tree/spring-boot-gateway-nacos-discovery

### spring-boot-skywalking-nacos-discovery
https://github.com/walkwolf/spring-boot-demo/tree/spring-boot-skywalking-nacos-discovery

### spring-boot-zipkin-nacos-discovery
https://github.com/walkwolf/spring-boot-demo/tree/spring-boot-zipkin-nacos-discovery

