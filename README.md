# spring-boot-demo
spring-cloud-alibaba-sleuth-zipkin

Spring boot distributed tracing with zipkin and nacos discovery.

tech list
1. spring boot
2. nacos discovery
3. openfeign
4. zipkin
5. sleuth

step
1. install and start Nacos
2. install and start zipkin
3. start customer-service merchant-service product-service
4. `curl http://localhost:8102/link` for test

## Nacos(1.4.2)
1. download https://github.com/alibaba/nacos/releases
2. run `startup.cmd -m standalone`
3. web access: http://localhost:8848/nacos  user/password:nacos/nacos

## Zipkin(2.23.16)
1. download https://zipkin.io/pages/quickstart.html latest release
2. run `java -jar zipkin-server-2.23.16-exec.jar`
3. web access: http://localhost:9411/

