package com.app.util;

import com.app.constant.Constant;
import com.app.model.ShareInfo;
import org.assertj.core.util.Maps;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HttpUtilTest {
    @Test
    public void testHttp() {
        String url = "http://nufm.dfcfw.com/EM_Finance2014NumericApplication/JS.aspx?type=CT&cmd=C._A&sty=FCOIATA&sortType=(Code)&sortRule=1&page=1&pageSize=1000000000&" +
                "js=var%2520VnODumYu=%257Brank:[(x)],pages:(pc),total:(tot)%257D&token=7bc05d0d4c3c22ef9fca8c2a912d779c&jsName=quote_123&_g=0.628606915911589&_=1517561168627";
        String content = HttpUtil.getContentByGet(url, Constant.GBK);

        content = content.substring(content.indexOf("[") + 2, content.indexOf("]") - 1);
        String[] split = content.split("\",\"");
        List<String> list = Arrays.asList(split);
        ShareInfo shareInfo = new ShareInfo();
        for (String s : list) {
            String[] split1 = s.split(",");
            if ("600784".equals(split1[1])) {
                shareInfo.setCode(split1[1]);
                shareInfo.setShareName(split1[2]);
                shareInfo.setPrice(split1[3]);
            }
        }


        System.out.println(list);
    }


}