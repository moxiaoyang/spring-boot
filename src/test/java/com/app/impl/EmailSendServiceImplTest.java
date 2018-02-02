package com.app.impl;

import com.app.interfaces.EmailSendService;
import com.app.mapper.BaseTest;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmailSendServiceImplTest extends BaseTest{

    @Autowired
    private EmailSendService emailSendService;

    @Test
    public void sendMsg() {

        List<String> mailAddressTO = Lists.newArrayList();
        mailAddressTO.add("moxiaoyang@baofu.com");
        emailSendService.sendMsg("test", mailAddressTO, null, null, null, "打断点", null, null, null);

    }
}