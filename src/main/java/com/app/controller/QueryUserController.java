package com.app.controller;

import com.app.log.LogId;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 查询用户Controller
 * <p>
 * 1.
 * </p>
 *
 * @author 莫小阳
 * @version 1.0.0
 * @date 2018/1/24 0024
 */
@RequestMapping("/user/")
@RestController
@Slf4j
public class QueryUserController {

    @RequestMapping(value = "queryUser",produces = {"application/json;charset=UTF-8"})
    public String queryUser() {
        MDC.put("TRACE_LOG_ID", LogId.getLogId());
        log.info("call 哈哈哈哈");
        return "张三";
    }

    @RequestMapping("queryUser1")
    public String queryUser1() {
        MDC.put("TRACE_LOG_ID", LogId.getLogId());
        log.info("call 哈哈哈哈");
        return "张三1";
    }
}
