# spring-boot-demo
Demo for springboot or spring cloud.
主分支为 spring-cloud-alibaba-sleuth-zipkin

## 基础调用说明
- 服务入口：订单为入口服务，间接调用 customer merchant order product service
- 服务访问路径：每个服务均存在 link 路径访问，例如商户服务 http://127.0.0.1:8101/link。访问后后台会打印访问信息
- 服务端口：每个服务端口不通，可查看bootstrap.yml

## spring-cloud-alibaba-skywalking
https://github.com/walkwolf/spring-boot-demo/tree/spring-cloud-alibaba-skywalking

## spring-cloud-alibaba-sleuth-zipkin
https://github.com/walkwolf/spring-boot-demo/tree/spring-cloud-alibaba-sleuth-zipkin