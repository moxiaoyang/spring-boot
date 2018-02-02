package com.app.util;

import com.app.constant.Constant;
import org.junit.Test;

public class HttpUtilTest {

    @Test
    public void testHttp() {
        String url = "http://mdfm.eastmoney.com/EM_UBG_MinuteApi/Js/Get?dtype=25&style=tail&check=st&dtformat=HH:mm:ss&cb=jQuery1830254413040714738_1517553649753&id=6000221&num=10&_=1517553709777";
        String contentByGet = HttpUtil.getContentByGet(url, Constant.GBK);
        System.out.println(contentByGet);
    }


}