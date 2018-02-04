package com.app.constant;

/**
 * <p>
 * 1.
 * </p>
 *
 * @author 莫小阳
 * @version 1.0.0
 * @date 2018/2/2 0002
 */
public class Constant {

    /**
     * 24小时制：yyyy-MM-dd HH:mm:ss
     */
    public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

    /**
     * UTF-8编码格式
     */
    public static final String UTF8 = "UTF-8";

    /**
     * GBK编码格式
     */
    public static final String GBK = "GBK";

    /**
     * 股票  tr
     */
    public static final String SHARE_TR = "<tr>\n" +
            "<td width=\"100px\" height=\"30px;\"><font color=\"red\">${code}</font></td>\n" +
            "<td width=\"100px\" height=\"30px;\"><font color=\"red\">${name}</font></td>\n" +
            "<td width=\"100px\" height=\"30px;\"><font color=\"red\">${price}</font></td>\n" +
            "<td width=\"100px\" height=\"30px;\"><font color=\"red\">${value}</font></td>\n" +
            "</tr>";

    /**
     * 股票信息模板
     */
    public static final String SHARE_HTML = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>股票价格</title>\n" +
            "</head>\n" +
            "<body bgcolor=\"#fff8dc\">\n" +
            "<center>\n" +
            "    <br>\n" +
            "    <div><font size=\"4px\" color=\"red\"><b>${date} 股票排行榜</b></font></div>\n" +
            "    <br>\n" +
            "    <table cellspacing=\"0\" border=\"1\"\n" +
            "           style=\"border-collapse:collapse;text-align: center;background-color: #7aff51;font-weight: 400;font-family: SimSun;font-size: 16px;color: #544cff\">\n" +
            "        <tr>\n" +
            "            <th width=\"100px\" height=\"30px;\">代码</th>\n" +
            "            <th width=\"100px\">名称</th>\n" +
            "            <th width=\"100px\">最新价</th>\n" +
            "            <th width=\"100px\">涨额</th>\n" +
            "        </tr>\n" +
            "        ${info}\n" +
            "    </table>\n" +
            "</center>\n" +
            "</body>\n" +
            "</html>";

}
