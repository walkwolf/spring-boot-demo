# spring-boot-demo

Demo for springboot or spring cloud.

spring-cloud-alibaba-skywalking

## Nacos(1.4.2)
- 下载 https://github.com/alibaba/nacos/releases
- 运行 startup.cmd -m standalone
- 访问 http://127.0.0.1:8848/nacos  密码nacos/nacos

## SkyWalking(9.0.0)
- 下载 https://skywalking.apache.org/downloads
- 运行 startup.bat
- 访问 http://127.0.0.1:8080

启动后 运行两个cmd窗口 Skywalking-Webapp Skywalking-Collector

## SkyWalking java agent(8.10.0)
- 下载 https://skywalking.apache.org/downloads/


### idea application vm options
#### service customer
```
-javaagent:C:\Users\Administrator\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=customerService -Dskywalking.collector.backend_service=127.0.0.1:11800
```

#### service merchant
```
-javaagent:C:\Users\Administrator\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=merchantService -Dskywalking.collector.backend_service=127.0.0.1:11800
```

#### service product
```
-javaagent:C:\Users\Administrator\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=productService -Dskywalking.collector.backend_service=127.0.0.1:11800
```

#### service order
```
-javaagent:C:\Users\Administrator\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=orderService -Dskywalking.collector.backend_service=127.0.0.1:11800
```