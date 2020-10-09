# 简易版rocketMq-starter

## 使用方法
pom文件加入依赖
```
        <dependency>
            <groupId>com.xray</groupId>
            <artifactId>xray-rocketmq-starter</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```
application.yml

```
mq:
  #自己的rocketmq服务器地址
  name-server-addr: 127.0.0.1:9876
  #生产者组
  producer-group: my_test_group
```

## 生产者使用demo

```
@RestController
@RequestMapping("mq")
public class PayController {

    @Autowired
    private MqProducer mqProducer;

    @RequestMapping("/send")
    public Object callback(String text) {
        try {
            mqProducer.send(text,"gyy","gyy");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new HashMap<>();
    }
}
```


## 消费者使用demo

```
@MqConsumer(consumerGroup = "my_consumer",topic = "gyy",tag = "*",consumeFromWhere = ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET)
public class PayConsumer implements MqConsumerListener {
    
    @Override
    public void consume(String msg) {
        System.out.println(msg);
    }
}
```



