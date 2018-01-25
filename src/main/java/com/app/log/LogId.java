package com.app.log;

import java.util.UUID;

/**
 * 获取logId
 * <p>
 * 1.
 * </p>
 *
 * @author 莫小阳
 * @version 1.0.0
 * @date 2018/1/24 0024
 */
public final class LogId {

    public static final String TRACE_LOG_ID = "TRACE_LOG_ID";

    private LogId() {
    }

    public static String getLogId() {
        return UUID.randomUUID().toString();
    }

}
