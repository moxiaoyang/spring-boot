package com.app.model;

import lombok.Data;

/**
 * 股票信息
 * <p>
 * 1.
 * </p>
 *
 * @author 莫小阳
 * @version 1.0.0
 * @date 2018/2/2 0002
 */
@Data
public class ShareInfo {

    /**
     * 股票代码
     */
    private String code;

    /**
     * 股票名称
     */
    private String shareName;

    /**
     * 股票价格
     */
    private String price;

}
