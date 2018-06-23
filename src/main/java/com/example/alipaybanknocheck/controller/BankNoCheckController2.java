package com.example.alipaybanknocheck.controller;

import com.example.alipaybanknocheck.common.Config;
import com.example.alipaybanknocheck.common.Config2;
import com.example.alipaybanknocheck.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  Jello
 * @create  2018/6/23 15:09
 * @desc    银行卡四要素实名认证数据请求层
 **/

@Controller
public class BankNoCheckController2 {
    Logger logger = LoggerFactory.getLogger(BankNoCheckController2.class);

    @GetMapping("/queryBankNoCheck2")
    @ResponseBody
    public String queryBankNoCheck(){
        Map<String, String> headers = new HashMap<String, String>(16);
        //在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization","APPCODE " + Config2.appCode);
        Map<String, String> querys = new HashMap<String, String>(16);
//        querys.put("acct_name", "王晓顺");
//        querys.put("acct_pan", "6217002430009088700");
//        querys.put("cert_id", "41152219930312665x");
//        querys.put("cert_type", "01");
//        querys.put("needBelongArea", "true");
//        querys.put("phone_num", "15249676970");

        querys.put("acct_name", "胡志俊");
        querys.put("acct_pan", "6228480718824843178");
        querys.put("cert_id", "350823199402161018");
        querys.put("cert_type", "01");
        querys.put("needBelongArea", "true");
        querys.put("phone_num", "18839797530");

        try {
            HttpResponse response = HttpUtils.doGet(Config2.host, Config2.path, Config2.method, headers, querys);
            return EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            logger.info("银行卡四要素实名认证数据请求层异常" + e.getMessage());
            return null;
        }
    }

}


