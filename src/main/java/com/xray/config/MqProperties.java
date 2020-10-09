package com.xray.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author gyy
 * @date 2020/9/29 5:45 下午
 */
@ConfigurationProperties(prefix=MqProperties.PREFIX)
@Data
public class MqProperties {
    public static final String PREFIX = "mq";

    private String nameServerAddr;

    private String producerGroup;
}
