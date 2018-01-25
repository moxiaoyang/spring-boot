package com.app.mapper;

import com.app.log.LogId;
import com.app.model.RedisSettings;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class PhoneCodeMapperTest extends BaseTest {

    @Autowired
    private RedisSettings redisSettings;

    public void test_01() {
        MDC.put(LogId.TRACE_LOG_ID, LogId.getLogId());
        log.info("call 映射数据：{}", redisSettings);
    }


}