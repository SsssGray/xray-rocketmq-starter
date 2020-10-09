package com.xray.consumer;

/**
 * @author gyy
 * @date 2020/10/9 9:37 上午
 */
public interface MqConsumerListener {
    void consume(String msg);
}
