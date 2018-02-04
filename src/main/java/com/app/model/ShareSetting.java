package com.app.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 莫小阳
 */
@Component
@Data
@ConfigurationProperties(prefix = "share")
public class ShareSetting {

    private List<String> code;

    private List<String> mailAddressTO;

    private String url;

}
