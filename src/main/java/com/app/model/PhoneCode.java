package com.app.model;

import lombok.Data;

import java.util.Date;

/**
 * @author 莫小阳
 */
@Data
public class PhoneCode {

    private Long id;

    private String phoneNumber;

    private String reqIp;

    private Date createTime;


}