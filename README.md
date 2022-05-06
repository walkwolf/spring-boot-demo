# spring-boot-demo
Demo for springboot or spring cloud.
主分支为 spring-cloud-alibaba-sleuth-zipkin

基础调用
订单为入口服务，间接调用 customer merchant order product service
每个服务均存在 link 路径访问，例如商户服务 http://127.0.0.1:8101/link。访问后后台会打印访问信息
每个服务端口不通，可查看bootstrap.yml

## spring-cloud-alibaba-skywalking
https://github.com/walkwolf/spring-boot-demo/tree/spring-cloud-alibaba-skywalking

## spring-cloud-alibaba-sleuth-zipkin
https://github.com/walkwolf/spring-boot-demo/tree/spring-cloud-alibaba-sleuth-zipkin