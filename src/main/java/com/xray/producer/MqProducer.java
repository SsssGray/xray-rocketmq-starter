package com.xray.producer;

/**
 * @author gyy
 * @date 2020/10/9 2:28 下午
 */
public interface MqProducer {

    void send(String msg, String topic, String tag) throws Exception;
}
