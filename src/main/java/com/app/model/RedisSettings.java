package com.app.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * yaml自动配置属性
 * <p>
 * 1.
 * </p>
 *
 * @author 莫小阳
 * @version 1.0.0
 * @date 2018/1/25 0025
 */
@Component
@Data
@ConfigurationProperties(prefix = "redis")
public class RedisSettings {
    private List<String> host;
    private int port;
    private int timeout;
}
