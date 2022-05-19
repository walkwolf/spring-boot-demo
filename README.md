# spring-boot-demo

Spring boot distributed tracing with skywalking and nacos discovery.

tech list
1. spring boot
2. nacos discovery
3. openfeign
4. skywalking


step
3. install and start Nacos
4. install and start SkyWalking
5. download SkyWalking java agent
6. config idea application vm option and start service
7. `curl http://localhost:8102/link` for test 

## Nacos(1.4.2)
1. download: https://github.com/alibaba/nacos/releases
2. run: `startup.cmd -m standalone`
3. web access: http://localhost:8848/nacos  user/password:nacos/nacos

## SkyWalking(9.0.0)
1. download: https://skywalking.apache.org/downloads
2. run `startup.bat`
3. web access: http://localhost:8080

After start SkyWalking(use .bat file), there ware two window appear(Skywalking-Webapp and Skywalking-Collector),

## SkyWalking java agent(8.10.0)
1. download: https://skywalking.apache.org/downloads/


### config idea application vm options
#### service customer
```
-javaagent:C:\Users\Administrator\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=customerService -Dskywalking.collector.backend_service=localhost:11800
```

#### service merchant
```
-javaagent:C:\Users\Administrator\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=merchantService -Dskywalking.collector.backend_service=localhost:11800
```

#### service product
```
-javaagent:C:\Users\Administrator\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=productService -Dskywalking.collector.backend_service=localhost:11800
```

#### service order
```
-javaagent:C:\Users\Administrator\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=orderService -Dskywalking.collector.backend_service=localhost:11800
```