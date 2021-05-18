# yotta-guard
![Image text](https://raw.github.com/jingchaoqi/yotta-guard/master/img-files/Yotta-Guard-Logo.png)

Visualized monitor system for Knowledge Forest System (as known as Yotta), based on springboot admin.

搭配Yotta知识森林系统使用的可视化监控系统，基于springboot admin及其相关包实现。

See https://github.com/jingchaoqi/yotta-guard for code, co-opration and more information.

请至 https://github.com/jingchaoqi/yotta-guard 寻找代码、进行协作及获取更多信息。



## Configuration / 配置

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

If you are a member of XJTU E-Learning Team, please ask me directly for this config file. : )

如果您是西安交大知识处理小组成员，请直接联系我获取此配置文件。: )



## Instruction / 使用

- Run Yotta-Guard first, and then run the Yotta client to be monitored (the Yotta-Guard instance and the Yotta client instance should have been well prepered by following the configuration above). 首先运行Yotta-Guard，然后运行待被监控的客户端（此Yotta-Guard和Yotta客户端应当已经按照上面的配置说明配置完毕）。

- Open your browser, visit `localhost:port of the Yotta-Guard`. 打开您的浏览器，访问`localhost:port of the Yotta-Guard` 。

![img](https://raw.github.com/jingchaoqi/yotta-guard/master/img-files/Yotta-Guard-Page.png)

- Click `Details` to get all provided information, for example, JVM, database, disk usage, threads and etc. 点击  `Details` 获得所有提供的信息，例如JVM、数据库、硬盘使用、线程等等。



## Extras / 更多功能

### E-mail Alert / 邮件告警

- When the backend server's state changes from UP to DOWN or DOWN to UP, an E-mail will be sent to all members involved in.
- 当后端服务器的状态从「上线」变为「掉线」或从「掉线」变为「上线」时，所有相关人员将收到一封邮件告警。 



- If you what this spec, make sure the associated configuration is right.
- 如果想要使用此功能，请确保配置是正确的。



## About / 关于

Jingchao Qi

Xi'an Jiaotong University

Department of Computer Science and Technology

------

*Action speaks louder than words.*

*心有所向，日复一日，必有精进。*