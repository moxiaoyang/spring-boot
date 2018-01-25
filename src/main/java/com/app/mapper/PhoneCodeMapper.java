package com.app.mapper;

import com.app.model.PhoneCode;
import org.apache.ibatis.annotations.Param;

/**
 * @author 莫小阳
 */
public interface PhoneCodeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(PhoneCode record);

    int insertSelective(PhoneCode record);

    /**
     * 根据ID查询数据
     *
     * @param id 数据ID
     * @return 结果
     */
    PhoneCode selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(PhoneCode record);

    int updateByPrimaryKey(PhoneCode record);

    String  queryPhoneByCode(String code);

}