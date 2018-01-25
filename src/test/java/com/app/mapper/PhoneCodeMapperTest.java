package com.app.mapper;

import com.app.model.PhoneCode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PhoneCodeMapperTest extends BaseTest{

    @Autowired
    private PhoneCodeMapper phoneCodeMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        PhoneCode phoneCode = phoneCodeMapper.selectByPrimaryKey(1L);
        System.out.println(phoneCode);
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}