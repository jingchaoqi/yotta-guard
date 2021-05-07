# yotta-guard
Visualized monitor system for Knowledge Forest System (as known as Yotta), based on springboot admin.

搭配Yotta知识森林系统使用的可视化监控系统，基于springboot admin及其相关包实现。



## 使用说明

- add dependency for the clients to be monitored. 为被监控的springboot客户端配置client依赖。

```xml
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-client</artifactId>
    <version>1.5.7</version>
</dependency>
```

- add arguments for the clients to be monitored in `application.properties`. 为被监控的springboot客户端配置admin相关参数。

```java
spring.boot.admin.url=yotta-guard所在地址
spring.boot.admin.client.name=yotta实例名称
management.security.enabled=false
```

For the safety of our yotta project, our  `application.properties` will not be public, please make sure your own config file works.

注意，为了安全起见，`application.properties`文件并不会被公开在git中，需要自行配置。



## 关于作者

Jingchao Qi

Xi'an Jiaotong University

Department of Computer Science and Technology

------

*Action speaks louder than words.*

*心有所向，日复一日，必有精进。*