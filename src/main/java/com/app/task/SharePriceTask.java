package com.app.task;

import com.app.constant.Constant;
import com.app.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;

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

    @Scheduled(cron = "*/5 * * * * ?")
    public void getToken() {

        String url = "http://nufm.dfcfw.com/EM_Finance2014NumericApplication/JS.aspx?type=CT&cmd=C._A&sty=FCOIATA&sortType=(Code)&sortRule=1&page=1&pageSize=1000000000&" +
                "js=var%2520VnODumYu=%257Brank:[(x)],pages:(pc),total:(tot)%257D&token=7bc05d0d4c3c22ef9fca8c2a912d779c&jsName=quote_123&_g=0.628606915911589&_=1517561168627";
        String content = HttpUtil.getContentByGet(url, Constant.GBK);
        if (StringUtils.isEmpty(content)) {
            throw new RuntimeException("获取数据为空");
        }
        content = content.substring(content.indexOf("[") + 1, content.indexOf("]"));

        System.out.println(content);
    }

}
