package com.xray.annotation;

import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author gyy
 * @date 2020/9/29 5:45 下午
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MqConsumer {
    String consumerGroup();

    ConsumeFromWhere consumeFromWhere() default ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET;

    String topic();

    String tag();
}
