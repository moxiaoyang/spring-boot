package com.app.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 莫小阳
 */
@Component
@Data
@ConfigurationProperties(prefix = "email")
public class EmailSetting {


    /**
     * 发送邮件用户
     */
    private String sendUserName = "wangdongjiang@aliyun.com";

    /**
     * 发送邮件用户密码
     */
    private String sendUserPwd = "Wdj&19910702";

    /**
     * 邮箱Host
     */
    private String emailHost = "smtp.aliyun.com";

    /**
     * 邮箱Host
     */
    private String emailAuth = "true";
}
