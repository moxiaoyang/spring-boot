package com.app.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.app.constant.Constant;
import com.app.constant.NumberConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
public final class HttpUtil {

    private HttpUtil() {
    }


    /**
     * @param url      请求地址
     * @param encoding 编码格式
     * @return 结果
     */
    public static String getContentByGet(String url, String encoding) {
        String result = "";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet request = new HttpGet(url);
            HttpResponse response = httpClient.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                result = EntityUtils.toString(response.getEntity(), encoding);
            }
        } catch (Exception e) {
            log.error("call http get 请求异常，{}", e);
        } finally {
            try {
                httpClient.close();
            } catch (Exception e) {
                log.error("call httpClient 关闭失败：{}", e);
            }
        }
        return result;
    }


    /**
     * Post方式 得到JSONObject
     *
     * @param paramsHashMap post参数
     * @param url           请求URL
     * @param encoding      编码utf-8
     * @return 结果
     */
    public static String getContentByPost(Map<String, String> paramsHashMap, String url, String encoding) {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        String result = null;
        List<NameValuePair> nameValuePairArrayList = new ArrayList<>();
        if (paramsHashMap != null && !paramsHashMap.isEmpty()) {
            for (Map.Entry<String, String> entry : paramsHashMap.entrySet()) {
                nameValuePairArrayList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }
        UrlEncodedFormEntity entity;
        try {
            entity = new UrlEncodedFormEntity(nameValuePairArrayList, encoding);
            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(entity);
            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            log.info("请求返回状态码：{}", httpResponse.getStatusLine().getStatusCode());
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                result = EntityUtils.toString(httpEntity, Constant.UTF8);
            }
        } catch (Exception e) {
            log.error("call http post 请求异常，{}", e);
        } finally {
            try {
                httpClient.close();
            } catch (Exception e) {
                log.error("call httpClient 关闭失败：{}", e);
            }
        }
        return result;
    }


}
