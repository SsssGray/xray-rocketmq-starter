package com.xray.producer.impl;

import com.xray.producer.MqProducer;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;

/**
 * @author gyy
 * @date 2020/10/9 2:29 下午
 */
public class MqProducerImpl implements MqProducer {

    private DefaultMQProducer defaultMQProducer;

    public MqProducerImpl(DefaultMQProducer defaultMQProducer) {
        this.defaultMQProducer = defaultMQProducer;
    }

    @Override
    public void send(String msg, String topic, String tag) throws Exception {
        Message message = new Message(topic, tag, msg.getBytes());
        defaultMQProducer.send(message);
    }
}
