package com.app.interfaces;

/**
 * @author 莫小阳
 */
public interface ShareInfoEmailService {

    /**
     * 发送股票信息邮件
     *
     * @param traceLogId 日志ID
     */
    void sendShareInfoEmail(String traceLogId);
}
