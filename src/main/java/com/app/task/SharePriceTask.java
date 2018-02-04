package com.app.task;

import com.app.constant.Constant;
import com.app.interfaces.ShareInfoEmailService;
import com.app.log.LogId;
import com.app.model.ShareInfo;
import com.app.util.HttpUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 1.
 * </p>
 *
 * @author 莫小阳
 * @version 1.0.0
 * @date 2018/2/2 0002
 */
@Slf4j
@Configuration
@EnableScheduling
public class SharePriceTask {


    /**
     * 发送股票信息服务
     */
    @Autowired
    private ShareInfoEmailService shareInfoEmailService;

    @Scheduled(cron = "*/5 * * * * ?")
    public void getToken() {
        log.info("call 开始发送股票信息···");
        try {
            shareInfoEmailService.sendShareInfoEmail(MDC.get(LogId.getLogId()));
        } catch (Exception e) {
            log.error("call 发送股票信息异常：{}", e);
        }
        log.info("call 发送股票信息结束···");
    }

}
