package com.app.log;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * 生成日志ID
 * <p>
 * 1.
 * </p>
 *
 * @author 莫小阳
 * @version 1.0.0
 * @date 2018/1/24 0024
 */
public class TraceLogIdConvert extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent event) {
        try {
            return event.getMDCPropertyMap().get("TRACE_LOG_ID");
        } catch (Exception var3) {
            return "get mdc property error";
        }
    }
}
