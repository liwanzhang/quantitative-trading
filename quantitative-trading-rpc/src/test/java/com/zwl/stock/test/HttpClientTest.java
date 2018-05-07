package com.zwl.stock.test;

import com.zwl.stock.rpc.util.HttpClientUtils;
import org.junit.Test;

/**
 * @author zhangwanli
 * @description
 * @date 2018-05-04 下午2:42
 */
public class HttpClientTest {

    @Test
    public void doGetTest() {
        String url = "http://hq.sinajs.cn/list=sh601006";
        HttpClientUtils.doGet(url);
    }

}
